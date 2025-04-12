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
        List<String> operadores = Arrays.asList("+", "-", "*", "/","=");
        if(!valores.equals("=")){
            if(!valores.isEmpty() && operadores.contains(valores.get(valores.size() -1))){
                ImageIcon icone = new ImageIcon(getClass().getResource("/Image.jpg"));
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: A expressão termina com operador, patron.",
                        "Erro de operação",
                        JOptionPane.ERROR_MESSAGE,
                        icone
                );
                return false;
            }
            return true;
        }
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

                return false;
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
                return false;
            }
            return true;
        }

        valores.add(valor);
        System.out.println("Adicionado: " + valor);
        System.out.println("Lista atual:" + valores);
        return true;
    }

    public List<String> getValores() {
        return valores;
    }
}