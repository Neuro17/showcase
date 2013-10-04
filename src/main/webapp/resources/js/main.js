var jq = jQuery.noConflict();

function startSlider(){
	jq('.carousel').carousel({  
		  interval: 3000
	});
}

function switchLang(caller){
	var currentLocation, href, newLocation;
	currentLocation = window.location.href;
	if((currentLocation.indexOf("it") > 0 && caller == "it") || (currentLocation.indexOf("en") > 0 && caller == "en")) 
		return;
	else {
		if(currentLocation.indexOf("it") > 0 && caller == "en"){
			newLocation = "?language=en";
		}
		else if(currentLocation.indexOf("en") > 0 && caller == "it"){
			newLocation = "?language=it";
		}
		else if(caller == "it")
			newLocation = "?language=it";
		else
			newLocation = "?language=en";
		href = currentLocation.split('?');
		currentLocation = href[0];
		window.location.assign(currentLocation + newLocation);
	} 
};

function refreshActiveClass(){
	var navbar = ['#home', '#about', '#servizi', '#offerte', '#press', '#blog', '#admin', '#usersList'];
	for(var i = 0; i < navbar.length; i++){
		jq(navbar[i]).removeClass('active');
	}
	currentLocation = window.location.href.split('/');
	currentLocation = currentLocation[4].split('?');

	for(i = 0; i < navbar.length; i++){
		nav = navbar[i].split('#');
		if(nav[1] === currentLocation[0]) {
			jq(navbar[i]).addClass('active');
		}
	}
}

function startTwitterConnection(){
	jq('#tweets').tweetable({
		html5: true,
		username: '@BONBOARDsrl',
		limit: 3,
		time: true,
		retweets: true,
//		onComplete:function($ul){
//			jq('time').timeago();
//		}
	});
}

function dataMapFormatting(data){
    var employees = 0;
    for(var i = 0; i < data.length; i++) {
      employees += data[i];
    }
    for(i = 0; i < data.length; i++) {
      var perc = (data[i] / employees * 100).toFixed(0);
      data[i] = perc;
    }

    var BoB_Data = {
		"US": data[0],
		"CA": data[1],
		"RU": data[2],
		"BR": data[3],
		"FR": data[4],
		"DE": data[5],
		"IN": data[6],
	};
    return BoB_Data;
}

function drawMap(data){
	jq('#world-map').vectorMap({
		map: 'world_mill_en',
		series: {
		regions: [{
			values: data,
			scale: ['#C8EEFF', '#0071A4'],
			normalizeFunction: 'polynomial'
		}]
		},
		onRegionLabelShow: function(e, el, code){
			if(data[code] !== undefined) 
				el.html(el.html() + ' - BonBoard employees: ' + data[code] + "%");
		}
	});
}

jq(document).ready(function(){
	var itaBtn = jq('#it');
	var enBtn = jq('#en');
	var data = [30, 50, 70, 40, 60, 20, 120];
	var mapData;
	
	startSlider();
	startTwitterConnection();
	refreshActiveClass();
	mapData = dataMapFormatting(data);
	drawMap(mapData);
	
	itaBtn.click(function(){
		switchLang("it");
	});
	
	enBtn.click(function(){
		switchLang("en");
	});	
	
	var LIMIT = 5, START = 0;
	var lastScrollTop = START, speedUp = START, speedDown = START;
	jq(window).scroll(function(event){
	   var st = jq(this).scrollTop();
	   if (st > lastScrollTop){
		   speedDown++;
		   if(speedDown > LIMIT){
			   jq('.header').slideUp();
			   speedUp = speedDown = START;
		   }
	       
	   } else {
		   speedUp++;
		   if(speedUp > LIMIT){
			   jq('.header').slideDown();
			   speedUp = speedDown = START;
		   }

	   }
	   lastScrollTop = st;
	});
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
