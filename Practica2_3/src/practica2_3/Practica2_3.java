package practica2_3;

import javax.swing.*;

public class Practica2_3 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.leerDatos();
        empleado1.calcularSueldo();
        JOptionPane.showMessageDialog(null, empleado1.mostrarDatos());
        System.exit(0);
    }

}

class Empleado {

    String nombre;
    double sueldoPorHora, sueldoFinal;
    int horasTrabajadas;

    void leerDatos() {
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del trabajador");
        sueldoPorHora = Float.parseFloat(JOptionPane.showInputDialog("Hola " + nombre + " ingresa tu sueldo por hora"));
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas que trabajaste:"));
    }

    void calcularSueldo() {
        if (horasTrabajadas <= 40) {
            sueldoFinal = sueldoPorHora * horasTrabajadas; //Si las horas son menores o iguales a 40 se ejecuta esta linea
        } else {
            if (horasTrabajadas <= 50) {
                sueldoFinal = (sueldoPorHora * 40) + (((horasTrabajadas - 40) * sueldoPorHora) * 1.5); //si las horas son menores o iguales a 50 se ejecuta esta linea
            } else {
                sueldoFinal = (sueldoPorHora * 40) + (sueldoPorHora * 10 * 1.5) + (((horasTrabajadas - 50) * sueldoPorHora) * 2); //si las horas son mayores a 50 se ejecuta esta linea
            }
        }
    }

    String mostrarDatos() {
        String variableParaConcatenarDatos;
        variableParaConcatenarDatos = "Recibo de nómina \nNombre del trabajador: " + nombre + "\nSueldo por hora: $" + sueldoPorHora + "\nHoras Trabajadas: " + horasTrabajadas + " horas" + "\nSueldo final: $" + sueldoFinal;
        return (variableParaConcatenarDatos);
    }
}
