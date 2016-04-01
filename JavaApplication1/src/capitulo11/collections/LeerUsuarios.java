/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

public class LeerUsuarios {
    public static void main(String[] args)throws Exception{
        PersistenciaUsuario p=new PersistenciaUsuario();
        System.out.println(p.buscarTodos().size());
        
        for(Usuario u:p.buscarTodos()){
            System.err.println("Login:"+ u.getLogin()+"Password" +u.getPasword());
        
        }
            
        
    }
    
}
