package examenfundamentosporgramacionparcial2;

import javax.swing.*;

/**
 *
 * @author LPB-20
 */
public class ExamenFundamentosPorgramacionParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.leerDatos();
        cliente1.calcularFactura();
        cliente1.mostrarFactura();
        System.exit(0);
    }

}

class Cliente {

    String nombreCliente, rfc;
    int tipoHabitacion, nochesEstancia;
    double descuento, montoSubtotal, montoTotalFinal;

    void leerDatos() {
        nombreCliente = JOptionPane.showInputDialog("Ingresa el nombre del cliente");
        rfc = JOptionPane.showInputDialog("Ingresa el RFC del cliente");
        tipoHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tipo de habitacion del cliente"));
        nochesEstancia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las noches de estancia del cliente"));
    }

    void calcularFactura() {
        switch (tipoHabitacion) {
            case 1:
                montoSubtotal = nochesEstancia * 1890;
                break;
            case 2:
                montoSubtotal = nochesEstancia * 1950;
                break;
            case 3:
                montoSubtotal = nochesEstancia * 2000;
                break;
            case 4:
                montoSubtotal = nochesEstancia * 2320;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Has seleccionado un tipo de habitacion invalida, CERRANDO PROGRAMA");
                System.exit(0);
                break;
        }

        if (nochesEstancia >= 5) {
            descuento = montoSubtotal * 0.07;
        }

        montoTotalFinal = montoSubtotal - descuento;

    }

    void mostrarFactura() {
        JOptionPane.showMessageDialog(null, "HOTEL TECNO PALACE\nNombre del cliente: " + nombreCliente + "\nRFC: " + rfc + "\nTipo de Habitacion: " + tipoHabitacion + "\nNumero de noches: " + nochesEstancia + "\nMonto subtotal: $" + montoSubtotal + "\nDescuento 7% (aplica en 5 noches o mas): $" + descuento + "\nMonto total a pagar: $" + montoTotalFinal);
    }

}
