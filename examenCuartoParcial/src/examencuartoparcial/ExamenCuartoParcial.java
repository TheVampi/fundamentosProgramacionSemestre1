package examencuartoparcial;

import javax.swing.JOptionPane;

/**
 *
 * @author ttvampi
 */
public class ExamenCuartoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz objeto1 = new Matriz();
        int[][] matriz1;
        int[][] matriz2;

        matriz1 = objeto1.leerMatriz();
        JOptionPane.showMessageDialog(null, "CONTENIDO DE LA PRIMER MATRIZ\n" + objeto1.mostrarMatriz(matriz1));

        matriz2 = objeto1.leerMatriz();
        JOptionPane.showMessageDialog(null, "CONTENIDO DE LA SEGUNDA MATRIZ\n" + objeto1.mostrarMatriz(matriz2));

        if (matriz1.length == matriz2.length & matriz1[0].length == matriz2[0].length) {
            String aux = "CALCULADORA DE SUMATORIA DE MATRICES\n\n", mat1 = "CONTENIDO DE LA PRIMERA MATRIZ\n" + objeto1.mostrarMatriz(matriz1), mat2 = "CONTENIDO DE LA SEGUNDA MATRIZ\n" + objeto1.mostrarMatriz(matriz2);

            int[][] matrizParaHacerLaSumatoria = new int[matriz1.length][matriz1[0].length];
            objeto1.sumatoriaEspecial(matriz1, matriz2, matrizParaHacerLaSumatoria);
            aux = aux + mat1 + mat2 + "MATRIZ RESULTANTE:\n" + objeto1.mostrarMatriz(matrizParaHacerLaSumatoria);
            JOptionPane.showMessageDialog(null, aux);
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE REALIZAR LA SUMATORIA, NO SON DEL MISMO ORDEN AMBAS MATRICES");
            System.exit(0);
        }

    }

}

class Matriz {

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
                unArreglo[filaParaLlenar][columnaParaLlenar] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la fila " + (filaParaLlenar + 1) + " columna " + (columnaParaLlenar + 1)));
            }
        }
        return (unArreglo);
    }

    //Metodo para mostrar la Matriz
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

    //Sumatoria de Matrices Especial
    void sumatoriaEspecial(int[][] primeraMatriz, int[][] segundaMatriz, int[][] matrizResultante) {
        for (int filaEvaluando = 0; filaEvaluando < primeraMatriz.length; filaEvaluando++) {
            for (int columnaPrimeraMatriz = 0, columnaSegundaMatriz = segundaMatriz[0].length - 1; columnaPrimeraMatriz < primeraMatriz[0].length; columnaPrimeraMatriz++, columnaSegundaMatriz--) {
                matrizResultante[filaEvaluando][columnaPrimeraMatriz] = primeraMatriz[filaEvaluando][columnaPrimeraMatriz] + segundaMatriz[filaEvaluando][columnaSegundaMatriz];
            }
        }
    }
}
