/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intermediarios;

/**
 *
 * @author phily
 */
public class Verificador {
    
    public boolean verificarNumeroParametros(String valor1, String valor2){
        if(valor1==null || valor1.isEmpty() || valor2== null || valor2.isEmpty()){
            return false;
        }
        
        return true;
    }
    
    public boolean revisarCondiciones(String tipoOperacion, String valor1, String valor2){
        if(tipoOperacion.equalsIgnoreCase("conversion binaria")){
            if(Integer.parseInt(valor1)<0 || Integer.parseInt(valor2)<0){
                return false;
            }        
        }
        
        return true;
    }
    
    //aqui debería estar el método para corroborar que sean dígitos, "." o "-" nada más lo que estén ingresando
    
}
