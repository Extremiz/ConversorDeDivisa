package conversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesTemperatura {


    ConvertirTemperatura temperatura = new ConvertirTemperatura();


    public void ConvertirTemperatura(double valor) {

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la Temperaturas que quieras Convertir ",  "Temperaturas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin",
                                "De Kelvin a Celsius", "De Kelvin a Fahrenheit",},
                "Seleccion")).toString();

        switch (opcion) {
            case "De Celsius a Fahrenheit":
                temperatura.ConvertirCelsiusFahrenheit(valor);
                break;

            case "De Celsius a Kelvin":
                temperatura.ConvertirCelisusKelvin(valor);
                break;


            case "De Fahrenheit a Celsius":
                temperatura.ConvertirFahrenheitCelsius(valor);
                break;

            case "De Fahrenheit a Kelvin":
                temperatura.ConvertirFahrenheitKelvin(valor);
                break;

            case "De Kelvin a Celsius":
                temperatura.ConvertirKelvinCelsius(valor);
                break;

            case "De Kelvin a Fahrenheit":
                temperatura.ConvertirKelvinFahrenheit(valor);
                break;
        }
    }
}
