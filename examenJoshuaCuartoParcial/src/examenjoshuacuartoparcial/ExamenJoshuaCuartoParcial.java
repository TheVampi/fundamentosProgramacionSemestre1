
package examenjoshuacuartoparcial;

import javax.swing.JOptionPane;

public class ExamenJoshuaCuartoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglos objeto1 = new Arreglos();
        int[][] arregloOriginal;
        arregloOriginal = objeto1.leerMatrizYLlenarRandom();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(arregloOriginal));
        //String aux = objeto1.mostrarMatriz(arregloOriginal);
        int[][] arrParaOrdenar = new int[arregloOriginal.length][arregloOriginal[0].length];
        objeto1.ordenamientoEspecial(arregloOriginal, arrParaOrdenar);
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(arrParaOrdenar));
        JOptionPane.showMessageDialog(null, "RESULTADOS\n\nPRIMERA MATRIZ"+objeto1.mostrarMatriz(arregloOriginal) + "MATRIZ RESULTANTE\n"+objeto1.mostrarMatriz(arrParaOrdenar));
    }

}

class Arreglos {

    //Metodo para llenar matrices con valores random de tipo entero con rango n a n
    int[][] leerMatrizYLlenarRandom() {
        int filas, columnas;
        //Pidiendo las dimensiones del arreglo
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas"));

        //Creando el arreglo
        int[][] unArreglo = new int[filas][columnas];

        //Llenando con datos
        for (int filaParaLlenar = 0; filaParaLlenar < unArreglo.length; filaParaLlenar++) {
            for (int columnaParaLlenar = 0; columnaParaLlenar < unArreglo[0].length; columnaParaLlenar++) {
                unArreglo[filaParaLlenar][columnaParaLlenar] = (int) (Math.random() * (30 + 1) + (0)); //Math.random() * (valor maximo + 1) + (valor minimo)
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

    //Metodo de Ordenamiento
    void ordenamientoEspecial(int[][] mat1, int[][] matOrdenada) {
        int valor = 1;
        if (mat1.length == mat1[0].length) {
            //Llenando arreglo
            for (int filaParaLlenar = 0; filaParaLlenar < matOrdenada.length; filaParaLlenar++) {
                for (int columnaParaLlenar = 0; columnaParaLlenar < matOrdenada[0].length; columnaParaLlenar++) {
                    matOrdenada[filaParaLlenar][columnaParaLlenar] = mat1[filaParaLlenar][columnaParaLlenar];
                }
            }

            for (int fila = 0; fila < mat1.length; fila++) {

                for (int col = valor; col < mat1[0].length; col++) {
                    matOrdenada[fila][col] = 500;
                }
                valor = valor + 1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "LAS MATRICES NO SON CUADRADAS NO SE PUEDE REALIZAR");
        }

    }

}