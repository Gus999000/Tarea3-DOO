package parte_gráfica;
/**Panel principal de la aplicación
 * @author Gustavo González
 * @version 2, 26 de mayo de 2024*/
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
public class PanelPrincipal extends JPanel {
    /***/
    private PanelComprador com;
    /***/
    private PanelExpendedor exp;
    /**Constructor del panel principal*/
    public PanelPrincipal () {
        super();
        this.setSize(1500,1000);
        this.setLayout(new BorderLayout());
        this.add(new PanelComprador(), BorderLayout.EAST);
        this.add(new PanelExpendedor(), BorderLayout.CENTER);
        this.setBackground(Color.white);
    }
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        com.paintComponent(g);
        exp.paintComponent(g);
    }
}