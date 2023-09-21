package ConversorMedida;

import ConversorMoneda.ConvertirMoneda;

import javax.swing.JOptionPane;

public class OpcionesMedidas {

    ConvertirMedida medidas = new ConvertirMedida();
    public void ConvertirMedida(double valor){
        String opcion = (JOptionPane.showInputDialog(null,"¿Que conversion deseas hacer?","Conversiones",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"De Centimetros a Milimetros", "De Centimetros a Metros", "De Centimetros a Kilometros", "De Milimetros a Centimetros", "De Milimetros a Metros", "De Milimetros a Kilometros", "De Metros a Milimetros", "De Metros a Centimetros", "De Metros a Kilometros", "De Kilometros a Milimetros", "De Kilometros a Centimetros", "De Kilometros a Metros"},
                "Seleccion")).toString();

        switch (opcion){
            case "De Centimetros a Milimetros":
                medidas.ConvertirCentimetrosMilimetros(valor);
                break;
            case "De Centimetros a Metros":
                medidas.ConvertirCentimetrosMetros(valor);
                break;
            case "De Centimetros a Kilometros":
                medidas.ConvertirCentimetrosKilometros(valor);
                break;
            case "De Milimetros a Centimetros":
                medidas.ConvertirMilimetrosCentimetros(valor);
                break;

            case "De Milimetros a Metros":
                medidas.ConvertirMilimetrosMetros(valor);
                break;
            case "De Milimetros a Kilometros":
                medidas.ConvertirMilimetrosKilometros(valor);
                break;

            case "De Metros a Centimetros":
                medidas.ConvertirMetrosCentimetros(valor);
                break;

            case "De Metros a Milimetros":
                medidas.ConvertirMetrosMilimetros(valor);
                break;
            case "De Metros a Kilometros":
                medidas.ConvertirMetrosKilometros(valor);
                break;

            case "De Kilometros a Centimetros":
                medidas.ConvertirKilometrosCentimetros(valor);
                break;

            case "De Kilometros a Metros":
                medidas.ConvertirKilometrosMetros(valor);
                break;
            case "De Kilometros a Milimetros":
                medidas.ConvertirKilometrosMilimetros(valor);
                break;
        }
    }
}
