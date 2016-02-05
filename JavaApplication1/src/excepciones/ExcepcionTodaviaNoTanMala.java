/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //declaramos un arreglo de enteros 
        int x[]={1,34,6,9};
        float y[]=new float[4];
        float z;
        //todos los arreglos son tratados por el compilador como objetos
        
        //System.out.println(x[4]);
        
        a objeto=new a();
        System.out.println(objeto.m);
        System.out.println(y[2]);
        // System.out.println(z); 
        
        // interar el arreglo x
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        // nuevo for
        for(int w:x){
            System.out.println(w);
        }
    }
}
class a{
float m;
}

