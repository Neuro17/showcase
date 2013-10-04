$(document).ready(function(){
	var $emailSignUp = $('#email'),
		$username = $('#username'),
		$signBtn = $('#signBtn'),
		$password = $('#password'),
		$cpassword = $('#cpassword'),
		$fName = $('#fname'),
		$lName = $('#lname'),
		emailRegEx = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i,
		mailErr = userErr = null,
		gen = "";

	$username.on('blur', function(){
		var label = $('#userlabel');
		checkUser()
		.done(function(r) {
			if(r){
				userErr = true;
				label.removeClass("hidden");
				label.text("This username already exist");
			}
			else {
				userErr = false;
				label.addClass("hidden");
			}
		});

	});
	
	$emailSignUp.on('blur', function(){
		var label = $('#maillabel');
		checkMail()
		.done(function(r) {
			if(r){
				mailErr = true;
				label.removeClass("hidden");
				label.text("This mail already exist");
			}
			else{ 
				mailErr = false;
				label.addClass("hidden");
			}
		});
	});
		
	$signBtn.on('click', function(){		
		var user = $.trim($username.val()),
			email = $.trim($emailSignUp.val()),
			password = $.trim($password.val()),
			cpassword = $.trim($cpassword.val()),
			fname = $.trim($fName.val()),
			lname = $.trim($lName.val());
		
		if($('#male').hasClass('active'))
			gen = "M";
		else if($('#female').hasClass('active'))
			gen = "F";
		
		if(validateForm(fname, lname, user, email, password, cpassword) && !mailErr && !userErr){
			registerNewUser()
			.done(function(r){
				if(r){
					window.location.replace("home"); //reindirizza alla home
				}
			})
			.fail(function(){
				//TODO
			});
		}
		if(mailErr)
			$('#maillabel').removeClass("hidden");
		if(userErr)
			$('#userlabel').removeClass("hidden");
	});
	
	function checkUser() {
	    return $.ajax({
	        url: 'existUsername',
	        data: {
	            username: $username.val()
	        },
	        type: 'GET',
	        dataType: 'json'
	    });
	}
	
	function checkMail() {
	    return $.ajax({
	        url: 'existMail',
	        data: {
	            mail: $emailSignUp.val()
	        },
	        type: 'GET',
	        dataType: 'json'
	    });
	}
	
	function registerNewUser() {
	    return $.ajax({
	    	url: 'request/newUser',
	        data: {
	        	username: $username.val(),
				email: $emailSignUp.val(),
				password: $password.val(),
				fname: $fName.val(),
				lname: $lName.val(),
				gender: gen,
	        },
	        type: 'POST',
	        dataType: 'json',
	    });
	}
	
	function isEmpty(field, name){
		var label = $("#" + name + "label");
		if(field.length === 0){
			label.removeClass("hidden");
			label.text("This field is required");
		}
		else 
			label.addClass("hidden");
		return field.length === 0; 
	}
	
	function isEmail(mail, name){
		var label = $("#" + name + "label");
		if(mail.search(emailRegEx) == -1){
			label.removeClass("hidden");
			label.text("Insert valid email address");
		}
		else 
			label.addClass("hidden");
		return mail.search(emailRegEx) !== -1;
	}
	
	function isEqual(field1, field2, name){
		var label = $("#" + name + "label");
		if(field1 != field2){
			label.removeClass("hidden");
			label.text("Password must match");
		}
		else 
			label.addClass("hidden");
		return field1 === field2;
	}
	
	function validateForm(fname, lname, user, email, password, cpassword){
		return !isEmpty(fname, "fname") && !isEmpty(lname, "lname") && !isEmpty(user, "user") && !isEmpty(email, "mail") && isEmail(email, "mail") && !isEmpty(password, "pass") && !isEmpty(cpassword, "cpass") && isEqual(password, cpassword, "cpass");
	}
});