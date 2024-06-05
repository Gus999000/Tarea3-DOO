package parte_gráfica;
/**Panel de los productos
 * @author Gustavo González
 * @version 1, 5 de junio de 2024*/
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
public class PanelProducto extends JPanel {
    /**Producto recibido por el panel*/
    private Producto P;
    /**Constructor del panel de productos*/
    public PanelProducto(Producto P) {
        this.P = P;
    }
    @Override
    public void paintComponent(Graphics g) {
    }
}