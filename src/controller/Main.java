package controller;

import model.electrodomestico.Electrodomestico;
import model.electrodomestico.Frigorifico;
import model.electrodomestico.Lavadora;

public class Main {

    public static void main(String[] args) {

       Lavadora  l1 = new Lavadora("zanussi","sdfs2",200,'a',1,
               0.5, 40,"Frontal",1200,true);

       String [] nuevoLg2017 = {"no-frost","ciclico"};
        Frigorifico f1 = new Frigorifico("lg","fdf",1000
                ,'s',2,1,3
                ,50,30,nuevoLg2017);

        System.out.println(f1);
        System.out.println(l1);


        Lavadora tienda = new Lavadora();

    }
}
