package parte_gráfica;
/**Panel de la clase moneda
 * @author Gustavo González
 * @version versión 1, 5 de junio de 2024*/
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
public class PanelMoneda extends JPanel {
    /**Moneda recibida por el panel*/
    private Moneda M;
    /**Constructor del panel de monedas*/
    public PanelMoneda(Moneda M) {
        this.M = M;
        this.setSize(100, 100);
        JLabel NSerie = new JLabel("3");
        this.add(NSerie);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(M.getValor() == 100) {
            g.setColor(Color.yellow);
            g.fillOval(0, 0, 100, 100);
        }
        else if(M.getValor() == 500) {
            g.setColor(Color.gray);
            g.fillOval(0, 0, 100, 100);
        }
        else if(M.getValor() == 1000) {
            g.setColor(Color.red);
            g.fillOval(0, 0, 100, 100);
        }
    }
}