/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

/**
 *
 * @author T-101
 */
public class ProbarPersistencia {
    public static void main(String[] args) throws Exception{
        //primero crear usuario
        Usuario u1=new Usuario();
        u1.setLogin("tu");
        u1.setPasword("1234");
        
        PersistenciaUsuario p=new PersistenciaUsuario();
                p.guardar(u1);
                System.out.println("usuario guardado");
                
        
        
    }
    
}
