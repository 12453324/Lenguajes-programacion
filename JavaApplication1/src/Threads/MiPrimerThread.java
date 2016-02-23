/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author T-101
 * xcreacion de un thread heredando la clase thread
 */
public class MiPrimerThread extends Thread{
    
    public void run(){
    
        System.out.println("soy un thread y me llamo " +this.getName());
        
    
    }
    
}
