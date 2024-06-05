package parte_gráfica;
/**Panel de la clase comprador
 * @author Gustavo González
 * @version versión 7, 5 de junio de 2024*/
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
    /**Billetera del comprador*/
    private Deposito <PanelMoneda> Billetera;
    /**Ventana con el producto que tiene el comprador*/
    JFrame VentanaProducto;
    /**Ventana con las monedas que tiene el comprador*/
    JFrame VentanaBilletera;
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
        this.VentanaBilletera = new JFrame();
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
            COMPRADOR.getSaborProducto();
            VentanaProducto.setSize(500, 400);
            VentanaProducto.setTitle("Producto");
            VentanaProducto.setVisible(true);
        }
        else if (e.getSource() == B) {
            VentanaBilletera.setSize(500, 400);
            VentanaBilletera.setTitle("Billetera");
            VentanaBilletera.setLayout(null);
            VentanaBilletera.add(Billetera.get(0));
            VentanaBilletera.add(Billetera.get(1)).setBounds(100, 0, 100, 100);
            VentanaBilletera.add(Billetera.get(2)).setBounds(200, 0, 100, 100);
            VentanaBilletera.add(Billetera.get(3)).setBounds(0, 100, 100, 100);
            VentanaBilletera.add(Billetera.get(4)).setBounds(100, 100, 100, 100);
            VentanaBilletera.add(Billetera.get(5)).setBounds(200, 100, 100, 100);
            VentanaBilletera.add(Billetera.get(6)).setBounds(0, 200, 100, 100);
            VentanaBilletera.add(Billetera.get(7)).setBounds(100, 200, 100, 100);
            VentanaBilletera.add(Billetera.get(8)).setBounds(200, 200, 100, 100);
            /*remove();
            revalidate();
            repaint();*/
            VentanaBilletera.setVisible(true);
        }
    }
}