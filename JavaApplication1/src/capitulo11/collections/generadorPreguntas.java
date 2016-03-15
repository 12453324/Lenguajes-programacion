
package capitulo11.collections;

import java.util.*;
public class generadorPreguntas {
    
    public static ArrayList<pregunta>      obtenerTodasLasPreguntas(){
    
        opcion o1=new opcion("moscu", true);
        opcion o2=new opcion("florencia", false);
        opcion o3=new opcion("paris", false);
        
        
        opcion o1p2=new opcion("toki", false);
        opcion o2p2=new opcion("beiging", true);
        opcion o3p2=new opcion("seul", false);
        opcion o4p2=new opcion("moscu", false);
        
        ArrayList<opcion> opciones=new ArrayList<opcion>();
        opciones.add(o1);
        opciones.add(o2);
        opciones.add(o3);
        
        ArrayList<opcion> opcionesp2=new ArrayList<opcion>();
        opcionesp2.add(o1p2);
        opcionesp2.add(o2p2);
        opcionesp2.add(o3p2);
        
        pregunta p1=new pregunta("capital de rusia", opciones);
        pregunta p2=new pregunta("capital de china", opcionesp2);
        
        
        ArrayList<pregunta> preguntas=new ArrayList<pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        
        return preguntas;
    
    }
    
}
