package ConversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {


    public void ConvertirPesosDolares(double valor){
        double monedaDolar = valor/740.00;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " +monedaDolar+ "Dolares");
    }

    public void ConvertirPesosEuros(double valor){
        double monedaEuro = valor/372.84;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " +monedaEuro+ "Euros");
    }

    public void ConvertirPesosYenes(double valor) {
        double monedaYen = valor / 0.42;
        monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
    }

    public void ConvertirDolaresPesos(double valor) {
        double monedaPeso = 740.00 * valor;
        monedaPeso = (double)Math.round(monedaPeso * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaPeso + " en pesos");
    }

    public void ConvertirEurosPesos(double valor) {
        double monedaEuro = valor * 372.84;
        monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
    }

    public void ConvertirYenPesos(double valor) {
        double monedaYen = valor * 0.42;
        monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
    }
}
