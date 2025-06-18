package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade10 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite sua nacionalidade:");
        if (idade >= 16 && nacionalidade.equalsIgnoreCase("brasileira")) {
            JOptionPane.showMessageDialog(null, "Você pode votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você NÃO pode votar.");
        }
    }
}