import javax.swing.*;
import java.util.List;

public class Numerus {
    private Op op;
    private JLabel resultadoLabel;

    public Numerus(Op op, JLabel resultadoLabel) {
        this.op = op;
        this.resultadoLabel = resultadoLabel;
    }

    public void analisarEcalcular() {
        if (op.getValores().isEmpty()) {
            ImageIcon icone = new ImageIcon(getClass().getResource("/doggysuit.jpg"));
            JOptionPane.showMessageDialog(
                    null,
                    "Nada pra Calcular, patron!",
                    "Erro na operação",
                    JOptionPane.ERROR_MESSAGE,
                    icone
            );
            return;
        }

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
                            if (numero != 0) {
                                resultado /= numero;
                            } else {
                                ImageIcon icone = new ImageIcon(getClass().getResource("/doggysuit.jpg"));
                                JOptionPane.showMessageDialog(null, "Divisão por zero!", "Erro", JOptionPane.ERROR_MESSAGE, icone);
                                return;
                            }
                            break;
                    }
                } catch (NumberFormatException e) {
                    ImageIcon icone = new ImageIcon(getClass().getResource("/doggysuit.jpg"));
                    JOptionPane.showMessageDialog(null, "Erro de número: " + valor, "Erro", JOptionPane.ERROR_MESSAGE, icone);
                    return;
                }
            }
        }

        ImageIcon icone = new ImageIcon(getClass().getResource("/doggysuit.jpg"));
        JOptionPane.showMessageDialog(
                null,
                "Resultado Final: " + resultado,
                "Conta Finalizada",
                JOptionPane.INFORMATION_MESSAGE,
                icone
        );
        resultadoLabel.setText("Resultado Final: " + resultado);
    }
}