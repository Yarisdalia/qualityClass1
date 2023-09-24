package org.example;

import java.util.ArrayList;

public class Jefe extends Persona{
    ArrayList<String> beneficios;
    public Jefe(String nombre, int edad, int salario, ArrayList<String> otrosBeneficios) {
        super(nombre, edad, salario);
        this.beneficios = new ArrayList<>();
        this.beneficios.add("Jaba de Pollo");
        for (int i=0; i<otrosBeneficios.size();i++){
            this.beneficios.add(otrosBeneficios.get(i));
        }
    }
}
