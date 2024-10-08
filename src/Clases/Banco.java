package Clases;

import java.util.ArrayList;

public class Banco {
    //creamos la variable donde vamos a guardar
    private ArrayList<CuentaBancaria> listasDeCuentas;
    //en el constructor creamos la lista vacia
    public Banco() {
        this.listasDeCuentas=new ArrayList<>();
    }
    public boolean abrirCuenta(CuentaBancaria cuenta){

        return false;
    }
    public ArrayList<CuentaBancaria> listadoCuentas(){


    }
    public String informacionCuenta(String iban){


    }
    public boolean ingresoCuenta(String iban,double n){


    }
    public boolean retiradaCuenta(String iban,double n){


    }
    public double obtenerSaldo(String iban){


    }

}
