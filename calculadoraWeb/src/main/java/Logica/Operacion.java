/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
/**
 *
 * @author phily
 */

public class Operacion { 
    String resultado[]= new String[2];      
    
    public void calcular(double numero1, double numero2, String opcion){
        double datos[] = {numero1, numero2};                 
        
        switch(opcion){
            
            case "+":
                resultado[0]=sumar(numero1, numero2);
            break;
            
            case "x":
                resultado[0]=multiplicar(numero1, numero2);
            break;
            
            case "mayor que":
                resultado[0]=darMayor(numero1, numero2);
            break;
            
            case "potencia":
                resultado[0]=darPotencia(numero1, numero2);
            break;
            
            case "conversion binaria":
                resultado=convertir(datos);
            break;                     
        }    
        
        
    }
    
    private String sumar(double sumando1, double sumando2){
        return String.valueOf(sumando1+sumando2);
    }

    private String multiplicar(double factor1, double factor2){
        return String.valueOf(factor1*factor2);        
    }
    
    private String darMayor(double numero1, double numero2){
        if(numero1>numero2){
            return String.valueOf(numero1);
        }
        
        return String.valueOf(numero2);
    }
    
    private String darPotencia(double base, double exponente){
        return String.valueOf(Math.pow(base, exponente));       
    }
          
    private String[] convertir(double[] numeros){
      String[] numerosConvertidos= {"", ""};
                
        for(int ciclo=0; ciclo<numeros.length; ciclo++){
           numerosConvertidos[ciclo]=convertirABinario(numeros[ciclo]);
        }
        
        return numerosConvertidos;
    }     
    
    private String convertirABinario(double numero){
        String residuo="";
        
        while(numero>1){
            residuo+=String.valueOf((int)(numero%2));                   
            numero/=2;
        }               
        
        return darBinario((int)numero, residuo.toCharArray());                
    }
    
    private String darBinario(int ultimoCOciente, char[] residuos){
        String binario = String.valueOf(ultimoCOciente);       
        
        for(int numeroResiduos=residuos.length-1; numeroResiduos>=0; numeroResiduos--){
            binario+=residuos[numeroResiduos];           
        }
        
        return binario;
    }
    
    public String[] darRespuesta(){
        return resultado;
    }
 
    
    
}

//suma
//multiplicación
//numero>
//potencia n1^n2
//ambos numeros en valorBinario

//<%mensajero.entregarInformacionATrabajar(request.getParameter("numero1"), request.getParameter("numero2"), request.getParameter("operacion"))%>
//<input type="button" name="btn_encender" value ="ENCENDER" >        