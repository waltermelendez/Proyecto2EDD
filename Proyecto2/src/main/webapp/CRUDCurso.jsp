<%-- 
    Document   : CRUDCurso
    Created on : 3/05/2025, 5:36:57 p. m.
    Author     : walte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.6.0/css/fontawesome.min.css" integrity="sha384-NvKbDTEnL+A8F/AA5Tc5kmMLSJHUO868P+lDtTpJIeQdGYaUIuLr4lVGOEA1OcMy" crossorigin="anonymous">
        <title>Agregar Curso a un estudiante</title>
    </head>
    <body>
       <h1>Agregar Curso a un estudiante</h1>
        <div class="container mt-5">
            <form action="AddCurso" method="post">
                
                <!--Ingreso del nombre de l materia-->
                <div class="form-group">
                    <label>Nombre de la materia</label>    
                    <input type="string" class="form-control" name="Nmateria" id="Nmateria" placeholder="Diga el nombre del curso">
                </div>

                <!--Ingreso del id de la materia-->
                <div class="form-group">
                    <label>Id de la materia</label>
                    <input type="int" class="form-control" name="Idmateria" id="Idmateria" placeholder="Diga el Id de la materia">
                </div>

                <!-- Ingreso de los creditos del curso -->
                <div class = "form-group">
                    <label>Creditos</label>
                    <input type="int" class="form-control" name="Ccreditos" id="Ccreditos" placeholder="Diga el Id de la materia"> 
                </div>

                <button type="submit">Guardar</button>
                <button type="button"onclick="history.back();">Cancelar</button>
            </form>
    </body>
</html>
