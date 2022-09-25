package practica2_1;

import javax.swing.JOptionPane;

public class Practica2_1 {

    public static void main(String[] args) {
        Boleta boleta1 = new Boleta();
        boleta1.leerDatos();
        boleta1.calcularPromedios();
        JOptionPane.showMessageDialog(null, boleta1.mostrarDatos());
        System.exit(0);
        
    }
}

class Alumno {

    String nombreAlumno, numeroControl;
    byte semestre;

    void leerDatos() {
        nombreAlumno = JOptionPane.showInputDialog("Teclea nombre del Alumno");
        numeroControl = JOptionPane.showInputDialog("Teclea el numero de control del Alumno: " + nombreAlumno);
        semestre = Byte.parseByte(JOptionPane.showInputDialog("Teclea el semestre del alumno"));
    }

    String mostrarDatos() {
        String variableParaMostrarDatos;
        variableParaMostrarDatos = "Número de Control: " + numeroControl + "\nNombre: " + nombreAlumno + "\nSemestre: " + semestre;

        return (variableParaMostrarDatos);
    }
}

class Materia {

    String nombreMateria, claveMateria;
    byte creditosMateria;

    void leerDatos() {
        nombreMateria = JOptionPane.showInputDialog("Ingresa el nombre de la materia:");
        claveMateria = JOptionPane.showInputDialog("Ingrese la clave de la materia:");
        creditosMateria = Byte.parseByte(JOptionPane.showInputDialog("Teclea los creditos de la materia:"));

    }

    String mostrarDatos() {
        String variableParaMostrarDatos;
        variableParaMostrarDatos = "Materia: " + nombreMateria + "\nClave de la materia: " + claveMateria + "\nCreditos de la materia: " + creditosMateria;
        return (variableParaMostrarDatos);
    }
}

class Promedio {

    Double calif1, calif2, calif3, calif4, promedio;
    String estatus;

    void leerDatos() {
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del parcial 1:"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del parcial 2:"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del parcial 3:"));
        calif4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del parcial 4:"));

    }

    void calcularPromedio() {
        promedio = (calif1 + calif2 + calif3 + calif4) / 4;
        if (promedio >= 70) {
            estatus = "APROBADO";

        } else {
            estatus = "REPROBADO";
        }
    }

    String mostrarDatos() {
        String variableParaMostrarDatos;
        variableParaMostrarDatos = "Calificacion del Parcial 1: " + calif1 + "\n Calificacion del Parcial 2: " + calif2 + "\n Calificacion del Parcial 3: " + calif3
                + "\n Calificacion del Parcial 4: " + calif4 + "\n Promedio final: " + promedio;
        return (variableParaMostrarDatos);
    }
}

class Boleta {

    Alumno alumno1 = new Alumno();
    Promedio promedio1 = new Promedio();
    Materia materia1 = new Materia();

    void leerDatos() {
        alumno1.leerDatos();
        materia1.leerDatos();
        promedio1.leerDatos();
    }
    
    void calcularPromedios(){
        promedio1.calcularPromedio();
    }
    
    String mostrarDatos(){
        String variableParaMostrarDatos;
        variableParaMostrarDatos = "Boleta de calificaciones \n"+alumno1.mostrarDatos()+"\n"+materia1.mostrarDatos()+"\n"+promedio1.mostrarDatos()+"\n El alumno esta: "+promedio1.estatus;
        return(variableParaMostrarDatos);
    }
}