import java.util.List;
import javax.swing.*;
import java.util.Arrays;

class Numerus {
    private Op op;

    public Numerus(Op op) {
        this.op = op;
    }

    public void analisarEcalcular() {
        List<String> valores = op.getValores();
        List<String> operadores = op.getOperadores();

        // Verifica se não tem nada
        if (valores.isEmpty()) {
            mostrarErro("Nada pra Calcular, patrão!");
            return;
        }

        // Verifica se termina com operador
        String ultimo = valores.get(valores.size() - 1);
        if (operadores.contains(ultimo)) {
            mostrarErro("Erro: expressão termina com operador, patrão!");
            return;
        }

        double resultado = 0;
        String operacaoatu = "+";

        for (String valor : valores) {
            if (operadores.contains(valor)) {
                operacaoatu = valor;
            } else {
                try {
                    double numero = Double.parseDouble(valor);
                    switch (operacaoatu) {
                        case "+":
                            resultado += numero;
                            break;
                        case "-":
                            resultado -= numero;
                            break;
                        case "*":
                            resultado *= numero;
                            break;
                        case "/":
                            if (numero == 0) {
                                ImageIcon icone = new ImageIcon(getClass().getResource("/doggyweapon.jpg"));
                                JOptionPane.showMessageDialog(
                                        null,
                                        "Erro: Divisão por zero",
                                        "Erro de operação",
                                        JOptionPane.ERROR_MESSAGE,
                                        icone
                                );
                                return;
                            }
                            resultado /= numero;
                            break;
                    }
                } catch (NumberFormatException e) {
                    mostrarErro("Erro: valor inválido - " + valor);
                    return;
                }
            }
        }
        ImageIcon icone = new ImageIcon(getClass().getResource("/doggyweapon.jpg"));
        JOptionPane.showMessageDialog(
                null,
                "Resultado: " + resultado,
                "Results",
                JOptionPane.ERROR_MESSAGE,
                icone
        );
        op.getValores().clear(); // limpa pra nova operação
    }

    private void mostrarErro(String msg) {
        ImageIcon icone = new ImageIcon(getClass().getResource("/doggysuit.jpg"));
        JOptionPane.showMessageDialog(
                null,
                msg,
                "Erro de operação",
                JOptionPane.ERROR_MESSAGE,
                icone
        );
    }
}
