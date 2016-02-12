/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5.excepciones;

/**
 * solucion punto 4
 * @author T-101
 */
public class MenorDeEdad extends Exception{
    public MenorDeEdad(){
    super("no puedes dar de alta a un menor de 18 años");
            }
}
