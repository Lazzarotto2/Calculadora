import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto Op que vai armazenar os valores e operadores
        Op op = new Op();

        // Cria o display JLabel para exibir no topo da janela
        JLabel display = new JLabel("Calculadora Iniciada");
        display.setHorizontalAlignment(SwingConstants.CENTER);

        // Cria o objeto Buton e inicia a interface
        Buton buton = new Buton(op, display);
        buton.criarJanela();
    }
}