package ConversorMoneda;

import javax.swing.JOptionPane;
public class OpcionesDivisa {
    ConvertirMoneda monedas = new ConvertirMoneda();
    public void ConvertirMoneda(double valor){
       String opcion = (JOptionPane.showInputDialog(null,"¿Que conversion deseas hacer?","Conversiones",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"De Pesos a Dólares", "De Pesos a Euros", "De Pesos a Yenes", "De Dólares a Pesos", "De Euros a Pesos", "De Yenes a Pesos"},
                "Seleccion")).toString();

    switch (opcion){
        case "De Pesos a Dólares":
            monedas.ConvertirPesosDolares(valor);
            break;
        case "De Pesos a Euros":
            monedas.ConvertirPesosEuros(valor);
            break;
        case "De Pesos a Yenes":
            monedas.ConvertirPesosYenes(valor);
            break;
        case "De Dólares a Pesos":
            monedas.ConvertirDolaresPesos(valor);
            break;

        case "De Euros a Pesos":
            monedas.ConvertirEurosPesos(valor);
            break;
        case "De Yenes a Pesos":
            monedas.ConvertirYenPesos(valor);
            break;
    }
    }

}
