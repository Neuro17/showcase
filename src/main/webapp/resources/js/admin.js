var jq = jQuery.noConflict();

jq(document).ready(function(){
	function changeAuth(username){
		console.log(username.toString());
	}
});

var user=jq("#user");
var pass=jq("#pass");
var logButton = jq("#logButt");
var logOutButton = jq("#logOutButt");

logOutButton.on('click',function(){
	jq.post("/bonboard/j_spring_security_logout",
			function(data){
		console.log(data);
		 location.reload();
	});
});

logButton.on('click', function(){
	console.log(user.val()+" "+pass.val() );
	jq.post("/bonboard/j_spring_security_check",
			{ 	j_username: user.val() , j_password: pass.val() },
				function(data){
					console.log(data);
					curPage = window.location.href.split("/");
					location.reload();
					if(curPage[4] == "register")
						window.location.assign("http://localhost:8080/bonboard/home");
					
			});
//				$(function() {
//					$.post("request/getUser",
//								
//									function(data){console.log("username returned: "+data);}
//							  	, 'json');
//				});

			});
