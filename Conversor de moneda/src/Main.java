import javax.swing.*;

import ConversorMedida.OpcionesMedidas;
import ConversorMoneda.OpcionesDivisa;
import conversorTemperatura.OpcionesTemperatura;

public class Main {
    public static void main(String[] args) {
        OpcionesDivisa moneda = new OpcionesDivisa();
        OpcionesTemperatura temperatura = new OpcionesTemperatura();
        OpcionesMedidas medida = new OpcionesMedidas();
        boolean check = true;
        while (check){
            String options = (JOptionPane.showInputDialog(null,"Seleccione tipo de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Conversor de Divisa","Conversor de Temperatura", "Conversor de medida"},"Seleccion")).toString();

            switch (options){
                case "Conversor de Divisa":
                    String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir: ");
                    if(ValidarNumero(input)) {
                        double Mynput = Double.parseDouble(input);
                        moneda.ConvertirMoneda(Mynput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra operacion?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opcion afirmativa");
                        } else {
                            check = false;
                            JOptionPane.showConfirmDialog(null, "Fin del programa");

                        }
                    }else{
                        JOptionPane.showConfirmDialog(null,"Valor Invalido");
                    }
                    break;

                case  "Conversor de Temperatura":
                    String inputT = JOptionPane.showInputDialog("Ingrese la medida a convertir: ");
                    if(ValidarNumero(inputT)) {
                        double MynputT = Double.parseDouble(inputT);
                        temperatura.ConvertirTemperatura(MynputT);

                        int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra operacion?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opcion afirmativa");
                        } else {
                            check = false;
                            JOptionPane.showConfirmDialog(null, "Fin del programa");

                        }
                    }else{
                        JOptionPane.showConfirmDialog(null,"Valor Invalido");
                    }
                    break;

                case  "Conversor de medida":
                    String inputM = JOptionPane.showInputDialog("Ingrese la medida a convertir: ");
                    if(ValidarNumero(inputM)) {
                        double MynputM = Double.parseDouble(inputM);
                        medida.ConvertirMedida(MynputM);

                        int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra operacion?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opcion afirmativa");
                        } else {
                            check = false;
                            JOptionPane.showConfirmDialog(null, "Fin del programa");

                        }
                    }else{
                        JOptionPane.showConfirmDialog(null,"Valor Invalido");
                    }
                    break;

            }
        }
    }
    public static boolean ValidarNumero(String input){
        try{
            double x = Double.parseDouble(input);
            if(x >= 0 || x< 0);
                return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
