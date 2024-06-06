package parte_gráfica;
/**Panel de la clase comprador
 * @author Gustavo González
 * @version versión 8, 5 de junio de 2024*/
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelComprador extends JPanel implements ActionListener {
    /**Instancia de comprador de la parte lógica*/
    private Comprador COMPRADOR;
    /**Boton del comprador que abre una ventana con el producto que este tiene*/
    private JButton P;
    /**Boton del comprador que abre la billetera*/
    private JButton B;
    /**Billetera del comprador*/
    private Deposito <PanelMoneda> Billetera;
    /**Ventana con el producto que tiene el comprador*/
    private JFrame VentanaProducto;
    /**Ventana con las monedas que tiene el comprador*/
    private JFrame VentanaBilletera;
    /**Producto comprado*/
    private PanelProducto ProductoComprado = null;
    /**Constructor del panel del comprador*/
    public PanelComprador() {
        super();
        this.setPreferredSize(new Dimension(400,800));
        this.setLayout(null);
        this.P = new JButton("Producto");
        this.B = new JButton("Billetera");
        this.add(P);
        this.add(B);
        P.setBounds(100, 500, 100, 100);
        B.setBounds(200, 500, 100, 100);
        P.addActionListener(this);
        B.addActionListener(this);
        this.Billetera = new Deposito <PanelMoneda>();
        for(int i = 0; i < 3; i = i + 1) {
            Billetera.add(new PanelMoneda(new Moneda100()));
        }
        for(int i = 0; i < 3; i = i + 1) {
            Billetera.add(new PanelMoneda(new Moneda500()));
        }
        for(int i = 0; i < 3; i = i + 1) {
            Billetera.add(new PanelMoneda(new Moneda1000()));
        }
        this.VentanaProducto = new JFrame();
        VentanaProducto.setSize(100, 125);
        VentanaProducto.setTitle("Producto");
        this.VentanaBilletera = new JFrame();
        VentanaBilletera.setSize(900, 150);
        VentanaBilletera.setTitle("Billetera");
        VentanaBilletera.setLayout(null);
        for(int i = 0; i < 9; i = i + 1) {
            VentanaBilletera.add(Billetera.get(i)).setBounds(i * 100, 0, 100, 100);
        }
    }
    /**Método para actualizar el producto comprado*/
    public void updateProductoComprado(PanelProducto ProductoComprado) {
        this.ProductoComprado = ProductoComprado;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon compradorIcon = new ImageIcon(getClass().getClassLoader().getResource("slayer.png"));
        g.drawImage(compradorIcon.getImage(), 0, 0, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == P) {
            VentanaProducto.add(ProductoComprado);
            VentanaProducto.setVisible(true);
        }
        else if (e.getSource() == B) {
            VentanaBilletera.setVisible(true);
        }
    }
}