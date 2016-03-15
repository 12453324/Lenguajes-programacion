/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

import java.util.*;
public class pregunta {
    private String titulo;
    private ArrayList<opcion> opciones;

    public pregunta(String titulo, ArrayList<opcion> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<opcion> opciones) {
        this.opciones = opciones;
    }
    
}


