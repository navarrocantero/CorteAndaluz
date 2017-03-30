package model.electrodomestico;
import java.util.Arrays;

import static model.electrodomestico.Util.checkPositiveDouble;

/**
 * Created by Laptop on 30/03/2017.
 */
public class Frigorifico extends Electrodomestico {

    private double capaCidadTotal;
    private double capacidadCongelador;
    private String[] masCaracteristicas;


    // Constructores

    // Constructor sin parametros
    public Frigorifico() {
    }

    // Constructor predeterminad ocon todos los parametros

    public Frigorifico(String marca, String modelo, double precioBase,
                       char consumoEnergetico, double altura,
                       double anchura, double peso, double capaCidadTotal, double capacidadCongelador, String[] masCaracteristicas) {
        super(marca, modelo, precioBase, consumoEnergetico, altura, anchura, peso);
        this.setCapaCidadTotal(capaCidadTotal);
        this.setCapacidadCongelador(capacidadCongelador);
        this.setMasCaracteristicas(masCaracteristicas);

    }


    // Accesores

    // Getters
    public double getCapaCidadTotal() {
        return capaCidadTotal;
    }

    public double getCapacidadCongelador() {
        return capacidadCongelador;
    }

    public String[] getMasCaracteristicas() {
        return masCaracteristicas;
    }


    // Setters


    public void setCapaCidadTotal(double capaCidadTotal) {
        this.capaCidadTotal = checkPositiveDouble(capaCidadTotal);
    }

    public void setCapacidadCongelador(double capacidadCongelador) {
        this.capacidadCongelador = checkPositiveDouble(capacidadCongelador);
    }

    public void setMasCaracteristicas(String[] masCaracteristicas) {
        this.masCaracteristicas = masCaracteristicas;
    }


    @Override
    public String toString() {
        return
                " Frigorifico \n" +
                " Capacidad Total = " + capaCidadTotal + " litros \n" +
                " Capacidad Congelador = " + capacidadCongelador + " litros \n" +
                " Otras caracteristicas  = " + Arrays.toString(masCaracteristicas)
                        + "\n" + super.toString();
    }

    // Metodos de obligada insercion en la clase pero sin implementacion


    public void encender() {
    }

    public void apagar() {
    }


    public Double ingresoTotalFrigorificos (Frigorifico...frigoArg){
        double recuento = 0;
        for (Frigorifico frig :frigoArg){
            recuento =+ frig.precioVentaPublico();

        }
    return recuento;
    }


}
