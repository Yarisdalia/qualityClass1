package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }

    public static void main(String[] args) {
        Trabajador yasniel = new Trabajador("Yasniel", 28, 2900);

        ArrayList<String> otrosBeneficiosYari = new ArrayList<>();
        otrosBeneficiosYari.add("Carro");
        otrosBeneficiosYari.add("Datos Mobiles");
        otrosBeneficiosYari.add("Tarjeta de Puntos");
        Jefe yarita = new Jefe("Yarita", 22, 1000, otrosBeneficiosYari);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(yarita);
        personas.add(yasniel);

        Empresa empresa = new Empresa("InfSoft", personas);

        empresa.imprimirListaNombresEmpleados();
        System.out.println("SALARIO TOTAL EN LA EMPRESA: " + empresa.calcularSalarioTotal());
    }
}


