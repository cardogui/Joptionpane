package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade1 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, numero + " é POSITIVO.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, numero + " é NEGATIVO.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ZERO.");
        }
    }
}