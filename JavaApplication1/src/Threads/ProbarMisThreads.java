/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    
    public static void main(String[] args) {
        //ciclo de vida del thread sin pausa
        //1.creado
        MiPrimerThread ti=new MiPrimerThread();
        ti.setName("Li");
        
        //2.inicializar 
        ti.start();
        
        //3.ejecucion
        
        //5.muerte 
    }
    
}
