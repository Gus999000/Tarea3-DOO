package parte_gráfica;
/**Ventana de la aplicación
 * @author Gustavo González
 * @version versión 1, 26 de mayo 2024*/
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Ventana extends JFrame {
    public Ventana() {
        super();
        this.setTitle("Aplicación");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1500,1000);
        this.setVisible(true);
    }
}