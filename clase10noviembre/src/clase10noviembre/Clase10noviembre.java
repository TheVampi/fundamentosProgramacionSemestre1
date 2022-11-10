package clase10noviembre;

import javax.swing.*;

public class Clase10noviembre {

    public static void main(String[] args) {
        Matrices objeto1 = new Matrices();
        //Creando y leyendo la primera matriz
        int[][] matriz1;
        matriz1 = objeto1.leerMatriz();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matriz1));

        //Creando y leyendo la segunda matriz
        JOptionPane.showMessageDialog(null, "Ahora vamos a crear otra matriz");
        int[][] matriz2;
        matriz2 = objeto1.leerMatriz();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matriz2));
        
        //Evalua si son del mismo orden las matrices creadas
        if ((matriz1.length == matriz2.length) && (matriz1[0].length == matriz2[0].length)) {
            
            //Calculando la suma de la primera y la segunda
            int[][] matriz3 = new int[matriz1.length][matriz1[0].length];
            objeto1.sumarMatriz(matriz1, matriz2, matriz3);

            //Calculando la RESTA de la PRIMERA menos la SEGUNDA
            int[][] matriz4 = new int[matriz1.length][matriz1[0].length];
            objeto1.restarMatriz(matriz1, matriz2, matriz4);

            //Calculando la RESTA de la SEGUNDA menos la PRIMERA
            int[][] matriz5 = new int[matriz1.length][matriz1[0].length];
            objeto1.restarMatriz(matriz2, matriz1, matriz5);

            //Mostrando todas
            JOptionPane.showMessageDialog(null, "Matriz 1\n" + objeto1.mostrarMatriz(matriz1) + "\n\nMatriz 2:\n" + objeto1.mostrarMatriz(matriz2) + "\n\nMatriz 1 + Matriz 2:\n" + objeto1.mostrarMatriz(matriz3) + "\n\nMatriz 1 - Matriz 2:\n" + objeto1.mostrarMatriz(matriz4) + "\n\nMatriz 2 - Matriz 1:\n" + objeto1.mostrarMatriz(matriz5));

        } 
        else {
            JOptionPane.showMessageDialog(null, "Las matrices no son del mismo orden, no se pueden hacer operaciones");
        }

    }

}

class Matrices {

    //Metodo para pedir y asignar datos a una matriz
    int[][] leerMatriz() {
        int filas, columnas;
        //Pidiendo las dimensiones del arreglo
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas"));

        //Creando el arreglo
        int[][] unArreglo = new int[filas][columnas];

        //Llenando con datos
        for (int filaParaLlenar = 0; filaParaLlenar < unArreglo.length; filaParaLlenar++) {
            for (int columnaParaLlenar = 0; columnaParaLlenar < unArreglo[0].length; columnaParaLlenar++) {
                unArreglo[filaParaLlenar][columnaParaLlenar] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la fila " + filaParaLlenar + " columna " + columnaParaLlenar));
            }
        }
        return (unArreglo);
    }

    //Metodo para mostrar datos
    String mostrarMatriz(int[][] matrizParaMostrar) {
        String auxiliar = "CONTENIDO DE LA MATRIZ\n\n";
        for (int fila = 0; fila < matrizParaMostrar.length; fila++) {
            for (int columna = 0; columna < matrizParaMostrar[0].length; columna++) {
                auxiliar = auxiliar + matrizParaMostrar[fila][columna] + "  ";
            }
            auxiliar = auxiliar + "\n";
        }
        return (auxiliar);
    }

    //Metodo para sumar arreglos
    void sumarMatriz(int[][] matrizAEvaluar1, int[][] matrizAEvaluar2, int[][] matrizresultante) {
        for (int fila = 0; fila < matrizAEvaluar1.length; fila++) {
            for (int columna = 0; columna < matrizAEvaluar1[0].length; columna++) {
                matrizresultante[fila][columna] = matrizAEvaluar1[fila][columna] + matrizAEvaluar2[fila][columna];
            }
        }
    }

    //Metodo para restar arreglos
    void restarMatriz(int[][] matrizAEvaluar1, int[][] matrizAEvaluar2, int[][] matrizresultante) {
        for (int fila = 0; fila < matrizAEvaluar1.length; fila++) {
            for (int columna = 0; columna < matrizAEvaluar1[0].length; columna++) {
                matrizresultante[fila][columna] = matrizAEvaluar1[fila][columna] - matrizAEvaluar2[fila][columna];
            }
        }
    }
}
