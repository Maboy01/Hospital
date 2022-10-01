<%-- 
    Document   : Medico
    Created on : 1/10/2022, 6:13:00 p. m.
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medicos</title>
    </head>
    <body>
        <h1>Lista Medicos</h1>
        <%@page import="Java.Medico" %>
        <%
            out.print("Doctores");
            String tipo = request.getParameter("Tipo");
            String nombre = request.getParameter("Nombre");
            Java.Medico on = new Medico("Dr Hector", "Acuña");
            on.mostrarA();
            Java.Medico on1 = new Medico("Dra Patricia", "Alvarez");
            on1.mostrarA();
            Java.Medico on2 = new Medico("Dr Hernan", "Vargas");
            on2.mostrarA();
            Java.Medico on3 = new Medico("Dr Brayan", "Guarnizo");
            on3.mostrarA();
            %>
    </body>
</html>
