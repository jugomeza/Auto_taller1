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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ruedas[] ruedas = new Ruedas[4];
        for (int i = 0; i < 4; i++) {
            ruedas[i] = new Ruedas("X" + i, "Y", 20);
        }
        Motor m1 = new Motor("m1", 900);
        Motor m2 = new Motor("m2", 800);
        Chassis ch1 = new Chassis("estandar");
        Chassis ch2 = new Chassis("unico");
        Carro c1 = new Carro("M", "Y", ruedas, m1, ch1);
        Carro c2 = new Carro("X", "Y", ruedas, m2, ch2);

        Persona uno = new Persona("Juan", "Gomez", 29);
        uno.añadirCarro(c1);
        uno.añadirCarro(c2);

        System.out.println(uno);

    }

}
