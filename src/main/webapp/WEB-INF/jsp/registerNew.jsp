<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
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
   		<div class="well">
      <form id="signup" class="form-horizontal">
		<legend>Sign Up</legend>
		<div class="control-group">
	        <label class="control-label">First Name</label>
			<div class="controls">
			    <div class="input-prepend">
					<span class="add-on"><i class="icon-user"></i></span>
					<input type="text" class="input-xlarge" id="fname" name="fname" placeholder="First Name">
				</div>
				<span class="add-on hidden" id="fnamelabel"></span>
			</div>
		</div>
		<div class="control-group ">
	        <label class="control-label">Last Name</label>
			<div class="controls">
			    <div class="input-prepend">
					<span class="add-on"><i class="icon-user"></i></span>
					<input type="text" class="input-xlarge" id="lname" name="lname" placeholder="Last Name">
				</div>
				<span class="add-on hidden" id="lnamelabel"></span>
			</div>
		</div>
		<div class="control-group ">
	        <label class="control-label">Username</label>
			<div class="controls">
			    <div class="input-prepend">
					<span class="add-on"><i class="icon-user"></i></span>
					<input type="text" class="input-xlarge" id="username" name="username" placeholder="Username">
				</div>
				<span class="add-on hidden" id="userlabel"></span>
			</div>
		</div>
		<div class="control-group">
	        <label class="control-label">Email</label>
			<div class="controls">
			    <div class="input-prepend">
					<span class="add-on"><i class="icon-envelope"></i></span>
					<input type="text" class="input-xlarge" id="email" name="email" placeholder="Email">
				</div>
				<span class="add-on hidden" id="maillabel"></span>
			</div>
		</div>
		<div class="control-group">
	        <label class="control-label">Gender</label>
			<div class="controls">

					<p><div id="gender" name="gender" class="btn-group" data-toggle="buttons-radio">
                    <button id="male" type="button" class="btn btn-info">Male</button>
                    <button id="female" type="button" class="btn btn-info">Female</button>

                  </div></p>

			</div>
		</div>
		<div class="control-group">
	        <label class="control-label">Password</label>
			<div class="controls">
			    <div class="input-prepend">
					<span class="add-on"><i class="icon-lock"></i></span>
					<input type="Password" id="password" class="input-xlarge" name="password" placeholder="Password">
				</div>
				<span class="add-on hidden" id="passlabel"></span>
			</div>
		</div>
		<div class="control-group">
	        <label class="control-label">Confirm Password</label>
			<div class="controls">
			    <div class="input-prepend">
					<span class="add-on"><i class="icon-lock"></i></span>
					<input type="Password" id="cpassword" class="input-xlarge" name="cpassword" placeholder="Re-enter Password">
				</div>
				<span class="add-on hidden" id="cpasslabel"></span>
			</div>
		</div>

		<div class="control-group">
		<label class="control-label"></label>
	      <div class="controls">
	       <input type="button" id="signBtn" type="submit" class="btn btn-success" value="submit">	       <!-- <button id="signBtn" class="btn btn-success">Register</button> -->
	      </div>

	</div>

	  </form>

   </div>
  	</div>
</body>