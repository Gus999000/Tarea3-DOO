package parte_gráfica;
/**Ventana de la aplicación
 * @author Gustavo González
 * @version versión 4, 2 de junio de 2024*/
import javax.swing.*;
import java.awt.*;
public class VentanaAplicación extends JFrame {
    /**Constructor de la ventana*/
    public VentanaAplicación() {
        super();
        this.setSize(1500, 800);
        this.setTitle("Aplicación");
        this.setLayout(new BorderLayout());
        this.add(new PanelPrincipal(), BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}