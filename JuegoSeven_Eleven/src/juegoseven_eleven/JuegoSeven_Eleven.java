package juegoseven_eleven;

import javax.swing.*;

public class JuegoSeven_Eleven {

    public static void main(String[] args) {
        Jugar juego1 = new Jugar();
        juego1.pedirNombre();
        juego1.calcularJuego();
        System.exit(0);
    }

}

class Jugar {

    String nombre;
    int dado1, dado2, sumaPrimerTirada, sumaTiradasRecursivas;

    void pedirNombre() {
        JOptionPane.showMessageDialog(null, "Hola! Bienvenido al juego Seven-Eleven\nListo para jugar?...");
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre por favor uwu");
    }

    void calcularJuego() {
        //Asignando los valores del 1 al 6 de los dados
        dado1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
        dado2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;

        //Sumando las caras de la primer tirada
        sumaPrimerTirada = dado1 + dado2;

        switch (sumaPrimerTirada) {
            case 7,11 -> {
                JOptionPane.showMessageDialog(null, "Estás de suerte " + nombre + "\nHAS GANADO!!\nTu primer tirada fue de: " + sumaPrimerTirada);
            }
            case 2,3,12 -> {
                JOptionPane.showMessageDialog(null, "La suerte no está contigo " + nombre + "\nHAS PERDIDO!!\nTu primer tirada fue de: " + sumaPrimerTirada);
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Vamos a seguir tirando, sacaste: " + sumaPrimerTirada + " en tu primer tirada");
                int numeroDeTirada = 1;
                while (true) {
                    dado1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                    dado2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                    sumaTiradasRecursivas = dado1 + dado2;
                    if (sumaPrimerTirada == sumaTiradasRecursivas) {
                        JOptionPane.showMessageDialog(null, "Estás de suerte " + nombre + "\nAL FIN GANASTE!!\nTu primer tirada fue de: " + sumaPrimerTirada + "\nY en esta tirada sacaste lo mismo: " + sumaTiradasRecursivas);
                        break;

                    }
                    if (sumaTiradasRecursivas == 7 || sumaTiradasRecursivas == 11) {
                        JOptionPane.showMessageDialog(null, "La suerte no está contigo " + nombre + "\nAL FIN PERDISTE!!\nTu primer tirada fue de: " + sumaPrimerTirada + "\nY en esta tirada sacaste: " + sumaTiradasRecursivas);
                        break;
                    }
                    numeroDeTirada++;

                    JOptionPane.showMessageDialog(null, nombre + " en esta tirada numero: " + numeroDeTirada + "\nTu resultado fue: " + sumaTiradasRecursivas + "\n\nSIGUES JUGANDO");
                }
            }

        }
    }
}
