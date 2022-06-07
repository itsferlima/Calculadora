package desing;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import logica.Soma;
import logica.Subtracao;
import logica.Multiplicacao;
import logica.Divisao;

public class ActionCalculadora extends AbstractAction {
    private JTextField n1;
    private JTextField n2;
    private JComboBox<String> operacao;
    // Scanner input = new Scanner();

    public ActionCalculadora() { }

    public ActionCalculadora(JComboBox<String> operacao, JTextField n1, JTextField n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;

    }

    public JComboBox<String> getOperacao() {
        return operacao;
    }

    public void setOperacao(JComboBox<String> operacao) {
        this.operacao = operacao;
    }

    public JTextField getN1() {
        return n1;
    }

    public void setN1(JTextField n1) {
        this.n1 = n1;
    }

    public JTextField getN2() {
        return n2;
    }

    public void setN2(JTextField n2) {
        this.n2 = n2;
    }

    // public static validarNum() {
    //     try {
    //         double num = Integer.parseDouble(n);
    //         return num;
    //     } catch (Exception e) {
    //         System.out.println("Não é um número.");
    //     }
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(operacao.getSelectedItem().equals("Somar")) {
            double x = Double.parseDouble(n1.getText());
            double y = Double.parseDouble(n2.getText());
            Soma soma = new Soma(x, y);
            JOptionPane.showMessageDialog(null,
            String.format("O resultado da soma %.2f + %.2f é %.2f", x, y, soma.operacao()),
            "Resultado", JOptionPane.INFORMATION_MESSAGE
            );
 
        } else if(operacao.getSelectedItem().equals("Multiplicação")) {
            double x = Double.parseDouble(n1.getText());
            double y = Double.parseDouble(n2.getText());
            Multiplicacao multiplicacao = new Multiplicacao(x, y);
            JOptionPane.showMessageDialog(null,
            String.format("O resultado da multiplição é %.2f x %.2f é %.2f", x, y, multiplicacao.operacao()),
            "Resultado", JOptionPane.INFORMATION_MESSAGE
            );
        } else if(operacao.getSelectedItem().equals("Divisao")) {
            double x = Double.parseDouble(n1.getText());
            double y = Double.parseDouble(n2.getText());
            Divisao divisao = new Divisao(x, y);
            JOptionPane.showMessageDialog(null,
            String.format("O resultado da divisao é %.2f / %.2f é %.2f", x, y, divisao.operacao()),
            "Resultado", JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            double x = Double.parseDouble(n1.getText());
            double y = Double.parseDouble(n2.getText());
            Subtracao sub = new Subtracao(x, y);
            JOptionPane.showMessageDialog(null,
            String.format("O resultado da subtracao é de %.2f - %.2f é %.2f", x, y, sub.operacao()),
            "Resultado", JOptionPane.INFORMATION_MESSAGE
            );
        }
        
    }
}