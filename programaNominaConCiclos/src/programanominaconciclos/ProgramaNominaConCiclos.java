package programanominaconciclos;

import javax.swing.*;

public class ProgramaNominaConCiclos {

    public static void main(String[] args) {
        double SueldoTotalAcumuladoDeLaEmpresa = 0;
        String variableAcumuladora = "Nominas de trabajadores TTVampi Industries\n";

        //Preguntando la variable sentinela, es decir cuantas veces ser va a repetir el ciclo for
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de trabajadores que vas a registrar"));

        //Creado los sueldos máximos y  minimos:
        Empleado empleadoConSueldoMaximo = new Empleado();
        empleadoConSueldoMaximo.sueldoFinal = -10000000;
        Empleado empleadoConSueldoMinimo = new Empleado();
        empleadoConSueldoMinimo.sueldoFinal = 10000000;

        for (int i = 1; i <= n; i++) {
            //Creando empleado reciente a evaluar
            Empleado empleadoReciente = new Empleado();
            empleadoReciente.leerDatos();
            empleadoReciente.calcularSueldo();

            //Evaluando si el empleado es el de MAYOR salario
            if (empleadoReciente.sueldoFinal >= empleadoConSueldoMaximo.sueldoFinal) {
                empleadoConSueldoMaximo.nombre = empleadoReciente.nombre;
                empleadoConSueldoMaximo.sueldoPorHora = empleadoReciente.sueldoPorHora;
                empleadoConSueldoMaximo.horasTrabajadas = empleadoReciente.horasTrabajadas;
                empleadoConSueldoMaximo.sueldoFinal = empleadoReciente.sueldoFinal;
            }

            //Evaluando si el empleado es el de MENOR salario
            if (empleadoReciente.sueldoFinal <= empleadoConSueldoMinimo.sueldoFinal) {
                empleadoConSueldoMinimo.nombre = empleadoReciente.nombre;
                empleadoConSueldoMinimo.sueldoPorHora = empleadoReciente.sueldoPorHora;
                empleadoConSueldoMinimo.horasTrabajadas = empleadoReciente.horasTrabajadas;
                empleadoConSueldoMinimo.sueldoFinal = empleadoReciente.sueldoFinal;
            }

            //Acumulando los salarios finales de cada empleado
            SueldoTotalAcumuladoDeLaEmpresa = empleadoReciente.sueldoFinal + SueldoTotalAcumuladoDeLaEmpresa;

            //Acumulando los strings para mostrar un recibo con todos los empleados
            variableAcumuladora = variableAcumuladora + "\n\n" + empleadoReciente.mostrarDatos();

            //Las siguientes lineas solo es para comprobar si esta ejecutandose bien el programa mostrando los valores en consola
            System.out.println("Sueldo acumulado" + SueldoTotalAcumuladoDeLaEmpresa);
            System.out.println("Sueldo Maximo" + empleadoConSueldoMaximo.sueldoFinal);
            System.out.println("Sueldo Minimo" + empleadoConSueldoMinimo.sueldoFinal);
            System.out.println(variableAcumuladora);
        } //AQUI TERMINA EL CICLO
        JOptionPane.showMessageDialog(null, variableAcumuladora + "\n\n\nEMPLEADO CON MAYOR SUELDO:\n" + empleadoConSueldoMaximo.mostrarDatos()
                + "\n\nEMPLEADO CON MENOR SUELDO:\n" + empleadoConSueldoMinimo.mostrarDatos() + "\n\nNomina total a pagar de todos los empleados: $" + SueldoTotalAcumuladoDeLaEmpresa + "\n\nTrabajadores en total: " + n);
        System.exit(0);
    }

}

/*Aqui iria una clase asignar() para hacer mas eficiente el codigo
 */
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
        variableParaConcatenarDatos = "Recibo de nomina \nNombre del trabajador: " + nombre + "\nSueldo por hora: $" + sueldoPorHora + "\nHoras Trabajadas: " + horasTrabajadas + " horas" + "\nSueldo final: $" + sueldoFinal;
        return (variableParaConcatenarDatos);
    }
}
