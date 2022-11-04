package examenparcial3;

import javax.swing.*;

public class ExamenParcial3 {

    public static void main(String[] args) {
        int numeroJugadores;

        numeroJugadores = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos jugadores vas a registrar en el equipo?"));

        String variableAcumuladora = "INFORME GENERAL DEL EQUIPO DE BASQUETBOL\nNumero de jugadores registrados: " + numeroJugadores;

        Jugador jugadorMayor = new Jugador();
        jugadorMayor.promedioCanastasAnotadas = -1000000000;
        Jugador jugadorMenor = new Jugador();
        jugadorMenor.promedioCanastasAnotadas = 1000000000;

        for (int i = 1; i <= numeroJugadores; i++) {
            Jugador jugadorReciente = new Jugador();
            jugadorReciente.leerDatos();
            jugadorReciente.calcularPromedio();

            if (jugadorReciente.promedioCanastasAnotadas > jugadorMayor.promedioCanastasAnotadas) {
                jugadorMayor.nombre = jugadorReciente.nombre;
                jugadorMayor.tirosCanasta = jugadorReciente.tirosCanasta;
                jugadorMayor.canastasAnotadas = jugadorReciente.canastasAnotadas;
                jugadorMayor.asistenciasRealizadas = jugadorReciente.asistenciasRealizadas;
                jugadorMayor.promedioCanastasAnotadas = jugadorReciente.promedioCanastasAnotadas;
            }

            if (jugadorReciente.promedioCanastasAnotadas < jugadorMenor.promedioCanastasAnotadas) {
                jugadorMenor.nombre = jugadorReciente.nombre;
                jugadorMenor.tirosCanasta = jugadorReciente.tirosCanasta;
                jugadorMenor.canastasAnotadas = jugadorReciente.canastasAnotadas;
                jugadorMenor.asistenciasRealizadas = jugadorReciente.asistenciasRealizadas;
                jugadorMenor.promedioCanastasAnotadas = jugadorReciente.promedioCanastasAnotadas;
            }

            variableAcumuladora = variableAcumuladora + "\n\n" + jugadorReciente.mostrarDatos();

        }
        JOptionPane.showMessageDialog(null, variableAcumuladora + "\n\nJUGADOR CON MEJOR PROMEDIO DE CANASTAS ANOTADAS: \n"+jugadorMayor.mostrarDatos()+ "\n\nJUGADOR CON PEOR PROMEDIO DE CANASTAS ANOTADAS: \n"+jugadorMenor.mostrarDatos());
        System.exit(0);
    }

}

class Jugador {

    String nombre;
    
    int canastasAnotadas, tirosCanasta,  asistenciasRealizadas;
    float BBC,promedioCanastasAnotadas;

    void leerDatos() {
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del jugador: ");
        tirosCanasta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los tiros a la canasta realizados:"));
        canastasAnotadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa canastas anotadas:"));
        asistenciasRealizadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las asistencias realizadas:"));
    }

    void calcularPromedio() {
        BBC = canastasAnotadas + asistenciasRealizadas;
        promedioCanastasAnotadas = BBC / tirosCanasta * 1000;
    }

    String mostrarDatos() {
        String aux;
        aux = "Nombre del jugador: " + nombre + "\nTiros a la canasta realizados: " + tirosCanasta + "\nCanastas anotadas: " + canastasAnotadas + "\nAsistencias realizadas: " + asistenciasRealizadas + "\nPromedio de canastas anotadas: " + promedioCanastasAnotadas;
        return (aux);
    }

}
