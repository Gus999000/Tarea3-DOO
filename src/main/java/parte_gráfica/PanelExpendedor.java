package parte_gráfica;
/**Panel de la clase expendedor
 * @author Gustavo González
 * @version versión 2, 26 de mayo 2024*/
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Color;
public class PanelExpendedor extends JPanel {
    /**Constructor del panel del expendedor*/
    public PanelExpendedor() {
        super();
        this.setSize(60,80);
        this.setLayout(new GridLayout(3, 2));
        this.add(new JButton("CocaCola"));
        this.add(new JButton("Sprite"));
        this.add(new JButton("Fanta"));
        this.add(new JButton("Snickers"));
        this.add(new JButton("Super8"));
    }
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillRect(100,100,600,800);
    }
}