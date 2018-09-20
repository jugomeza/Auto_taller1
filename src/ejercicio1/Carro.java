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
public class Carro {

    private String marca;
    private String modelo;

    private Ruedas[] rueda;
    private Motor motor;
    private Chassis chasis;

    public Carro(String marca, String modelo, Ruedas[] rueda, Motor motor, Chassis ch) {
        this.marca = marca;
        this.modelo = modelo;
        this.rueda = new Ruedas[4];
        this.motor = motor;
        this.chasis = ch;

    }

    public boolean cambiarRueda(Ruedas _rueda) {
        for (int i = 0; i < this.rueda.length; i++) {
            if (this.rueda[i] == null) {
                this.rueda[i] = _rueda;
                return true;
            }
        }
        return false;
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

    public Ruedas[] getRueda() {
        return rueda;
    }

    public void setRueda(Ruedas[] r) {
        this.rueda = r;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chassis getChasis() {
        return chasis;
    }

    public void setChasis(Chassis chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        String printBoard = "\n" + " marca: " + marca + "\n modelo:" + modelo + motor + chasis;
        return printBoard;
    }

}
