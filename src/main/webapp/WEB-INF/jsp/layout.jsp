<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html">
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="stylesheet"  href="/bonboard/resources/css/vendor/bootstrap/bootstrap.min.css" media="screen">
        <link rel="stylesheet" href="/bonboard/resources/css/main.css"> 
        <link rel="stylesheet" href="/bonboard/resources/css/social.css">
		<link rel="stylesheet" href="/bonboard/resources/css/jquery-jvectormap-1.1.1.css" media="screen" />
        <script src="/bonboard/resources/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
	</head>
	<body>
		<div class="row"><tiles:insertAttribute name="header" /></div>
		<div class="row"><tiles:insertAttribute name="body" /></div>
		<div class="row"><tiles:insertAttribute name="footer" /></div>
		
		<div>
			<script src="/bonboard/resources/js/vendor/jQuery.js"></script>
			<script src="/bonboard/resources/js/vendor/bootstrap/bootstrap.min.js"></script>
			<script src="/bonboard/resources/js/vendor/tweetable.jquery.js"></script>
			<script src="/bonboard/resources/js/vendor/jquery-jvectormap-1.2.2.min.js"></script>
			<script src="/bonboard/resources/js/vendor/world-map.js"></script>
			<script src="/bonboard/resources/js/main.js"></script>
		</div>
	</body>
</html>