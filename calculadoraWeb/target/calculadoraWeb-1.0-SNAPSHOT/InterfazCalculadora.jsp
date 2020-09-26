<%-- 
    Document   : IntefazCalculadora
    Created on : 24/09/2020, 19:37:55
    Author     : phily
--%>

<%@page import="Intermediarios.Verificador"%>
<%@page import="Intermediarios.Mensajero"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>calcWeb</title>
        <link rel="stylesheet" type="text/css" href="apariencia.css">
        <style>
            .botonOperacion{                              
                  height: 55px;
                  width: 55px;                
            }
        </style>
    </head>
    
        
    <body>
        <%! Mensajero mensajero= new Mensajero();%>
        <%! Verificador verificador = new Verificador();%>
        
        <center>             
            
            <Form method="POST" accion="InterfazCalculadora">
                <h1>CALCULADORA WEB</h1>
        
                <table>
                    <tr>
                        <th>
                            <input type="number"  name="numero1">
                        </th>
                        <th>    
                            <input type="number" name="numero2">
                        </th>
                    </tr>
                </table>                                                              
                 
                <center>
                    <% if(verificador.verificarNumeroParametros(request.getParameter("numero1"), request.getParameter("numero2")) && 
                        verificador.revisarCondiciones(request.getParameter("numero1"), request.getParameter("numero2"), request.getParameter("operacion"))){%>
                        <%mensajero.entregarInformacionATrabajar(request.getParameter("numero1"), request.getParameter("numero2"), request.getParameter("operacion"));%>
                    <h3>Resultado: <%=mensajero.entregarResultado()%></h3>
                    <%} else{%>                                          
                        <h3>Resultado: </h3>                                
                    <%}%>
                </center>
                <table> 
                    <tr>
                        <th>
                            <input type="submit" class="delete" name="operacion" value="C">                      
                        </th>
                        <th>
                            <input type="submit" class="botonOperacion" name="operacion" value="+">                  
                        </th>
                         <th>
                             <input type="submit" class="botonOperacion" name="operacion" value="x">                                              
                        </th>
                        <th>
                            <input type="submit" class="botonOperacion" style="width: 155px;" name="operacion" value="mayor que">                                               
                        </th>
                        <th>
                            <button name="operacion" class="botonOperacion" value="potencia">                
                            <p>n1<sup>n2</sup></p>                        
                            </button>                            
                        </th>          
                        <th>
                            <input type="submit" class="botonOperacion" style="width: 155px;"   name="operacion" value="conversion binaria">                  
                        </th>                           
                    </tr>
                </table>
                
                <center>
                   <a href="index.html" style="text-align: center">Apagar</a>                                       
                </center>
            </Form>
        
        
        </center>
    </body>    
</html>
