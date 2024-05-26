package parte_gráfica;
/**Panel principal de la aplicación
 * @author Gustavo González
 * @version 1, 26 de mayo de 2024*/
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
public class PanelPrincipal extends JPanel {
    /***/
    private PanelComprador com;
    /***/
    private PanelExpendedor exp;
    /***/
    public PanelPrincipal () {
        super();
        com = new PanelComprador();
        exp = new PanelExpendedor();
        this.setBackground(Color.white);
    }
    /***/
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        com.paintComponent(g);
        exp.paintComponent(g);
    }
}