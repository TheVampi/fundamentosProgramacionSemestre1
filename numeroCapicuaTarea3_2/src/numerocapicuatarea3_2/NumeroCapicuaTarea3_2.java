package numerocapicuatarea3_2;

import javax.swing.*;

public class NumeroCapicuaTarea3_2 {

    public static void main(String[] args) {
        NumeroCapicua primerNumero = new NumeroCapicua();
        primerNumero.ingresarNumero();
        primerNumero.calcularCapicua();
        primerNumero.mostrarDatos();
        System.exit(0);
    }

}

class NumeroCapicua {

    int numeroBase, numeroInvertido;
    String capicuaSiONo;

    void ingresarNumero() {
        numeroBase = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero positivo"));
    }

    void calcularCapicua() {
        int numeroBaseParaConvertir;
        numeroBaseParaConvertir = numeroBase;

        numeroInvertido = 0;

        while (numeroBaseParaConvertir > 0) {
            int ultimoDigito;
            ultimoDigito = numeroBaseParaConvertir % 10;
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;
            numeroBaseParaConvertir = numeroBaseParaConvertir / 10;
        }

        if (numeroBase == numeroInvertido) {
            capicuaSiONo = "\n\nEl numero SI ES CAPICUA";
        } else {
            capicuaSiONo = "\n\nEl numero NO ES CAPICUA";
        }
    }

    void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Numero inicial: " + numeroBase + "\n\nNumero invertido: " + numeroInvertido + capicuaSiONo);

    }
}
