import java.util.List;
import javax.swing.*;
import java.util.Arrays;

class Numerus {
    private Op op;

    public Numerus(Op op) {
        this.op = op;
    }

    public void analisarEcalcular() {
        if (op.getValores().isEmpty()) {
            ImageIcon icone = new ImageIcon(getClass().getResource("/doggy_suit(1).jpg"));
            JOptionPane.showMessageDialog(
                    null,
                    "Nada pra Calcular, patron!",
                    "Erro na operação",
                    JOptionPane.ERROR_MESSAGE,
                    icone
            );
            return;
        };

        double resultado = 0;
        List<String> operador = op.getOperadores();
        String operacaoatu = "+";
        for (String valor : op.getValores()) {
            if (operador.contains(valor)) {
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
                                ImageIcon icone = new ImageIcon(getClass().getResource("/doggy_weapon.jpg"));
                                JOptionPane.showMessageDialog(null,
                                        "Erro: Divisão por zero",
                                        "Erro de operação",
                                        JOptionPane.ERROR_MESSAGE,
                                        icone

                                );
                                resultado /= numero;
                                break;

                            }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro: valor inválido - " + valor);
                    return;

                }
            }


        }
        ;
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        op.getValores().clear(); // limpa pra nova operação
    }
}






