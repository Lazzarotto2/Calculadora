import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Buton {
    private Op op;
    public Buton(Op op){
        this.op = op;
    }
    private StringBuilder numeroAtual = new StringBuilder();
    public  void criarJanela() {

        JFrame frame = new JFrame("Calculadora");
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
        buttoningual.setActionCommand("=");




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
        JPanel panel = new JPanel();
        panel.setBorder(Borda.createTitledBorder("Hello"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonplus);
        frame.add(buttoningual);
        frame.setVisible(true);
        }

    }


