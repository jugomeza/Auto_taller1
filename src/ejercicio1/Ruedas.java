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
public class Ruedas {

    private String marca;
    private String modelo;
    private int pulgadas;

    public Ruedas(String marca, String modelo, int pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        String printBoard = "\n" + "modelo de reudas: " + modelo + "\n pulgadas:" + pulgadas;
        return printBoard;
    }

}
