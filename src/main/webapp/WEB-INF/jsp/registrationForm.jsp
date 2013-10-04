<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<body>
<div class=container main>
<br><br>
<form:form  method="post" modelAttribute="registrationForm" action="registrationForm"  >

<%-- <table>
  <tbody><tr>
   <td>User Name:<font color="red"><form:errors path="titleEng"></form:errors></font></td>
  </tr>
  <tr>
   <td><form:input path="titleEng"></form:input></td>
  </tr>
  <tr>
   <td>Age:<font color="red"><form:errors path="bodyEng"></form:errors></font></td>
  </tr>
  <tr>
   <td><form:input path="bodyEng"></form:input></td>
  </tr>
  <tr>
   <td><input type="submit" value="Submit"></td>
  </tr>
 </tbody></table> --%>
 
 <!--  inizio prova -->

        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->

        <!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->
		<form class="form-horizontal register">
            <div class="control-group">
                <label class="control-label" for="inputFirstName"><spring:message code="welcome.nome" text="default text" /></label>
                <div class="controls">
                    <%-- <input type="text" id="inputFirstName" placeholder="<spring:message code="welcome.nome" text="default text" />"> --%>
                    <%-- <form:input path="titleEng" placeholder="<spring:message code="welcome.cognome" text="default text" />"></form:input>
                    <span>User Name:<font color="red"><form:errors path="titleEng"></form:errors></font></span> --%>
                    <form:input path="firstName"></form:input>
                    <span><font color="red"><form:errors path="firstName"></form:errors></font></span>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputLastName"><spring:message code="welcome.cognome" text="default text" /></label>
                <div class="controls">
                    <%-- <input type="text" id="inputLastName" placeholder="<spring:message code="welcome.cognome" text="default text" />"> --%>
                    <form:input path="lastName"></form:input>
                    <span><font color="red"><form:errors path="lastName"></form:errors></font></span>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email</label>
                <div class="controls">
                    <!-- <input type="text" id="inputEmail" placeholder="Email"> -->
                    <form:input path="email"></form:input>
                    <span><font color="red"><form:errors path="email"></form:errors></font></span>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Password</label>
                <div class="controls">
                    <!-- <input type="password" id="inputPassword" placeholder="Password"> -->
                    <form:input path="password"></form:input>
                    <span><font color="red"><form:errors path="password"></form:errors></font></span>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputConfirmPassword">Password</label>
                <div class="controls">
                    <!-- <input type="password" id="inputConfirmPassword" placeholder="Password"> -->
                    <form:input path="cpassword"></form:input>
                    <span><font color="red"><form:errors path="cpassword"></form:errors></font></span>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <!-- <label class="checkbox">
                        <input type="checkbox"> Remember me
                    </label> -->
                    <button type="submit" class="btn">Register</button>
                </div>
            </div>
        </form>
 
</form:form>
</div>  


</body>