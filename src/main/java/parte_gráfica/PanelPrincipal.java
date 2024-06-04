package parte_gráfica;
/**Panel principal de la aplicación
 * @author Gustavo González
 * @version 5, 3 de junio de 2024*/
import javax.swing.*;
import java.awt.*;
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
        this.exp = new PanelExpendedor(5);
        this.add(com, BorderLayout.EAST);
        this.add(exp, BorderLayout.CENTER);
        this.setBackground(Color.white);
    }
}