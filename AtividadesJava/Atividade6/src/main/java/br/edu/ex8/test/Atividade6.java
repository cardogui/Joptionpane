package br.edu.ex8.test;
import javax.swing.JOptionPane;
public class Atividade6 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");
        double resultado = 0;
        boolean operacaoValida = true;
        switch (operacao) {
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
                operacaoValida = false;
        }
        if (operacaoValida) {
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }
}