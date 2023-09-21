package conversorTemperatura;

import javax.swing.JOptionPane;
public class ConvertirTemperatura {
    public void ConvertirCelsiusFahrenheit(double valor) {
        double CFahrenheit = (valor * 1.8) + 32;
        CFahrenheit = (double)Math.round(CFahrenheit * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + CFahrenheit + " Fahrenheit");
    }
    public void ConvertirCelisusKelvin(double valor) {
        double CKelvin = valor + 273.15;
        CKelvin = (double)Math.round(CKelvin * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + CKelvin + " Kelvin");
    }


    public void ConvertirFahrenheitCelsius(double valor) {
        double FCelsius = (valor - 32) * ( 0.556 );
        FCelsius = (double)Math.round(FCelsius * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + FCelsius + " Celsius");
    }
    public void ConvertirFahrenheitKelvin(double valor) {
        double FKelvin = (valor + 459.67)*(0.556);
        FKelvin = (double)Math.round(FKelvin * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + FKelvin + " Kelvin");
    }

    public void ConvertirKelvinCelsius(double valor) {
        double KCelsius = valor - 273.15;
        KCelsius = (double)Math.round(KCelsius * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + KCelsius + " Celsius");
    }
    public void ConvertirKelvinFahrenheit(double valor) {
        double KFahrenhit = ((valor - 273.15) * (1.8)) + 32;
        KFahrenhit = (double)Math.round(KFahrenhit * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Son " + KFahrenhit + " Fahrenheit");
    }

}
