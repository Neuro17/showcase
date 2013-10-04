<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables" %>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<script src="/bonboard/resources/js/vendor/jQuery.js"></script>

<div class="container">
	<br><br>
	Welcome ${username}<br>
	Number of users: ${size}<br><br><br>
	
	<datatables:table id="UsersTable" data="${users}" cdn="true" row="user" sort="true" filter="true" theme="bootstrap2" cssClass="table table-striped">
		<datatables:column title="First name" >
		    <c:out value="${user.getFname()}"></c:out>
		</datatables:column>
		<datatables:column title="Last name">
		    <c:out value="${user.getLname()}"></c:out>
		</datatables:column>
		<datatables:column title="Username">
		    <c:out value="${user.getUsername()}"></c:out>
		</datatables:column>
		<datatables:column title="Mail">
		    <c:out value="${user.getEmail()}"></c:out>
		</datatables:column>
		<datatables:column title="Role">
		    <c:out value="${user.getAuth().get(0).getAuthority()}"></c:out>
		</datatables:column>
		<datatables:column title="">
		    <button class="change-auth" id="${user.getUsername()}">Change privilege</button>
		</datatables:column>
    </datatables:table>
</div><br><br><br>


    
   <%-- <datatables:column title="LastName" property="lastName" />
   <datatables:column title="City" property="address.town.name" />
   <datatables:column title="Mail" property="mail" /> --%>




<script type="text/javascript">

$(document).ready(function(){
	$(".change-auth").click(function(){
	    var username = $(this).attr("id");
	    jq.get("changeAuth", {user: username}, function(data){
			if(data)
				window.location.reload();
		});
	});	
});

</script>	

        <!-- <div class="container">
            <div class="row">
                <div class="main-panel span8">
                    <div class="blog-post">
                        <h1 class="" >udafhuidghfauifgas+y</h1><hr>
                        <img class="post-photo" src="/bonboard/resources/img/Bob3.jpg"/><br><br><br>
                        <p><span class="first-letter">B</span>onboard nasce dalla passione comune di persone che credono nel futuro, nel talento e nelle diverse culture, come valore umano e come vantaggio competitivo di business.</p></br>

                        <p>In un mercato sempre più globale BonBoard, porta la multiculturalità alle imprese. Forniamo servizi sia per il mercato dell’internazionalizzazione (outdoor) che per quello interno (indoor) ad esempio per presidiare il segmento multiculturale presente in Italia e sostenere gli investimenti internazionali sul nostro territorio.</p></br>

                        <p>Bonboard aiuta le imprese nella ricerca dei migliori profili al fine di valorizzarne i percorsi aziendali, utili alla crescita dell’impresa stessa, non trascurando gli aspetti legati ai cambiamenti culturali, necessari per affrontare i nuovi processi di trasformazione.</p></br>

                        <p>La sfida della competitività è una sfida totale che si gioca su più fronti, ma che vede al centro il fattore umano, risorsa primaria di qualsiasi impresa: per questo Bonboard mette in contatto le aziende con, in modo particolare ma non esclusivo, le seconde generazioni di origine internazionale o i residenti, da lungo tempo in Italia, in grado di arricchire con la propria cultura d’origine i valori nazionali. Selezioneremo anche tutti i talenti italiani, che, grazie alla loro esperienza e percorso internazionale, sono dotati di multiculturalità.</p></br>

                        <p class="pagination-centered"><font size="4"><strong>Scoprire Talenti è la nostra passione.</br> Welcome on board!</strong></font></p></br>
                    </div><br><br>

                    <div class="blog-post">
                        <h1 class="" >udafhuidghfauifgas+y</h1><hr>
                        <img class="post-photo" src="/bonboard/resources/img/Bob3.jpg"/><br><br><br>
                        <p><span class="first-letter">B</span>onboard nasce dalla passione comune di persone che credono nel futuro, nel talento e nelle diverse culture, come valore umano e come vantaggio competitivo di business.</p></br>

                        <p>In un mercato sempre più globale BonBoard, porta la multiculturalità alle imprese. Forniamo servizi sia per il mercato dell’internazionalizzazione (outdoor) che per quello interno (indoor) ad esempio per presidiare il segmento multiculturale presente in Italia e sostenere gli investimenti internazionali sul nostro territorio.</p></br>

                        <p>Bonboard aiuta le imprese nella ricerca dei migliori profili al fine di valorizzarne i percorsi aziendali, utili alla crescita dell’impresa stessa, non trascurando gli aspetti legati ai cambiamenti culturali, necessari per affrontare i nuovi processi di trasformazione.</p></br>

                        <p>La sfida della competitività è una sfida totale che si gioca su più fronti, ma che vede al centro il fattore umano, risorsa primaria di qualsiasi impresa: per questo Bonboard mette in contatto le aziende con, in modo particolare ma non esclusivo, le seconde generazioni di origine internazionale o i residenti, da lungo tempo in Italia, in grado di arricchire con la propria cultura d’origine i valori nazionali. Selezioneremo anche tutti i talenti italiani, che, grazie alla loro esperienza e percorso internazionale, sono dotati di multiculturalità.</p></br>

                        <p class="pagination-centered"><font size="4"><strong>Scoprire Talenti è la nostra passione.</br> Welcome on board!</strong></font></p></br>
                    </div><br><br>

                    <div class="blog-post">
                        <h1 class="" >udafhuidghfauifgas+y</h1><hr>
                        <img class="post-photo" src="/bonboard/resources/img/Bob3.jpg"/><br><br><br>
                        <p><span class="first-letter">B</span>onboard nasce dalla passione comune di persone che credono nel futuro, nel talento e nelle diverse culture, come valore umano e come vantaggio competitivo di business.</p></br>

                        <p>In un mercato sempre più globale BonBoard, porta la multiculturalità alle imprese. Forniamo servizi sia per il mercato dell’internazionalizzazione (outdoor) che per quello interno (indoor) ad esempio per presidiare il segmento multiculturale presente in Italia e sostenere gli investimenti internazionali sul nostro territorio.</p></br>

                        <p>Bonboard aiuta le imprese nella ricerca dei migliori profili al fine di valorizzarne i percorsi aziendali, utili alla crescita dell’impresa stessa, non trascurando gli aspetti legati ai cambiamenti culturali, necessari per affrontare i nuovi processi di trasformazione.</p></br>

                        <p>La sfida della competitività è una sfida totale che si gioca su più fronti, ma che vede al centro il fattore umano, risorsa primaria di qualsiasi impresa: per questo Bonboard mette in contatto le aziende con, in modo particolare ma non esclusivo, le seconde generazioni di origine internazionale o i residenti, da lungo tempo in Italia, in grado di arricchire con la propria cultura d’origine i valori nazionali. Selezioneremo anche tutti i talenti italiani, che, grazie alla loro esperienza e percorso internazionale, sono dotati di multiculturalità.</p></br>

                        <p class="pagination-centered"><font size="4"><strong>Scoprire Talenti è la nostra passione.</br> Welcome on board!</strong></font></p></br>
                    </div><br><br>
                </div>
                <div class="side-panel span3 pull-right">
                    <h3>Ultimi post</h3>
                </div>
            </div>
        </div>-->
    </body>
</html>
