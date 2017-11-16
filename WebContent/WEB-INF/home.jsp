<%@ page 
	language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
    
<!DOCTYPE html>
<html>
<head>
<style>
body{text-align:center;
	color:white;
	background-color : ${bgcolor}}
	a{text-decoration : none;}
 table{display: inline-block;
 		text-align:center;
		border-collapse:collapse;}
tr,th, td{text-align:center;
		border : 1px solid white}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page d'accueil</title>
</head>
<%-- <h1>MON TITRE</h1>
<c:forEach items= "${tab}" var="item">
${ item }

</c:forEach>

<p>

<c:forEach items= "${prenom}" var="item">
${ item }

</c:forEach>  --%>

<%-- 
</p>
${'salut'}

<p><c:out value="bonjour"/>
</p>

 <p><c:out value='<%= "bonjour"%>'/>
	</p> 

	
	<!-- de base c false -->
<p><c:out value="${test = '<h1>Titre</h1>'}" escapeXml="true" default="erreur"/>
</p>


<p><c:catch var="error"> ${test = 'salut'; } </c:catch>	

	<c:if test="${ not empty error }">
	Message d'erreur : ${error}
	</c:if>
</p>

<p>
	${age = 199; "" }
<c:choose>
 <c:when test="${age > 18 && age < 55}">Adulte considéré jeune</c:when>
	<c:when test="${age >= 55}">Adulte considéré vieux</c:when>
	<c:otherwise> Jeunot</c:otherwise>
</c:choose>
</p>

<p>	

<c:forEach begin="5" end="16" var="item">
	<li>${item} </li>
</c:forEach>										
</p>


<p>	${tab = ['salut', 'tout','le','monde', '!'];"" }

<c:forEach items="${tab}" var="item">
	${item}
</c:forEach>										
</p>

<p>	

<c:forTokens items="Maison, voiture, ordinateur, chaussure, chaussette, portable" delims="," var="item">
	${item}
</c:forTokens>										
</p>
	<p>	

<c:forTokens items="MAISON, voiture, ordinateur, chaussure, chaussette, portable" delims="," var="item">
	<li> ${ fn:toLowerCase(item)} </li>
</c:forTokens>										
</p>

--%>

<c:forEach items ="${reps}" var="rep">
	<c:if test="${!empty rep.listePersonnes}">
		<h1>${rep.nom == '' ? 'Pas de Nom' : rep.nom }</h1>
	
		
		<p>
		
			
				<table>
		
					<tr><th>Fav</th>
						<th>Nom et prenom</th>
						<th>Adresse</th>
						<th>Numéro de telephone</th>
						
						<th>Selection Groupe</th>
						<th>Groupe</th>
					</tr>
					<c:forEach items="${rep.listePersonnes}" var="contact">
					<tr>
					<td>
					<a href ='<c:url value="/home${'/' += contact.nom }${contact.favori ? '' : '/favori'}"/> '>
							<c:choose>
							<c:when test="${contact.favori}">&#9733;</c:when>
							<c:otherwise>&#9734;</c:otherwise>
							</c:choose>
							</a>
					</td>
						<td><c:out value="${contact.nom += ' ' += contact.prenom}">Non renseigné</c:out></td>
						<td>
							${adresse = contact.adresse; '' }
							<c:out value = "${adresse.voie}" />
							<br>
							<c:out value = "${adresse.cp += adresse.ville}"> Non renseigné </c:out>
						</td>
						<td><c:out value = "${contact.tel}">Non renseigné </c:out></td>
					
					<td>
								<%--  ou sa "${pageContext.request.contextPath}/home" --%>
					<form action ="<c:url value='/home/${contact.nom}'/>" method="POST">
					<select name="choixGroupe">
					
					<c:forEach items = "${groupes}" var="groupe" varStatus="loop">
						<c:if test="${!loop.first}">
							<option value="${groupe}">${groupe}</option>
						</c:if>
					</c:forEach>
					</select>
					<button type="submit">ok</button>
					</form>
					
					</td>
					<td>
					<c:out value="${contact.groupe}"></c:out>
					</td>
					
					</tr>
					</c:forEach>
				</table>
				
		
		
		
		
		
		
	</c:if>
</c:forEach>
</html>