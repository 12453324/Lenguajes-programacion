/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTipoExamen;

/**
 *
 * @author T-101
 */
public class cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private float sueldo;
    private direccion direccion;

    public cliente(String nombre, String apellido, int edad, float sueldo, direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }
       
}
