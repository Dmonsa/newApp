<%-- 
    Document   : index.jsp
    Created on : 23/05/2018, 07:20:30 PM
    Author     : sala312
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>CREDITO</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
              rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
    </head>

    <body class="text-center">
        <form class="form-signin"
              action="${pageContext.servletContext.contextPath}/"
              method="post">
            <img class="mb-4" src="http://www.construccionenacero.com/sites/construccionenacero.com/files/noticia/bc_07-16_n_5_copia.png" alt="" width="72" height="72">
            <h1 class="h3 mb-3 font-weight-normal">CREDITO</h1>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" name="txtemail"
                   class="form-control" placeholder="Email address" required autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="txtclave"
                   class="form-control" placeholder="Password" required>
            
            
            <div class="slidecontainer">
                <input type="range" min="1" max="100" value="50" class="slider" id="myRange">
            </div>
            <div class="form-group">
                <label for="exampleFormControlSelect1">Monto a prestar</label>
                <select class="form-control" id="exampleFormControlSelect1">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <div class="form-group">
                <label for="exampleFormControlSelect1">Tipo trabajador</label>
                <select class="form-control" id="exampleFormControlSelect1">
                    <option>Independiente</option>
                    <option>Dependiente</option>
                </select>
            </div>
            <div class="form-group">
                <label for="exampleFormControlSelect1">Tipo de credito</label>
                <select class="form-control" id="exampleFormControlSelect1">
                    <option>Vivienda</option>
                    <option>Estudio</option>
                    <option>Libre Inversion</option>
                </select>
            </div>
            <div class="form-group">
                <label for="exampleFormControlSelect1">Trabaja en la compañia</label>
                <select class="form-control" id="exampleFormControlSelect1">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>      
            <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
            <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
        </form>
    </body>
</html>

