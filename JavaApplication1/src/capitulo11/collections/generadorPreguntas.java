
package capitulo11.collections;

import java.util.*;
public class generadorPreguntas {
    
    public static ArrayList<pregunta>      obtenerTodasLasPreguntas(){
    
        opcion o1=new opcion("moscu", true);
        opcion o2=new opcion("florencia", false);
        opcion o3=new opcion("paris", false);
        
        ArrayList<opcion> opciones=new ArrayList<opcion>();
        opciones.add(o1);
        opciones.add(o2);
        opciones.add(o3);
        
        pregunta p1=new pregunta("capital de rusia", opciones);
        
        ArrayList<pregunta> preguntas=new ArrayList<pregunta>();
        preguntas.add(p1);
        
        return preguntas;
    
    }
    
}
