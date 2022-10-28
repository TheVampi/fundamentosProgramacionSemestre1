package arreglosdeunadimensiónclase27octubre;

import javax.swing.*;

/**
 *
 * @author LPB-20
 */
public class ArreglosdeUnaDimensiónClase27Octubre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asignarValoresArreglos ejecucion1 = new asignarValoresArreglos();
        //ejecucion1.ejecutarPrograma();

        ordenamientoMetodoBurbuja ejecucion1burbuja = new ordenamientoMetodoBurbuja();
        ejecucion1burbuja.ejecutarPrograma();

        System.exit(0);
    }

}

class asignarValoresArreglos {

    void ejecutarPrograma() {
        int n;
        String variableAcumuladora = "Sueldos de Trabajadores: \n";

        //Asignando la cantidad 
        n = Integer.parseInt(JOptionPane.showInputDialog("Teclea numero de elementos para el arreglo"));

        //Creacion del arreglo
        double[] sueldo = new double[n];

        for (int i = 0; i < sueldo.length; i++) {
            sueldo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa sueldo del trabajador " + (i + 1)));
        }

        //Imprimiendo los elementos del arreglo METODO 1 (Conveniente si se usa JOptionPane)
        for (int i = 0; i < sueldo.length; i++) {
            variableAcumuladora = variableAcumuladora + sueldo[i] + "\n";
        }
        System.out.println(variableAcumuladora);

        //Imprimiendo los elementos del arreglo METODO 1 (Conveniente si solo se quiere visualizar en consola)
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println(sueldo[i]);
        }
    }
}

//Metodos de ordenamiento de areglos en base a sus posiciones (METODO BURBUJA)
class ordenamientoMetodoBurbuja {

    void ejecutarPrograma() {
        int n;
        double variableAuxiliar;

        //Asignando la cantidad 
        n = Integer.parseInt(JOptionPane.showInputDialog("Teclea numero de elementos para el arreglo"));

        //Creacion del arreglo
        double[] sueldo = new double[n];
        for (int i = 0; i < sueldo.length; i++) {
            sueldo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa sueldo del trabajador " + (i + 1)));
        }

        //Ordenandolos elementos
        for (int pasadas = 1; pasadas < sueldo.length; pasadas++) {
            for (int comparaciones = 1; comparaciones <= sueldo.length - 1; comparaciones++) {

                if (sueldo[comparaciones - 1] > sueldo[comparaciones]) {
                    variableAuxiliar = sueldo[comparaciones - 1];
                    sueldo[comparaciones - 1] = sueldo[comparaciones];
                    sueldo[comparaciones] = variableAuxiliar;
                }
                
                //LO SIGUIENTE ES PARA VERIFICAR EN CONSOLA COMO FUNCIONA EL ALGORITMO EN LAS COMPARACIONES
                //La siguiente linea es solo para verificar en consola
                System.out.println("Comparacion Actual:" + comparaciones);

                //Mostrando los resultados ordenados del arreglo
                for (int i = 0; i < sueldo.length; i++) {
                    System.out.println(sueldo[i]);
                }
            }//AQUI TERMINA CICLO DE COMPARACIONES
            
            //LO SIGUIENTE ES PARA VERIFICAR EN CONSOLA COMO FUNCIONA EL ALGORITMO EN LAS PASADAS
            //La siguiente linea es solo para verificar en consola
            System.out.println("Pasada actual:" + pasadas);

            //Mostrando los resultados ordenados del arreglo
            for (int i = 0; i < sueldo.length; i++) {
                System.out.println(sueldo[i]);
            }
        }

        //Mostrando los resultados FINALES ordenados del arreglo ESTO SE MUESTRA EN CONSOLA
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println(sueldo[i]);
        }
    }
}
