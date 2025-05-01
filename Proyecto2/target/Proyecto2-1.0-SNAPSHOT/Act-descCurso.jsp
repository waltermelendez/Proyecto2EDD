<%-- 
    Document   : Act-descCurso
    Created on : 1/05/2025, 4:01:40 p. m.
    Author     : walte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.6.0/css/fontawesome.min.css" integrity="sha384-NvKbDTEnL+A8F/AA5Tc5kmMLSJHUO868P+lDtTpJIeQdGYaUIuLr4lVGOEA1OcMy" crossorigin="anonymous">

        <title>Activar o desactivar curso</title>
    </head>
    <body>
        <h1>Activar o desactivar curso</h1>

        <!-- Parte para activar un curso -->
        <div class="form-group">
            <label>Nombre del curso a activar</label>    
            <input type="string" class="form-control" name="ActCurso" id="ActCurso" placeholder="Diga el nombre del curso a activar">
        </div>

        <!-- Parte para desactivar un curso -->
        <div class="form-group">
            <label>Nombre del curso a desactivar</label>    
            <input type="string" class="form-control" name="DescCurso" id="DescCurso" placeholder="Diga el nombre del curso a desactivar">
        </div>
    </body>
</html>
