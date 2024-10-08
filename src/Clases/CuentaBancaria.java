package Clases;

import Interfaces.Imprimible;

//clase abstracta porque no queremos que se puedan instanciar(crear objetos en el main)
public abstract class CuentaBancaria implements Imprimible {
    private Persona titularCuenta;
    private double saldoCuenta;
    private String numCuenta;

    public CuentaBancaria() {

    }

    public CuentaBancaria(Persona titularCuenta, double saldoCuenta, String numCuenta) {
        this.titularCuenta = titularCuenta;
        this.saldoCuenta = saldoCuenta;
        this.numCuenta = numCuenta;
    }

    public Persona getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(Persona titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String devolverInfoString() {
        return "titular"+this.titularCuenta.devolverInfoString(); // TODO completar en casa
    }
}
