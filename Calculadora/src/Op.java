import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.util.Arrays;

public class Op {



    private List<String> valores = new ArrayList<>();
    public void add(String valor) {
        List<String> operadores = Arrays.asList("+", "-", "*", "/");

        if (!valores.isEmpty()) {
            String ultimo = valores.get(valores.size() - 1);

            if (operadores.contains(ultimo) && operadores.contains(valor)) {
                ImageIcon icone = new ImageIcon(getClass().getResource("/Image.jpg"));
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: Tu ta escrevendo 2 operadores patrão, não pode.",
                        "Erro de operação",
                        JOptionPane.ERROR_MESSAGE,
                        icone
                );

                return;
            }

        } else {
            if (operadores.contains(valor)) {
                ImageIcon icone = new ImageIcon(getClass().getResource("/Image.jpg"));
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: expressão não pode começar com operador!",
                        "Erro de operação",
                        JOptionPane.ERROR_MESSAGE,
                        icone
                );
                return;
            }
        }

        valores.add(valor);
        System.out.println("Adicionado: " + valor);
    }

    public List<String> getValores() {
        return valores;
    }
}