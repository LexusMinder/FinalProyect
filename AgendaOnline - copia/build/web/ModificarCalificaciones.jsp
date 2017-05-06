<%-- 
    Document   : ModificarCalificaciones
    Created on : 5/05/2017, 10:36:25 PM
    Author     : moust
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ModificarCalificaciones</title>
    </head>
    <body>
        <form action="DataController" method="POST">
            <h3>
                Nota: Introducir valores de 0 a 100, y dejar en blaco las casillas que no se quieran modificar
            </h3> 
                
            <label>Usario del estudiante: <input type="text" name="username" value=""></label>
            </br>
            <label>Calificacion 1er Examen: <input type="text" name="examen1" value=""></label>
            </br>
            <label>Calificacion 2do Examen: <input type="text" name="examen2" value=""></label>
            </br>
            <label>Calificacion 3er Examen: <input typr="text" name="examen3" value=""></label>
            </br>
            <label>Modificar tareas: <input type="text" name="tareas" value=""></label>
            </br>
            <label>Modificar proyecto final: <input type="text" name="proyecto" value=""></label>
            </br>
            <input type="submit" value="GuardarCambios" name="">
            <input type="hidden" value="editar" name="action" >
        </form>
    </body>
</html>
