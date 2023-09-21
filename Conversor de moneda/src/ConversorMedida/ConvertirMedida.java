package ConversorMedida;

import javax.swing.JOptionPane;
public class ConvertirMedida {
    public void ConvertirCentimetrosMilimetros(double valor){
        double medidaMilimetro = valor*10.00;
        medidaMilimetro = (double) Math.round(medidaMilimetro * 100d)/100;
        JOptionPane.showMessageDialog(null,"Son " +medidaMilimetro+ " Milimetros");
    }

    public void ConvertirCentimetrosMetros(double valor){
        double medidaMetro = valor/100.00;
        medidaMetro = (double) Math.round(medidaMetro * 100d)/100;
        JOptionPane.showMessageDialog(null,"Son " +medidaMetro+ " Metros");
    }

    public void ConvertirCentimetrosKilometros(double valor) {
        double medidaKilometro = valor / 100000.00;
        medidaKilometro = (double)Math.round(medidaKilometro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidaKilometro + " Kilometros");
    }

    public void ConvertirMilimetrosCentimetros(double valor) {
        double medidaCentimetro = valor / 10;
        medidaCentimetro = (double)Math.round(medidaCentimetro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidaCentimetro + " Centimetros");
    }

    public void ConvertirMilimetrosMetros(double valor) {
        double medidadMetro = valor / 1000.00;
        medidadMetro = (double)Math.round(medidadMetro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidadMetro + " Metros");
    }

    public void ConvertirMilimetrosKilometros(double valor) {
        double medidaKilometro = valor / 1000000.00;
        medidaKilometro = (double)Math.round(medidaKilometro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidaKilometro + " Kilometros");
    }

    public void ConvertirMetrosCentimetros(double valor) {
        double medidaCentimetro = valor * 100.00;
        medidaCentimetro = (double)Math.round(medidaCentimetro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidaCentimetro + " Centimetros");
    }

    public void ConvertirMetrosMilimetros(double valor) {
        double medidadMetro = valor * 1000.00;
        medidadMetro = (double)Math.round(medidadMetro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidadMetro + " Metros");
    }
    public void ConvertirMetrosKilometros(double valor) {
        double medidaKilometro = valor / 1000.00;
        medidaKilometro = (double)Math.round(medidaKilometro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidaKilometro + " Kilometro");
    }

    public void ConvertirKilometrosMilimetros(double valor) {
        double medidaMilimetro = valor * 1000000.00;
        medidaMilimetro = (double)Math.round(medidaMilimetro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidaMilimetro + " Milimetros");
    }

    public void ConvertirKilometrosCentimetros(double valor) {
        double medidaCentimetro = valor * 100000.00;
        medidaCentimetro = (double)Math.round(medidaCentimetro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidaCentimetro + " Centimetros");
    }

    public void ConvertirKilometrosMetros(double valor) {
        double medidadMetro = valor * 1000.00;
        medidadMetro = (double)Math.round(medidadMetro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + medidadMetro + " Metros");
    }
}
