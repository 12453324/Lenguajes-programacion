/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads implements Runnable{
    
    public static void main(String[] args) {
        //ciclo de vida del thread sin pausa
        //1.creado
        MiPrimerThread ti=new MiPrimerThread();
        //otro thread
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        
        //el thread t2 tiene que hacer que se imprima del 1 al 10 con espacio de 5 seg entre impresion
        // el thread t3 tiene que imprimir la frase "todos vamos a morir!"
        
        ti.setName("Li");
        t2.setName("juana");
        t3.setName("pedro");
        
       
        
        //2.inicializar 
        ti.start();
        t2.start();
        t3.start();
        
        //3.ejecucion
        
        //5.muerte 
    }

    @Override
    public void run() {
        
        //primero preguntamos si es el thread t2 y si es que imprima del 1 a l 10
        //
        if(Thread.currentThread().getName().equals("juana")){
        int x=1;
        for(int i=0; i<30; i++){
            System.out.println(x++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        }if (Thread.currentThread().getName().equals("pedro")){
        while(true){
            System.out.println("todos vamos a morir!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        }
        
    }
    
}
