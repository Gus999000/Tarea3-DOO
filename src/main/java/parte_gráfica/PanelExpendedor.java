package parte_gráfica;
/**Panel de la clase expendedor
 * @author Gustavo González
 * @version versión 4, 2 de junio de 2024*/
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelExpendedor extends JPanel implements ActionListener {
    /**Instancia de expendedor*/
    private Expendedor EXPENDEDOR;
    /**Boton del comprador que abre una ventana con el producto que este tiene*/
    JButton C;
    /**Boton del comprador que abre una ventana con el producto que este tiene*/
    JButton S;
    /**Boton del comprador que abre una ventana con el producto que este tiene*/
    JButton F;
    /**Boton del comprador que abre una ventana con el producto que este tiene*/
    JButton SS;
    /**Boton del comprador que abre una ventana con el producto que este tiene*/
    JButton S8;
    /**Constructor del panel del expendedor*/
    public PanelExpendedor() {
        super();
        this.EXPENDEDOR = new Expendedor(5);
        this.setLayout(null);
        this.C = new JButton("CocaCola");
        this.S = new JButton("Sprite");
        this.F = new JButton("Fanta");
        this.SS = new JButton("Snickers");
        this.S8 = new JButton("Super8");
        this.add(C);
        this.add(S);
        this.add(F);
        this.add(SS);
        this.add(S8);
        C.setBounds(25, 75, 500, 100);
        S.setBounds(575, 75, 500, 100);
        F.setBounds(25, 200, 500, 100);
        SS.setBounds(575, 200, 500, 100);
        S8.setBounds(300, 325, 500, 100);
        C.addActionListener(this);
        S.addActionListener(this);
        F.addActionListener(this);
        SS.addActionListener(this);
        S8.addActionListener(this);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.blue);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == C) {
            try {
                EXPENDEDOR.comprarProducto(new Moneda100(), Productos.COCACOLA.getN());
            }
            catch (PagoIncorrectoException ex) {
                throw new RuntimeException(ex);
            }
            catch (NoHayProductoException ex) {
                throw new RuntimeException(ex);
            } catch (PagoInsuficienteException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if (e.getSource() == S) {
        }
        else if (e.getSource() == F) {
        }
        else if (e.getSource() == SS) {
        }
        else if (e.getSource() == S8) {
        }
    }
}