package parte_gráfica;
/**Ventana de la aplicación
 * @author Gustavo González
 * @version versión 3, 2 de junio de 2024*/
import javax.swing.JFrame;
import java.awt.BorderLayout;
public class Ventana extends JFrame {
    /**Constructor de la ventana*/
    public Ventana() {
        super();
        this.setSize(1500, 800);
        this.setTitle("Aplicación");
        this.setLayout(new BorderLayout());
        this.add(new PanelPrincipal(), BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}