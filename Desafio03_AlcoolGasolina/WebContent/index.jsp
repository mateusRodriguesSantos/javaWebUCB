<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Economoby</title>
</head>
<body>

<div id="container">
     <div class="titulo" >
         <h1>Economoby</h1>
         <h3>Descubra se é melhor abastecer com álcool ou Gasolina</h3>
     </div>

     <div class="form">
         <h1> Gasolina x álcool</h1>

         <form action="Calculo" method="get" class="inputsParagrafy">
             <p>Preço atual da Gasolina</p>
             <input type="text" name="precoGasolina" id="precoGasolina">
             <p>Preço atual do álcool</p>
             <input type="text" name="precoAlcool" id="precoAlcool">
             <br>
             <button type="submit" name="calcular">Calcular</button>
         </form>

         <h1 class="resultado">Abasteça com:</h1>

         <h3>
         <c:out value="${resultado}"></c:out>
          </h3>
     </div>
</div>

</body>
</html>