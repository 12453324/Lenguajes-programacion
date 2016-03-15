/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

import java.util.ArrayList;


public class ProbarPreguntas {
    public static void main(String[] args) {
        ArrayList<pregunta> preguntas=
                generadorPreguntas.obtenerTodasLasPreguntas();
        
        for(pregunta p:preguntas){
            System.out.println(p.getTitulo());
            for(opcion o:p.getOpciones()){
                System.out.println(o.getTitulo());
            }
        
        }
    }
    
}
