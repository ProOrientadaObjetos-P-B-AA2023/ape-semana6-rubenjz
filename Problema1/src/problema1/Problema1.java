package problema1;

import java.util.Scanner;

class Hospital {
    private String nombre;
    private Ciudad ciudad;
    private int especialidades;
    private Medico medico[];
    private Enfermero enfermero[];
    private double sueldos;

    public Hospital(String nombre, Ciudad ciudad, int especialidades, Medico[] medico, Enfermero[] enfermero, double sueldos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.especialidades = especialidades;
        this.medico = medico;
        this.enfermero = enfermero;
        this.sueldos = sueldos;
    }

    public void setEspecialidades(int especialidades) {
        this.especialidades = especialidades;
    }

    public void setSueldos(double sueldos) {
        this.sueldos = sueldos;
    }

    public int getEspecialidades() {
        return especialidades;
    }

    public double getSueldos() {
        return sueldos;
    }

    public Medico[] getMedico() {
        return medico;
    }

    public Enfermero[] getEnfermero() {
        return enfermero;
    }

    
}

class Ciudad {
    private String nombre;
    private String provincia;

    public Ciudad(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }
    
}

class Medico {
    private String nombre_doc;
    private int especialidad;
    private double sueldo;

    public Medico(String nombre_doc, int especialidad) {
        this.nombre_doc = nombre_doc;
        this.especialidad = especialidad;
    }
    
}

class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;

    public Enfermero(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
}

public class Problema1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hospital: ");
        String nombrehospi = sc.nextLine();
        System.out.println("Ingrese el nombre de la ciudad: ");
        String nombreciudad = sc.nextLine();
        System.out.println("Ingrese el nombre de la provincia: ");
        String nombreprovincia = sc.nextLine();
        System.out.println("Ingrese la cantidad de medicos: ");
        int nmedicos = sc.nextInt();
        System.out.println("Ingrese la cantidad de enfermeros: ");
        int nenfermeros = sc.nextInt();
        
        Medico medicos[] = new Medico[nmedicos];
        Enfermero enfermeros[] = new Enfermero[nenfermeros];
        
        for (int i = 0; i < nmedicos; i++) {
            System.out.println("Ingrese el nombre del medico " + (i + 1) + ": ");
            String nombreMedico = sc.next();
            System.out.println("Ingrese la especialidad del medico " + (i + 1) + ": ");
            String nombreEspecialidad = sc.next();
            System.out.println("Ingrese el nombre de la materia " + (i + 1) + ": ");
            String nombreMateria = sc.next();
        }
    }
    
}
