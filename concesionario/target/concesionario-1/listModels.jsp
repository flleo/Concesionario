<%-- 
    Document   : listModels
    Created on : 26 feb. 2021, 12:47:58
    Author     : l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Concesionario - Listado</title>
        <link rel="stylesheet" href="resources/css/table.css" >
    </head>
    <header><h1>Listado de Vehículos</h1></header>
    <body>      
        <table>
            <tr>
                <th>Logo</th>
                <th>Marca</th>
                <th>Modelo</th>
                <th>Tipo de Vehículo</th>
                <th>Fecha de Lanzamiento</th>
            </tr>
            <c:forEach var="m" items="${lista}">
                <tr>
                    <td><img src="resources/img/logos/${m.getLogo()}" style="height: 50px;"/></td>
                    <td>${m.getMarca()}</td>
                    <td>${m.getModelo()}</td>
                    <td>${m.getTipo()}</td>
                    <td>${m.getFecha()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
