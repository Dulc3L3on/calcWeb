/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intermediarios;

import Logica.Operacion;

/**
 *
 * @author phily
 */
public class Mensajero {
    String[] resultado;
    String tipoInformacion;   
    Operacion calculadora = new Operacion();
    
    public void entregarInformacionATrabajar(String valor1, String valor2, String tipoOperacion){
        tipoInformacion=tipoOperacion;
        calculadora.calcular(Double.parseDouble(valor1), Double.parseDouble(valor2), tipoOperacion);     
        recibirResultado();
    }    
 
    public String entregarResultado(){
        if(tipoInformacion.equalsIgnoreCase("mayor que")){
            return "el mayor de los números es -> "+ resultado[0];
        }if(tipoInformacion.equalsIgnoreCase("conversion binaria")){
            return "la conversion generó ->" + resultado[0]+", "+resultado[1];
        }
        
        return resultado[0];                
    }   
    
    private void recibirResultado(){
        resultado=calculadora.darRespuesta();
    }
    
}
