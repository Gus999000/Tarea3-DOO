package parte_gráfica;
/**Panel de la clase comprador
 * @author Gustavo González
 * @version versión 6, 3 de junio de 2024*/
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelComprador extends JPanel implements ActionListener {
    /**Instancia de comprador de la parte lógica*/
    private Comprador COMPRADOR;
    /**Boton del comprador que abre una ventana con el producto que este tiene*/
    JButton P;
    /**Boton del comprador que abre la billetera*/
    JButton B;
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
            //COMPRADOR.getSaborProducto();
            JFrame VentanaProducto = new JFrame();
            VentanaProducto.setSize(500, 400);
            VentanaProducto.setTitle("Producto");
            VentanaProducto.setVisible(true);
        }
        else if (e.getSource() == B) {
            JFrame VentanaBilletera = new JFrame();
            VentanaBilletera.setSize(500, 400);
            VentanaBilletera.setTitle("Billetera");
            VentanaBilletera.setVisible(true);
        }
    }
}