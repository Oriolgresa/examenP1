package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 18/11/16.
 */
public class User  {
    int dni;
    String nombre, direccion;


    public User(String nombre, String direccion, int dni) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
