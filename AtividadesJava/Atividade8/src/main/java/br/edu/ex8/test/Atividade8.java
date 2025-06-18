package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade8 {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));
        double fahrenheit = celsius * 1.8 + 32;
        JOptionPane.showMessageDialog(null, celsius + "°C é igual a " + fahrenheit + "°F");
    }
}