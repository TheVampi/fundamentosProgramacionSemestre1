package tarea2_2_promedioentexto;

import javax.swing.JOptionPane;

public class Tarea2_2_promedioEnTexto {

    public static void main(String[] args) {
        Boleta boleta1 = new Boleta();
        boleta1.leerDatos();
        boleta1.calcularPromedios();
        JOptionPane.showMessageDialog(null, boleta1.mostrarDatos());
        System.exit(0);

    }
}

class Alumno {

    String nombreAlumno, numeroControl;
    byte semestre;

    void leerDatos() {
        nombreAlumno = JOptionPane.showInputDialog("Teclea nombre del Alumno");
        numeroControl = JOptionPane.showInputDialog("Teclea el numero de control del Alumno: " + nombreAlumno);
        semestre = Byte.parseByte(JOptionPane.showInputDialog("Teclea el semestre del alumno"));
    }

    String mostrarDatos() {
        String variableParaMostrarDatos;
        variableParaMostrarDatos = "Número de Control: " + numeroControl + "\nNombre: " + nombreAlumno + "\nSemestre: " + semestre;

        return (variableParaMostrarDatos);
    }
}

class Materia {

    String nombreMateria, claveMateria;
    byte creditosMateria;

    void leerDatos() {
        nombreMateria = JOptionPane.showInputDialog("Ingresa el nombre de la materia:");
        claveMateria = JOptionPane.showInputDialog("Ingrese la clave de la materia:");
        creditosMateria = Byte.parseByte(JOptionPane.showInputDialog("Teclea los creditos de la materia:"));

    }

    String mostrarDatos() {
        String variableParaMostrarDatos;
        variableParaMostrarDatos = "Materia: " + nombreMateria + "\nClave de la materia: " + claveMateria + "\nCreditos de la materia: " + creditosMateria;
        return (variableParaMostrarDatos);
    }
}

class Promedio {

    Double calif1, calif2, calif3, calif4, promedio;
    String estatus, promedioFinalEnString, decenaEnString, unidadEnString;

    void leerDatos() {
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del parcial 1:"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del parcial 2:"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del parcial 3:"));
        calif4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del parcial 4:"));

    }

