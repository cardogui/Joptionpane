package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade9 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        if (numero >= 10 && numero <= 20) {
            JOptionPane.showMessageDialog(null, numero + " está dentro do intervalo [10, 20].");
        } else {
            JOptionPane.showMessageDialog(null, numero + " está fora do intervalo [10, 20].");
        }
    }
}