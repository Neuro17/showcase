<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
	<script src="/bonboard/resources/js/bootstrapValidation/jqBootstrapValidation.js"></script>
	<script src="/bonboard/resources/js/vendor/jQuery.js"></script>
	<script src="/bonboard/resources/js/login/registration.js"></script>
	
</head>
<body>
    <!--[if lt IE 7]>
        <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
    <![endif]-->

    <!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->
  <br><br><br>
	<div class="container">
    <form class="form-horizontal" novalidate>
      <div class="control-group">
        <label class="control-label">First name</label>
        <div class="controls">
          <input id="first-name" type="text" name="FirstName" required/>
        </div>

        <label class="control-label">Last name</label>
        <div class="controls">
          <input id="last-name" type="text" name="LastName" required/>
        </div>
        
        <label class="control-label">Username</label>
        <div class="controls">
          <input type="text" name="username" id="usernamesignup" required/>
        </div>    

        <label class="control-label">Email address</label>
        <div class="controls">
          <input type="email" name="email" id="emailsignup" required/> 
          <p class="help-block"></p>
        </div> 

		<label class="control-label">Password</label>
        <div class="controls">
          <input type="password" name="password" id="passwordsignup" required/> 
          <p class="help-block"></p>
        </div> 

        <div class="controls">
          <!-- <button id="signBtn" type="submit" class="btn btn-primary" sourceindex="10">Test Validation <i class="icon-ok icon-white"></i></button> -->
          <button id="signBtn" type="submit" class="btn btn-primary">Test Validation <i class="icon-ok icon-white"></i></button>
        </div>
      </div>

    </form>
  </div>
</body>