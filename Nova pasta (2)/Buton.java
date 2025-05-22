import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Buton {
    private Op op;
    private JLabel display;

    public Buton(Op op, JLabel display){
        this.op = op;
        this.display = display;
    }

    private StringBuilder numeroAtual = new StringBuilder();

    public void criarJanela() {
        JLabel resultadoLabel = new JLabel("Expressão: ");
        resultadoLabel.setBounds(20, 250, 300, 30);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        JFrame frame = new JFrame("Calculadora");

        JPanel secondButtonPanel = new JPanel(new GridLayout(4, 3, 5, 5));

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        JButton buttonplus = new JButton("+");
        JButton buttoningual = new JButton("=");
        JButton buttonmulti = new JButton("X");
        JButton buttondiv = new JButton("÷");
        JButton buttonminus = new JButton("-");

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);

        secondButtonPanel.add(buttonplus);
        secondButtonPanel.add(buttoningual);
        secondButtonPanel.add(buttonmulti);
        secondButtonPanel.add(buttondiv);
        secondButtonPanel.add(buttonminus);

        button1.addActionListener(e -> {
            numeroAtual.append("1");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "1");
        });
        button2.addActionListener(e -> {
            numeroAtual.append("2");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "2");
        });
        button3.addActionListener(e -> {
            numeroAtual.append("3");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "3");
        });
        button4.addActionListener(e -> {
            numeroAtual.append("4");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "4");
        });
        button5.addActionListener(e -> {
            numeroAtual.append("5");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "5");
        });
        button6.addActionListener(e -> {
            numeroAtual.append("6");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "6");
        });
        button7.addActionListener(e -> {
            numeroAtual.append("7");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "7");
        });
        button8.addActionListener(e -> {
            numeroAtual.append("8");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "8");
        });
        button9.addActionListener(e -> {
            numeroAtual.append("9");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "9");
        });
        button0.addActionListener(e -> {
            numeroAtual.append("0");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "0");
        });

        buttonplus.addActionListener(e -> {
            if (numeroAtual.length() > 0) {
                op.add(numeroAtual.toString());
                numeroAtual.setLength(0);
            }
            op.add("+");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "+");
        });

        buttonminus.addActionListener(e -> {
            if (numeroAtual.length() > 0) {
                op.add(numeroAtual.toString());
                numeroAtual.setLength(0);
            }
            op.add("-");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "-");
        });

        buttonmulti.addActionListener(e -> {
            if (numeroAtual.length() > 0) {
                op.add(numeroAtual.toString());
                numeroAtual.setLength(0);
            }
            op.add("*");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "*");
        });

        buttondiv.addActionListener(e -> {
            if (numeroAtual.length() > 0) {
                op.add(numeroAtual.toString());
                numeroAtual.setLength(0);
            }
            op.add("/");
            resultadoLabel.setText("Expressão: " + resultadoLabel.getText().replace("Expressão: ", "") + "/");
        });

        buttoningual.addActionListener(e -> {
            if (numeroAtual.length() > 0) {
                op.add(numeroAtual.toString());
                numeroAtual.setLength(0);
            }
            Numerus analisarEcalcular = new Numerus(op, resultadoLabel);
            analisarEcalcular.analisarEcalcular();
        });

        JPanel panel = new JPanel();
        panel.setBorder(Borda.createTitledBorder("Calculadora"));
        frame.add(resultadoLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(secondButtonPanel, BorderLayout.SOUTH);
        frame.add(display, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}