import java.awt.*;
import java.awt.event.ActionEvent;
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
        JButton buttonplus = new JButton("+");
        JButton buttoningual = new JButton("=");

        button1.setActionCommand("1");
        button2.setActionCommand("2");
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


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);
        frame.add(buttonplus);
        frame.add(buttoningual);
        frame.setVisible(true);
        }

    }


