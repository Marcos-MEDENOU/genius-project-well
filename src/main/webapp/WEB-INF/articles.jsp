<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "/WEB-INF/components/header.jsp" %>

<%-- 	<p>${article.getPrenom()}</p> --%>
	
<%-- 	<p>${article.getIsActif()? "Vous etes actif": "Vous etes inactif"}</p> --%>
 

<!--   		String name = (String)request.getAttribute("name");  -->
<!--   		out.println(name); -->

 	
 	<p><c:out value="<p>Bonjour "/></p>
 	
   <script src="https://unpkg.com/flowbite@1.4.7/dist/flowbite.js"></script>
      <script src="https://cdn.tailwindcss.com"></script>
</body>
</html>