package practica2_4programahospital;

import javax.swing.*;

public class Practica2_4ProgramaHospital {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.leerDatos();
        paciente1.calcularCosto();
        paciente1.mostrarDatos();
        System.exit(0);
    }

}

class Paciente {

    String nombrePaciente;
    int tipoDeEnfermedad, edad, diasDeEstancia;
    double costoTotal, costoPorDia;

    void leerDatos() {
        nombrePaciente = JOptionPane.showInputDialog("Ingresa tu nombre del paciente");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        diasDeEstancia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los dias de estancia en este Hospital"));
        tipoDeEnfermedad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tipo de enfermedad del paciente"));
    }

    void calcularCosto() {
        
        if (tipoDeEnfermedad >= 1 & tipoDeEnfermedad <= 4) {

            switch (tipoDeEnfermedad) {

                case 1:
                    costoPorDia = 250;
                    break;
                case 2:
                    costoPorDia = 160;
                    break;
                case 3:
                    costoPorDia = 200;
                    break;
                case 4:
                    costoPorDia = 320;
                    break;
            }
            //aqui se hacen las demas operaciones despues de asignar valores en el switch            
            
            
        } 
        else {
          costoPorDia= 0;  
        }
        costoTotal = (diasDeEstancia * costoPorDia);
        if (costoTotal > 1000 & costoTotal <= 2000) {
            costoTotal = costoTotal - (costoTotal * 0.03);
            
        }
        if (costoTotal >2000){
            costoTotal = costoTotal - (costoTotal * 0.05);
        }
        
        if(edad>=14 & edad<=22){
            costoTotal = costoTotal + (costoTotal * 0.10);
        }
    }
    
    void mostrarDatos(){
        String variableParaConcatenar;
        
        variableParaConcatenar = "Paciente: " + nombrePaciente + "\nEdad: "+ edad + "\nTipo de enfermedad: "+ tipoDeEnfermedad+ "\nDias de estancia: "+ diasDeEstancia + "\nCosto total: $" + costoTotal;
        JOptionPane.showMessageDialog(null, variableParaConcatenar);
    }
}

