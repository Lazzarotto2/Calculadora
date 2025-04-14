import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Buton {
    private Op op;
    private Numerus analisarEcalcular;
    public Buton(Op op, Numerus analisarEcalcular){
        this.op = op;
        this.analisarEcalcular = analisarEcalcular;
    }

    private StringBuilder numeroAtual = new StringBuilder();
    public  void criarJanela() {
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



        button1.setActionCommand("1");
        button2.setActionCommand("2");
        button3.setActionCommand("3");
        button4.setActionCommand("4");
        button5.setActionCommand("5");
        button6.setActionCommand("6");
        button7.setActionCommand("7");
        button8.setActionCommand("8");
        button9.setActionCommand("9");
        buttonplus.setActionCommand("+");
        buttonmulti.setActionCommand("*");
        buttonminus.setActionCommand("-");
        buttondiv.setActionCommand("/");
        buttoningual.setActionCommand("=");


        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("0");
                System.out.println("x: " + numeroAtual);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("1");
                System.out.println("x: " + numeroAtual);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("2");
                System.out.println("x: " + numeroAtual);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("3");
                System.out.println("x: " + numeroAtual);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("4");
                System.out.println("x: " + numeroAtual);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("5");
                System.out.println("x: " + numeroAtual);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("6");
                System.out.println("x: " + numeroAtual);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("7");
                System.out.println("x: " + numeroAtual);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("8");
                System.out.println("x: " + numeroAtual);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAtual.append("9");
                System.out.println("x: " + numeroAtual);
            }
        });
        buttonplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroAtual.length() > 0) {
                    op.add(numeroAtual.toString());
                    numeroAtual.setLength(0);
                }
                op.add("+");
                System.out.println("Adicionado: +");
            }
        });
        buttonminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroAtual.length() > 0) {
                    op.add(numeroAtual.toString());
                    numeroAtual.setLength(0);
                }
                op.add("-");
                System.out.println("Adicionado: -");
            }
        });
        buttonmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroAtual.length() > 0) {
                    op.add(numeroAtual.toString());
                    numeroAtual.setLength(0);
                }
                op.add("*");
                System.out.println("Adicionado: *");
            }
        });
        buttondiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroAtual.length() > 0) {
                    op.add(numeroAtual.toString());
                    numeroAtual.setLength(0);
                }
                op.add("/");
                System.out.println("Adicionado: /");
            }
        });
        buttoningual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!op.add("=")) {
                    return;
                };
                Numerus.analisarEcalcular();

                System.out.println("Realizou a conta.");
            }
        });





















        JPanel panel = new JPanel();
        panel.setBorder(Borda.createTitledBorder("Calculadora"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.add(buttonPanel,BorderLayout.CENTER);
        frame.add(secondButtonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
        }

    }


