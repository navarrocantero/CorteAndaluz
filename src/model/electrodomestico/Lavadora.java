package model.electrodomestico;

import model.Util;

import java.text.DecimalFormat;

/**
 * Created by Laptop on 30/03/2017.
 */
public class Lavadora extends Electrodomestico {

    private String bocaCarga;
    private double maxCentrifugado;
    private boolean esSecadora;
    public  DecimalFormat formateador = new DecimalFormat(".##");

    // Constructores


    // Constructor sin parametros
    public Lavadora() {
    }

    ;

    // Constructor con todos los parametros ( PREDETERMINADO )

    public Lavadora(String marca, String modelo, double precioBase,
                    char consumoEnergetico, double altura, double anchura, double peso,
                    String bocaCarga, double maxCentrifugado, boolean esSecadora) {

        super(marca, modelo, precioBase, consumoEnergetico, altura, anchura, peso);
        this.setBocaCarga(bocaCarga);
        this.setMaxCentrifugado(maxCentrifugado);
        this.setEsSecadora(esSecadora);
    }


    // Accesores

    // Getters

    public String getBocaCarga() {
        return bocaCarga;
    }

    public double getMaxCentrifugado() {
        return maxCentrifugado;
    }

    public boolean isEsSecadora() {
        return esSecadora;
    }

    // Setters

    public void setBocaCarga(String bocaCarga) {
        this.bocaCarga = Util.checkEmptyString(bocaCarga);
    }

    public void setMaxCentrifugado(double maxCentrifugado) {
        this.maxCentrifugado = Util.checkPositiveDouble(maxCentrifugado);
    }

    public void setEsSecadora(boolean esSecadora) {
        this.esSecadora = esSecadora;
    }

    @Override
    public String toString() {
        return
                " Lavadora \n" +
                " Tipo boca = " + bocaCarga + "\n" +
                " Centrifugado = " + maxCentrifugado + " RPM\n" +
                " Secadora  = " + esSecadora + "\n" +
                super.toString();

    }


    // Metodos de obligada insercion en la clase pero sin implementacion

    public Double ingresoTotalLavadoras (Lavadora...lavaArgs){
        double recuento = 0;

        for (Lavadora lav :lavaArgs){

            recuento =+ lav.precioVentaPublico();

        }

        return recuento;}

    public void encender() {

    }

    public void apagar() {
    }
}
