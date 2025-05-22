import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Op {
    private List<String> valores = new ArrayList<>();
    private final List<String> operadores = Arrays.asList("+", "-", "*", "/");

    public void add(String valor) {
        valores.add(valor);
    }

    public List<String> getValores() {
        return valores;
    }

    public List<String> getOperadores() {
        return operadores;
    }

    // Método opcional para limpar os valores, se quiser usar no futuro
    public void reset() {
        valores.clear();
    }
}