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

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", especialidades=" + especialidades + ", sueldos=" + sueldos + '}';
    }

}

class Ciudad {
    private String nombre;
    private String provincia;

    public Ciudad(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", provincia=" + provincia + '}';
    }
    
}

class Medico {
    private String nombre_doc;
    private String especialidad;
    private double sueldo;

    public Medico(String nombre_doc, String especialidad, double sueldo) {
        this.nombre_doc = nombre_doc;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Medico{" + "nombre_doc=" + nombre_doc + ", especialidad=" + especialidad + ", sueldo=" + sueldo + '}';
    }

}

class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;

    public Enfermero(String nombre, String tipo, double sueldo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Enfermero{" + "nombre=" + nombre + ", tipo=" + tipo + ", sueldo=" + sueldo + '}';
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
        
        Ciudad ciudad1 = new Ciudad(nombreciudad,nombreprovincia);
        Medico medicos[] = new Medico[nmedicos];
        Enfermero enfermeros[] = new Enfermero[nenfermeros];
        double sueldototal = 0;
        int cantEspecialidades = 0;
        for (int i = 0; i < nmedicos; i++) {
            System.out.println("Ingrese el nombre del medico " + (i + 1) + ": ");
            String nombreMedico = sc.next();
            System.out.println("Ingrese la especialidad del medico " + (i + 1) + ": ");
            String nombreEspecialidad = sc.next();
            System.out.println("Ingrese el sueldo mensual" + (i + 1) + ": ");
            double sueldodoc = sc.nextDouble();
            medicos[i] = new Medico(nombreMedico,nombreEspecialidad,sueldodoc);
            sueldototal = sueldototal + sueldodoc;
            cantEspecialidades++;
        }
        
        for (int i = 0; i < nmedicos; i++) {
            System.out.println("Ingrese el nombre del enfermero " + (i + 1) + ": ");
            String nombreEnfer = sc.next();
            System.out.println("Ingrese la especialidad del enfermero " + (i + 1) + ": ");
            String nombreEspecialidad = sc.next();
            System.out.println("Ingrese el sueldo mensual" + (i + 1) + ": ");
            double sueldoEnfer = sc.nextDouble();
            enfermeros[i] = new Enfermero(nombreEnfer,nombreEspecialidad,sueldoEnfer);
            sueldototal = sueldototal + sueldoEnfer;
            cantEspecialidades++;
        }
        
        Hospital hospi = new Hospital(nombrehospi,ciudad1,cantEspecialidades,medicos,enfermeros,sueldototal);
        System.out.println("\n" + hospi + "\n");
        
        for(Medico medicoaux: medicos) {
            System.out.println(medicoaux);
        }
        
        for(Enfermero enfermeroaux: enfermeros) {
            System.out.println(enfermeroaux);
        }
    }
    
}
