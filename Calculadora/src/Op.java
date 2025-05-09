import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.util.Arrays;

public class Op {
    public List<String> getOperadores() {
        return Arrays.asList("+", "-", "*", "/","=");
    }


    private List<String> valores = new ArrayList<>();
    public boolean add(String valor) {
        List<String> operadores = Arrays.asList("+", "-", "*", "/", "=");

        if (!valores.isEmpty()) {
            String ultimo = valores.get(valores.size() - 1);

            if (operadores.contains(ultimo) && operadores.contains(valor)) {
                ImageIcon icone = new ImageIcon(getClass().getResource("/doggyweapon.jpg"));
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: Tu tá escrevendo 2 operadores, patrão. Não pode.",
                        "Erro de operação",
                        JOptionPane.ERROR_MESSAGE,
                        icone
                );
                return false;
            }
        } else {
            if (operadores.contains(valor)) {
                ImageIcon icone = new ImageIcon(getClass().getResource("/Image.jpg"));
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: Expressão não pode começar com operador!",
                        "Erro de operação",
                        JOptionPane.ERROR_MESSAGE,
                        icone
                );
                return false;
            }
        }

        valores.add(valor);
        System.out.println("Adicionado: " + valor);
        System.out.println("Lista atual: " + valores);
        return true;
    }


    public List<String> getValores() {
        return valores;
    }
}