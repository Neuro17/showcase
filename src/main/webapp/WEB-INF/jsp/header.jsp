<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="row">
    <div class="navbar navbar-default navbar-fixed-top" role="navigation" id="navbar">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/bonboard/home"><!-- <img src="/bonboard/resources/img/logoBoB2.png"/> --></a>
        </div>

        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/bonboard/home">Home</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"></i><spring:message code="welcome.chisiamo" text="default text" /><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="/bonboard/about/about_us">About us</a></li>
                        <li><a href="/bonboard/about/advisory">Advisory board</a></li>
                        <li><a href="/bonboard/about/partners">Partners</a></li>
                        <li><a href="/bonboard/about/staff">Staff</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"></i><spring:message code="welcome.servizi" text="default text" /><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="/bonboard/servizi/i_nostri_servizi_per_voi"><spring:message code="welcome.serviziPerVoi" text="default text" /></a></li>
                        <li><a href="/bonboard/servizi/offerta_modulare"><spring:message code="welcome.offertaModulare" text="default text" /></a></li>
                        <li><a href="/bonboard/servizi/personalizzazione_dei_servizi"><spring:message code="welcome.personalizzazioneServizi" text="default text" /></a></li>
                    </ul>
                </li>
                <li id="offerte" class=""><a href="#"><spring:message code="welcome.offerte" text="default text" /></a></li>
                <li id="press" class=""><a href="#">Press Area</a></li>
                <li id="blog" class=""><a href="/bonboard/blog">Blog</a></li>
                <c:if test="${admin}">
                    <li id="admin" class=""><a href="/bonboard/admin/dashboard">Admin</a></li>
                    <li id="admin" class=""><a href="/bonboard/admin/usersList">UsersList</a></li>
                </c:if>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"></i><spring:message code="welcome.lingua" text="default text" /><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a id="it">Italiano</a></li>
                        <li><a id="en">English</a></li>
                    </ul>
                </li>
                <!-- <ul class="nav navbar-nav navbar-right">
                <li><a href="https://www.facebook.com/bonboardsrl?fref=ts" class="icon-facebook" target="blank"></a></li>
                <li><a href="http://www.linkedin.com/company/2599173?goback=npv_109304284_*1_*1_OUT*4OF*4NETWORK_vvJ*5_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1&trk=prof-0-ovw-curr_pos" class="icon-linkedin" target="blank"></a></li>
                <li><a href="http://twitter.com/Bonboardsrl" class="icon-twitter" target="blank"></a></li>
                <li><a href="http://www.youtube.com/user/BOnBoardTV" class="icon-youtube" target="blank"></a></li>
                 --></ul>
            </ul>

            <c:choose>
                <c:when test="${authenticated}" >
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">${username} <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a id="logOutButt">logout</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li><a href="#">Separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                </c:when>
                <c:otherwise>

                    <form class="navbar-form navbar-right" role="search">
                        <div class="form-group">
                            <input id="user" type="text" class="form-control" placeholder="Username">
                        </div>
                        <div class="form-group">
                            <input id="pass" type="password" class="form-control" placeholder="Password">
                        </div>
                        <button id="logButt" type="button" class="btn btn-default">Sign in</button>
                        <a href="/bonboard/register"><spring:message code="welcome.registrati" text="default text" /></a>
                    </form>
                </c:otherwise>
            </c:choose>
        </div><!-- /.navbar-collapse -->
    </div>
</div>