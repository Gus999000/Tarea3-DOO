package parte_gráfica;
/**Panel de la clase comprador
 * @author Gustavo González
 * @version versión 2, 26 de mayo 2024*/
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class PanelComprador extends JPanel {
    /**Constructor del panel del comprador*/
    public PanelComprador() {
        super();
        this.setSize(400,600);
    }
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(1000,100,400,600);
    }
}