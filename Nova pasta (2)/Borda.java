import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class Borda {
    public static Border createTitledBorder(String titulo) {
        return BorderFactory.createTitledBorder(
            BorderFactory.createEtchedBorder(), 
            titulo, 
            TitledBorder.LEFT, 
            TitledBorder.TOP
        );
    }
}