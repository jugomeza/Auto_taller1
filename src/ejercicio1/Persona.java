/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author sebas
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private Carro[] carro;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carro = new Carro[10];
    }

    public Persona(String nombre, String apellido, int edad, Carro _carro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carro = new Carro[10];
        añadirCarro(_carro);
    }

    public boolean añadirCarro(Carro carro) {
        for (int i = 0; i < this.carro.length; i++) {
            if (this.carro[i] == null) {
                this.carro[i] = carro;
                return true;
            }
        }
        return false;
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

    public Carro getCarro(int i) {
        if (carro[i] == null) {
            System.out.println("No hay carro en la posición " + i + " para la persona " + nombre);
            return null;
        }
        return carro[i];
    }

    public void setCarro(Carro _carro, int i) {
        this.carro[i] = _carro;
    }

    @Override
    public String toString() {
        String printBoard = "\n persona: " + nombre + " " + apellido + "\n edad " + edad + " años";
        int a;
        for (int i = 0; i < 10; i++) {
            if (carro[i] != null) {
                printBoard += "\n carro " + (a = i + 1) + carro[i].toString();
            }

        }
        return printBoard;
    }

}
