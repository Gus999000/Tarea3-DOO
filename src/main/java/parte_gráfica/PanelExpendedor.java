package parte_gráfica;
/**Panel de la clase expendedor
 * @author Gustavo González
 * @version versión 6, 5 de junio de 2024*/
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelExpendedor extends JPanel implements ActionListener {
    /**Instancia de expendedor*/
    private Expendedor EXPENDEDOR;
    /**Boton del expendedor (CocaCola)*/
    JButton C;
    /**Boton del expendedor (Sprite)*/
    JButton S;
    /**Boton del expendedor (Fanta)*/
    JButton F;
    /**Boton del expendedor (Snickers)*/
    JButton SS;
    /**Boton del expendedor (Super8)*/
    JButton S8;
    /**Boton del expendedor (Monedas)*/
    JButton M;
    /**Boton del expendedor (Producto)*/
    JButton P;
    /**Se crean los depósitos de los paneles de los productos*/
    private Deposito <PanelProducto> PCOCACOLA;
    private Deposito <PanelProducto> PSPRITE;
    private Deposito <PanelProducto> PFANTA;
    private Deposito <PanelProducto> PSNICKERS;
    private Deposito <PanelProducto> PSUPER8;
    /**Constructor del panel del expendedor*/
    public PanelExpendedor(int numProductos) {
        super();
        this.EXPENDEDOR = new Expendedor(numProductos);
        this.setLayout(null);
        this.C = new JButton("CocaCola");
        this.S = new JButton("Sprite");
        this.F = new JButton("Fanta");
        this.SS = new JButton("Snickers");
        this.S8 = new JButton("Super8");
        this.M = new JButton("Monedas compra");
        this.P = new JButton("Producto");
        this.add(C);
        this.add(S);
        this.add(F);
        this.add(SS);
        this.add(S8);
        this.add(M);
        this.add(P);
        C.setBounds(25, 25, 500, 100);
        S.setBounds(575, 25, 500, 100);
        F.setBounds(25, 150, 500, 100);
        SS.setBounds(575, 150, 500, 100);
        S8.setBounds(300, 275, 500, 100);
        M.setBounds(25, 275, 100, 100);
        P.setBounds(25, 650, 100, 100);
        C.addActionListener(this);
        S.addActionListener(this);
        F.addActionListener(this);
        SS.addActionListener(this);
        S8.addActionListener(this);
        M.addActionListener(this);
        P.addActionListener(this);
        this.PCOCACOLA = new Deposito <PanelProducto>();
        this.PSPRITE = new Deposito <PanelProducto>();
        this.PFANTA = new Deposito <PanelProducto>();
        this.PSNICKERS = new Deposito <PanelProducto>();
        this.PSUPER8 = new Deposito <PanelProducto>();
        for(int i = 0; i < numProductos; i = i + 1) {
            PCOCACOLA.add(new PanelProducto(new CocaCola()));
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            PSPRITE.add(new PanelProducto(new Sprite()));
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            PFANTA.add(new PanelProducto(new Fanta()));
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            PSNICKERS.add(new PanelProducto(new Snickers()));
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            PSUPER8.add(new PanelProducto(new Super8()));
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            this.add(PCOCACOLA.get(i)).setBounds(25 + i * 100, 400, 100, 100);
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            this.add(PSPRITE.get(i)).setBounds(575 + i * 100, 400, 100, 100);
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            this.add(PFANTA.get(i)).setBounds(25 + i * 100, 525, 100, 100);
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            this.add(PSNICKERS.get(i)).setBounds(575 + i * 100, 525, 100, 100);
        }
        for(int i = 0; i < numProductos; i = i + 1) {
            this.add(PSUPER8.get(i)).setBounds(300 + i * 100, 650, 100, 100);
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Icon cocacolaIcon = new ImageIcon(getClass().getClassLoader().getResource("cocacola.png"));
        Icon spriteIcon = new ImageIcon(getClass().getClassLoader().getResource("sprite.png"));
        Icon fantaIcon = new ImageIcon(getClass().getClassLoader().getResource("fanta.png"));
        Icon snickersIcon = new ImageIcon(getClass().getClassLoader().getResource("snickers.png"));
        Icon super8Icon = new ImageIcon(getClass().getClassLoader().getResource("super8.png"));
        C.setIcon(cocacolaIcon);
        S.setIcon(spriteIcon);
        F.setIcon(fantaIcon);
        SS.setIcon(snickersIcon);
        S8.setIcon(super8Icon);
        this.setBackground(Color.blue);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == C) {
            try {
                EXPENDEDOR.comprarProducto(new Moneda1000(), Productos.COCACOLA.getN());
            }
            catch (PagoIncorrectoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoIncorrectoException");
                VentanaProducto.setVisible(true);
            }
            catch (NoHayProductoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("NoHayProductoException");
                VentanaProducto.setVisible(true);
            } catch (PagoInsuficienteException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoInsuficienteException");
                VentanaProducto.setVisible(true);
            }
        }
        else if (e.getSource() == S) {
            try {
                EXPENDEDOR.comprarProducto(new Moneda1000(), Productos.SPRITE.getN());
            }
            catch (PagoIncorrectoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoIncorrectoException");
                VentanaProducto.setVisible(true);
            }
            catch (NoHayProductoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("NoHayProductoException");
                VentanaProducto.setVisible(true);
            } catch (PagoInsuficienteException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoInsuficienteException");
                VentanaProducto.setVisible(true);
            }
        }
        else if (e.getSource() == F) {
            try {
                EXPENDEDOR.comprarProducto(new Moneda1000(), Productos.FANTA.getN());
            }
            catch (PagoIncorrectoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoIncorrectoException");
                VentanaProducto.setVisible(true);
            }
            catch (NoHayProductoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("NoHayProductoException");
                VentanaProducto.setVisible(true);
            } catch (PagoInsuficienteException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoInsuficienteException");
                VentanaProducto.setVisible(true);
            }
        }
        else if (e.getSource() == SS) {
            try {
                EXPENDEDOR.comprarProducto(new Moneda1000(), Productos.SNICKERS.getN());
            }
            catch (PagoIncorrectoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoIncorrectoException");
                VentanaProducto.setVisible(true);
            }
            catch (NoHayProductoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("NoHayProductoException");
                VentanaProducto.setVisible(true);
            } catch (PagoInsuficienteException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoInsuficienteException");
                VentanaProducto.setVisible(true);
            }
        }
        else if (e.getSource() == S8) {
            try {
                EXPENDEDOR.comprarProducto(new Moneda1000(), Productos.SUPER8.getN());
            }
            catch (PagoIncorrectoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoIncorrectoException");
                VentanaProducto.setVisible(true);
            }
            catch (NoHayProductoException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("NoHayProductoException");
                VentanaProducto.setVisible(true);
            } catch (PagoInsuficienteException ex) {
                JFrame VentanaProducto = new JFrame();
                VentanaProducto.setSize(500, 200);
                VentanaProducto.setTitle("PagoInsuficienteException");
                VentanaProducto.setVisible(true);
            }
        }
        else if (e.getSource() == M) {
            JFrame MonedasCompra = new JFrame("Monedas compra");
            MonedasCompra.setSize(500, 200);
            MonedasCompra.setVisible(true);
        }
    }
}