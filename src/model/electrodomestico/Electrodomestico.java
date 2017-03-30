package model.electrodomestico;

import static model.electrodomestico.Util.checkEmptyChar;
import static model.electrodomestico.Util.checkEmptyString;
import static model.electrodomestico.Util.checkPositiveDouble;


public abstract class Electrodomestico {

    private String marca;
    private String modelo;
    private double precioBase;
    private char consumoEnergetico;
    private double altura;
    private double anchura;
    private double peso;

    // Constructores

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String modelo, double precioBase, char consumoEnergetico, double altura, double anchura, double peso) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPrecioBase(precioBase);
        this.setConsumoEnergetico(consumoEnergetico);
        this.setAltura(altura);
        this.setAnchura(anchura);
        this.setPeso(peso);
    }


    //      Accesores

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getAltura() {
        return altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public double getPeso() {
        return peso;
    }


    // Setters a todos se les hace la comprobacion de que sean valores validos

    // A los String que no esten vacios, en cuyo caso se setteara el String a Unknown

    // A los tipo double se prueba que sean iguales o mayores a 0, en caso contrario se setteara a 0

    // al tipo cha para el consumo energetico se comprueba que sea un valor de los validos, en caso contrario se
    // seteara a 'X'

    public void setMarca(String marca) {
        this.marca = checkEmptyString(marca);
    }

    public void setModelo(String modelo) {
        this.modelo = checkEmptyString(modelo);
    }

    protected void setPrecioBase(double precioBase) {
        this.precioBase = checkPositiveDouble(precioBase);
    }

    protected void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = checkEmptyChar(consumoEnergetico);
    }

    protected void setAltura(double altura) {
        this.altura = checkPositiveDouble(altura);
    }

    protected void setAnchura(double anchura) {
        this.anchura = checkPositiveDouble(anchura);
    }

    protected void setPeso(double peso) {
        this.peso = checkPositiveDouble(peso);
    }

    @Override
    public String toString() {
        return " Electrodomestico\n" +
                " Marca = " + marca + '\n' +
                " Modelo = " + modelo + '\n' +
                " ConsumoEnergetico clase = " + consumoEnergetico + "\n" +
                " Altura = " + altura + " metros\n" +
                " Anchura = " + anchura + " metros\n" +
                " Peso = " + peso + " kilos\n" +
                " Precio Base = " + precioBase + " euros\n" +
                " Precio del envio =" + this.precioTransporte() + " euros\n" +
                " PVP = " + this.precioVentaPublico() + " euros\n";
    }


    /**
     * Este metodo nos calculara el precio bruto del electrodomestico
     * tomando como referencia la clase energetica a la que pertenece
     * y sumandoselo a su precio base ( precioTotal = precioBase + precioSegunReferenciaEnergetica)
     *
     * @return double con el precio que se le añadiria a nuestro aparato en funcion de la clase
     * energetica
     */
    public double precioBruto() {

        double eficienciaA = 100;
        char charA = 'a';
        double eficienciaB = 80;
        char charB = 'b';
        double eficienciaC = 60;
        char charC = 'c';
        double eficienciaD = 50;
        char charD = 'd';
        double eficienciaE = 30;
        char charE = 'e';
        double eficienciaF = 10;
        char charF = 'f';


        double precioBruto;
        double precioAux = 0;
        double precioBaseOfThis = (this.getPrecioBase());
        char eficienciaOfthis = (Character.toLowerCase(this.getConsumoEnergetico()));

        if (eficienciaOfthis == charA) {
            precioAux = eficienciaA;

        } else if (eficienciaOfthis == charB) {
            precioAux = eficienciaB;

        } else if (eficienciaOfthis == charC) {
            precioAux = eficienciaC;

        } else if (eficienciaOfthis == charD) {
            precioAux = eficienciaD;
        } else if (eficienciaOfthis == charE) {
            precioAux = eficienciaE;
        } else if (eficienciaOfthis == charF) {
            precioAux = eficienciaF;
        }


        precioBruto = precioAux + precioBaseOfThis;


        return precioBruto;
    }


    /**
     * Este metodo nos calcula el coste que tendria nuestro envio segun
     * el peso del electrodomestico
     *
     * @return double con el valor calculado del transporte
     */
    public double precioTransporte() {

        double pesoPrimeraFranja = 0;
        double pesoSegundaFranja = 20;
        double pesoTerceraFranja = 50;
        double pesoCuartaFranja = 80;

        double costePrimeraFranja = 10;
        double costeSegundaFranja = 50;
        double costeTerceraFranja = 80;
        double costeCuartaFranja = 100;

        double pesoOfThis = this.getPeso();
        double precioCalculadoSegunPeso = 0;

        if (pesoOfThis >= pesoCuartaFranja) {
            precioCalculadoSegunPeso = costeCuartaFranja;
        } else if (pesoOfThis >= pesoTerceraFranja) {
            precioCalculadoSegunPeso = costeTerceraFranja;
        } else if (pesoOfThis >= pesoSegundaFranja) {
            precioCalculadoSegunPeso = costeSegundaFranja;
        } else if (pesoOfThis > pesoPrimeraFranja) {
            precioCalculadoSegunPeso = costePrimeraFranja;
        }


        return precioCalculadoSegunPeso;
    }

    /**
     * En este metodo calculamos el precio total de venta al publico
     * que consta de ( preciobruto + precio del transporte)
     *
     * @return double con el valor totral calculado
     */
    public double precioVentaPublico() {

        double precioBruto = this.precioBruto();
        double precioTransporte = this.precioTransporte();

        double precioPvp = precioBruto + precioTransporte;

        return precioPvp;
    }


    // Metodos de obligada insercion en la clase pero sin implementacion
    protected abstract void encender();

    protected abstract void apagar();
}
