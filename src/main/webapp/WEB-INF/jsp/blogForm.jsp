<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<body>
<div class=container main>
<br><br>
<form:form  method="post" modelAttribute="blogForm" action="blogForm"  >

<table>
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
 </tbody></table>
</form:form>
</div>        
</body>