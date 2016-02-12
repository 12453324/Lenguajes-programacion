/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5.excepciones;

/**
 * excepciones
 * @author T-101
 */
public class ValidarEdad {
    public static void ChecharEdadNegativa(int edad)throws ValorNoNegativoException{
        if(edad<0)throw new ValorNoNegativoException();
    
    }
    
    //solucion punto 4
    //static destruye objetos
    public static void checarMenorEdad(int edad) throws  MenorDeEdad{
    if(edad<18) throw new MenorDeEdad();
    }
    
}
