package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade7 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (m):"));
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc));
    }
}