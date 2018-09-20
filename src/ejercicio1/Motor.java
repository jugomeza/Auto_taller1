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
public class Motor {

    private String modelo;
    private int hp;

    public Motor(String modelo, int hp) {
        this.modelo = modelo;
        this.hp = hp;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        String printBoard = "\n modelo del motor: " + modelo + "\n caballos de potencia: " + hp;
        return printBoard;
    }

}
