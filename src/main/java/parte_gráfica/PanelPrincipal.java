package parte_gráfica;
/**Panel principal de la aplicación
 * @author Gustavo González
 * @version 4, 2 de junio de 2024*/
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
        this.setLayout(new BorderLayout());
        this.com = new PanelComprador();
        this.exp = new PanelExpendedor();
        this.add(com, BorderLayout.EAST);
        this.add(exp, BorderLayout.CENTER);
        this.setBackground(Color.white);
    }
    @Override
    public void paintComponent(Graphics g) {
        com.paintComponent(g);
        exp.paintComponent(g);
    }
}