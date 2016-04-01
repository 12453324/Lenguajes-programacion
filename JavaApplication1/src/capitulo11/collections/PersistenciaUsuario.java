/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class PersistenciaUsuario {
    
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
    
    //Primero ponemos el metodo de buscar todos
        ArrayList<Usuario> buscarTodos()throws Exception{
           //Paso numero 1: 
          // Leemos el aarchvo donde esta guardado el arraylist
          File f=new File("archivaldo.raton");
          //Leemos el contenido
          FileInputStream fis=new FileInputStream(f);
          //DEscomprimimos el contenido
          ObjectInputStream ois=new ObjectInputStream(fis);
 usuarios=(ArrayList<Usuario>) ois.readObject();
           return usuarios;
         }
        
        public void guardar(Usuario u)throws Exception{
            File f=new File("archivaldo.raton");
            if(f.exists())usuarios=buscarTodos();
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            usuarios.add(u);
            oos.writeObject(usuarios);
        }

    void guardar(Usuario u1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void guardar(Usuario u1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
