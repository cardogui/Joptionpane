package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade2 {
    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado!");
        } else if (nota >= 5) {
            JOptionPane.showMessageDialog(null, "Em recuperação.");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado.");
        }
    }
}