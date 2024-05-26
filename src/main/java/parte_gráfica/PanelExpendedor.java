package parte_gráfica;
/**Panel de la clase expendedor
 * @author Gustavo González
 * @version versión 1, 26 de mayo 2024*/
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelExpendedor extends JPanel {
    public PanelExpendedor() {
        super();
        JButton ButtonCC = new JButton("CocaCola");
        JButton ButtonS = new JButton("Sprite");
        JButton ButtonF = new JButton("Fanta");
        JButton ButtonSS = new JButton("Snickers");
        JButton ButtonS8 = new JButton("Super8");
        this.add(ButtonCC);
        this.add(ButtonS);
        this.add(ButtonF);
        this.add(ButtonSS);
        this.add(ButtonS8);
    }
}