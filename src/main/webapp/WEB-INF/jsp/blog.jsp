<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Addresses</h1>
<table>
 <tr>
  <td width="100">user</td>
  <td width="150">title</td>
  <td width="150">body</td>
  <td width="150">time</td>
  <td width="150">count</td>
 </tr>
 <c:forEach items="${contents}" var="content">
  <tr>
   <td><c:out value="${content.user}" /></td>
   <td><c:out value="${content.title}" /></td>	
   <td><c:out value="${content.body}" /></td>
   <td><c:out value="${content.time}" /></td>
   <td><c:out value="${content.nComments}" /></td>
  </tr>
 </c:forEach>
</table>  




