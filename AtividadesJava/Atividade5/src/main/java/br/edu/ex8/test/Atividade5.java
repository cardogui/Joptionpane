package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade5 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        double media = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null, "A média das três notas é: " + media);
    }
}