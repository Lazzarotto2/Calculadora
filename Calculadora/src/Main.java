


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Op operacoes = new Op();
        JLabel display = new JLabel("Calculadora Iniciada");
        display.setHorizontalAlignment(SwingConstants.CENTER);
        Buton buton = new Buton(operacoes, display);
        buton.criarJanela();
    }
}