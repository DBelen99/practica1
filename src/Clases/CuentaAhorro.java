package Clases;

public class CuentaAhorro extends CuentaBancaria{
    private float tipoInteres;

    public CuentaAhorro() {
    }

    public CuentaAhorro(Persona titularCuenta, double saldoCuenta, String numCuenta, float tipoInteres) {
        super(titularCuenta, saldoCuenta, numCuenta); //llama a la clase padre
        this.tipoInteres = tipoInteres;
    }

    public float getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(float tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString()+"Interes"+this.tipoInteres;
    }
}
