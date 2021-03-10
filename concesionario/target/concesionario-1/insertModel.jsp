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
        <title>Concesionario - Inserta modelo</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <header><h1>Nuevo Modelo</h1></header>
    <body>      
        <form action="insertController" method="post" class="mx-5 w-50">
            <div class="form-group">
                <label for="marca">Marca</label>
                <select class="form-control" id="marca" name="idMarca">
                    <c:forEach var="m" items="${marcas}">
                        <option value="${m.getIdMarca()}">${m.getNombre()}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label for="tipo">Tipo de vehículo</label>
                <select class="form-control" id="tipo" name="idTipo">
                    <c:forEach var="t" items="${tipos}">
                        <option value="${t.getIdTipoCoche()}">${t.getNombre()}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label for="modelo">Modelo</label>
                <input type="text" class="form-control" id="modelo" name="modelo" placeholder="Nuevo modelo">
            </div>
            <div class="form-group">
                <label for="fecha">Fecha de lanzamiento</label>
                <input type="date" class="form-control" id="fecha" name="fecha">
            </div>
            <button type="submit" class="btn btn-success">Grabar</button>
            <a href="" class="btn btn-warning">Limpiar</a>
        </form>
    </body>
</html>
