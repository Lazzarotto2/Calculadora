import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;

public class Borda {

    public static TitledBorder createTitledBorder(String titulo) {
        Border bordaPadrao = BorderFactory.createEtchedBorder();
        return BorderFactory.createTitledBorder(bordaPadrao, titulo);
    }
}