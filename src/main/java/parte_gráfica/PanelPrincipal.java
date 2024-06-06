package parte_gráfica;
/**Panel principal de la aplicación
 * @author Gustavo González
 * @version 6, 5 de junio de 2024*/
import javax.swing.*;
import java.awt.*;
public class PanelPrincipal extends JPanel implements PanelCommunicator {
    /**Instancia del panel del comprador*/
    private PanelComprador com;
    /**Instancia del panel del expendedor*/
    private PanelExpendedor exp;
    /**Constructor del panel principal*/
    public PanelPrincipal () {
        super();
        this.setLayout(new BorderLayout());
        this.com = new PanelComprador();
        this.exp = new PanelExpendedor(5, this);
        this.add(com, BorderLayout.EAST);
        this.add(exp, BorderLayout.CENTER);
        this.setBackground(Color.white);
    }
    @Override
    public void ProductoComprado_expTocom(PanelProducto ProductoComprado) {
        com.updateProductoComprado(ProductoComprado);
    }
}