    void calcularPromedio() {
        promedio = (calif1 + calif2 + calif3 + calif4) / 4;
        if (promedio >= 70) {
            estatus = "APROBADO";

        } else {
            estatus = "REPROBADO";
        }
        //A partir de aqui es el codigo para mostrar el promedio en texto
        int promedioTruncado;
        promedioTruncado = promedio.intValue();

        /*
         */
        if (promedioTruncado >= 0 & promedioTruncado <= 100) {
            if (promedioTruncado <= 19) {
                switch (promedioTruncado) {
                    case 0:
                        promedioFinalEnString = "Cero";
                        break;
                    case 1:
                        promedioFinalEnString = "Uno";
                        break;
                    case 2:
                        promedioFinalEnString = "Dos";
                        break;
                    case 3:
                        promedioFinalEnString = "Tres";
                        break;
                    case 4:
                        promedioFinalEnString = "Cuatro";
                        break;
                    case 5:
                        promedioFinalEnString = "Cinco";
                        break;
                    case 6:
                        promedioFinalEnString = "Seis";
                        break;
                    case 7:
                        promedioFinalEnString = "Siete";
                        break;
                    case 8:
                        promedioFinalEnString = "Ocho";
                        break;
                    case 9:
                        promedioFinalEnString = "Nueve";
                        break;
                    case 10:
                        promedioFinalEnString = "Diez";
                        break;
                    case 11:
                        promedioFinalEnString = "Once";
                        break;
                    case 12:
                        promedioFinalEnString = "Doce";
                        break;
                    case 13:
                        promedioFinalEnString = "Trece";
                        break;
                    case 14:
                        promedioFinalEnString = "Catorce";
                        break;
                    case 15:
                        promedioFinalEnString = "Quince";
                        break;
                    case 16:
                        promedioFinalEnString = "Dieciseis";
                        break;
                    case 17:
                        promedioFinalEnString = "Diecisiete";
                        break;
                    case 18:
                        promedioFinalEnString = "Dieciocho";
                        break;
                    case 19:
                        promedioFinalEnString = "Diecinueve";
                        break;
                }

            } else {

                switch (promedioTruncado) {
                    case 20:
                        promedioFinalEnString = "Veinte";
                        break;
                    case 21:
                        promedioFinalEnString = "Veintiuno";
                        break;
                    case 22:
                        promedioFinalEnString = "Veintidos";
                        break;
                    case 23:
                        promedioFinalEnString = "Veintitres";
                        break;
                    case 24:
                        promedioFinalEnString = "Veinticuatro";
                        break;
                    case 25:
                        promedioFinalEnString = "Veinticinco";
                        break;
                    case 26:
                        promedioFinalEnString = "Veintiseis";
                        break;
                    case 27:
                        promedioFinalEnString = "Veintisiete";
                        break;
                    case 28:
                        promedioFinalEnString = "Veintiocho";
                        break;
                    case 29:
                        promedioFinalEnString = "Veintinueve";
                        break;
                    case 30:
                        promedioFinalEnString = "Treinta";
                        break;
                    case 40:
                        promedioFinalEnString = "Cuarenta";
                        break;
                    case 50:
                        promedioFinalEnString = "Cincuenta";
                        break;
                    case 60:
                        promedioFinalEnString = "Sesenta";
                        break;
                    case 70:
                        promedioFinalEnString = "Setenta";
                        break;
                    case 80:
                        promedioFinalEnString = "Ochenta";
                        break;
                    case 90:
                        promedioFinalEnString = "Noventa";
                        break;
                    case 100:
                        promedioFinalEnString = "Cien";
                        break;
                    default: {
                        int decenas, unidades;
                        double unidadesConPunto;

                        {

                            decenas = (promedioTruncado / 10);
                            unidadesConPunto = (promedio % 10);
                            unidades = (int) unidadesConPunto;
                            System.out.println(decenas); //Para comprobar en consola nada mas
                            System.out.println(unidades); //Para comprobar en consola nada mas
                        }

                        switch (decenas) {
                            case 3:
                                decenaEnString = "Treinta y ";
                                break;
                            case 4:
                                decenaEnString = "Cuarenta y ";
                                break;
                            case 5:
                                decenaEnString = "Cincuenta y ";
                                break;
                            case 6:
                                decenaEnString = "Sesenta y ";
                                break;
                            case 7:
                                decenaEnString = "Setenta y ";
                                break;
                            case 8:
                                decenaEnString = "Ochenta y ";
                                break;
                            case 9:
                                decenaEnString = "Noventa y ";
                                break;
                        }

                        switch (unidades) {
                            case 1:
                                unidadEnString = "uno";
                                break;
                            case 2:
                                unidadEnString = "dos";
                                break;
                            case 3:
                                unidadEnString = "tres";
                                break;
                            case 4:
                                unidadEnString = "cuatro";
                                break;
                            case 5:
                                unidadEnString = "cinco";
                                break;
                            case 6:
                                unidadEnString = "seis";
                                break;
                            case 7:
                                unidadEnString = "siete";
                                break;
                            case 8:
                                unidadEnString = "ocho";
                                break;
                            case 9:
                                unidadEnString = "nueve";
                                break;
                        }

                        promedioFinalEnString = (decenaEnString + unidadEnString);
                    }
                    ;

                }

            }
        } else {
            promedioFinalEnString = "Promedio no válido, excede de 100 estas wey";
        }

    }

    String mostrarDatos() {
        String variableParaMostrarDatos;
        variableParaMostrarDatos = "Calificacion del Parcial 1: " + calif1 + "\n Calificacion del Parcial 2: " + calif2 + "\n Calificacion del Parcial 3: " + calif3
                + "\n Calificacion del Parcial 4: " + calif4 + "\n Promedio final: " + promedio;
        return (variableParaMostrarDatos);
    }
}

class Boleta {

    Alumno alumno1 = new Alumno();
    Promedio promedio1 = new Promedio();
    Materia materia1 = new Materia();

    void leerDatos() {
        alumno1.leerDatos();
        materia1.leerDatos();
        promedio1.leerDatos();
    }

    void calcularPromedios() {
        promedio1.calcularPromedio();
    }

    String mostrarDatos() {
        String variableParaMostrarDatos;
        variableParaMostrarDatos = "Boleta de calificaciones \n" + alumno1.mostrarDatos() + "\n" + materia1.mostrarDatos() + "\n" + promedio1.mostrarDatos() + "\n El alumno esta: " + promedio1.estatus + "\nTu promedio final es: " + promedio1.promedioFinalEnString;
        return (variableParaMostrarDatos);
    }
}
