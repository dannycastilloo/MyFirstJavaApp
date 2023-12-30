package com.danny;

import java.sql.Array;
import java.util.ArrayList;

public class Seleccion {

    String nombreEquipo;
    char grupo;
    boolean clasificadoACuartos;

    void imprimirEquipo() {
        System.out.println(nombreEquipo);
        System.out.println(grupo);
        System.out.println(clasificadoACuartos);
    }

    public static void main(String[] args) {

        Seleccion argentina = new Seleccion();
        argentina.nombreEquipo = "Argentina";
        argentina.grupo = 'C';
        argentina.clasificadoACuartos = true;

        //argentina.imprimirEquipo();

        /*
        if (argentina.clasificadoACuartos == true) {
            System.out.println("¡Clasificado!");
        } else if (argentina.clasificadoACuartos == false) {
            System.out.println("Somos malísimos");
        }
        */

        /*
        for (int i = 1; i < 11; i++) {
            System.out.println("Asiento: " + i);
        }
        */

        /*
        int j = 1;

        while (j<11) {
            System.out.println("Asiento : " + j);
            j++;
        }
        */

        /*
        int x = 0;
        int z = 5;

        try {
            System.out.println(z/x);
        } catch (Exception exception) {
            System.out.println("No se puede dividir por cero.");
        }
        */

        ArrayList<String> selecciones = new ArrayList<>();
        selecciones.add("Francia");
        selecciones.add("Inglaterra");
        selecciones.add("Brasil");
        selecciones.add("Marruecos");

        System.out.println("Contenido de selecciones: " + selecciones);

        System.out.println("Contenido obtenido con un bucle for:");

        for (String i : selecciones) {
            System.out.println("- " + i);
        }

    }

}
