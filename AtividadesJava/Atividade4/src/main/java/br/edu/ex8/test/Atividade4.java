package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade4 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é PAR.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " é ÍMPAR.");
        }
    }
}