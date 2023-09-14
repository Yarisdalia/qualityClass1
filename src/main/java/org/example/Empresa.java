package org.example;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Persona> personas;

    public Empresa(String n, ArrayList<Persona> ps){
        this.nombre = n;
        this.personas = ps;
    }

    public void imprimirListaNombresEmpleados () {
        for (int i = 0; i < personas.size(); i++) {
            Persona actualPersona = personas.get(i);
            int numeroLista = i + 1;
            System.out.println("Persona " + numeroLista + " : " + actualPersona.getNombre() + " tiene un salario de " + actualPersona.getSalario());
        }
    }

    public int calcularSalarioTotal () {
        int salarioTotal = 0;
        for (int i = 0; i < personas.size(); i++) {
            Persona actualPersona = personas.get(i);
            salarioTotal = salarioTotal + actualPersona.getSalario();
        }
        return salarioTotal;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
}
