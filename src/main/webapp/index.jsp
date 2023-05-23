<%-- 
    Document   : index
    Created on : 23 may 2023, 10:23:01
    Author     : Tecnicos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap demo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <style>
            form{
                
                width: 700px;
            }
            body{
                margin-left:20px;
            }
        </style>
    </head>
    <body>
        <form action="Botones" method="post">
            <h1>Los botones Mágicos</h1>
            <input type="submit" value="Herencia" name="boton" class="btn btn-primary">
            <input type="submit" value="Polimorfismo" name="boton" class="btn btn-primary">
            <input type="submit" value="Constructor" name="boton" class="btn btn-primary">
        </form>
        ${boton}
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    </body>
</html>
