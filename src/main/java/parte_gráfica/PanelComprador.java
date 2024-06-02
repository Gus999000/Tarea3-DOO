package parte_gráfica;
/**Panel de la clase comprador
 * @author Gustavo González
 * @version versión 4, 2 de junio de 2024*/
import parte_lógica.Comprador;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PanelComprador extends JPanel implements ActionListener {
    /***/
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
        //ImageIcon comIcon = new ImageIcon(getClass().getResource("slayer.png"));
        //comIcon.paintIcon(this, g, 0, 0);
        //g.drawImage(comIcon.getImage().getScaledInstance(400, 800, Image.SCALE_SMOOTH), 0, 0, 400, 800, this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == P) {
            new VentanaProducto();
        }
        else if (e.getSource() == B) {
            new VentanaBilletera();
        }
    }
}