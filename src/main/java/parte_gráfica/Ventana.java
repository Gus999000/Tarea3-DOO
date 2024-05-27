package parte_gráfica;
/**Ventana de la aplicación
 * @author Gustavo González
 * @version versión 2, 26 de mayo 2024*/
import javax.swing.JFrame;
import java.awt.BorderLayout;
public class Ventana extends JFrame {
    /**Constructor de la ventana*/
    public Ventana() {
        super();
        this.setTitle("Aplicación");
        this.setLayout(new BorderLayout());
        this.add(new PanelPrincipal(), BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1500,1000);
        this.setVisible(true);
    }
}