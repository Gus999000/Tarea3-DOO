package parte_gráfica;
/**Panel de los productos
 * @author Gustavo Benítez
 * @version 1, 5 de junio de 2024*/
import parte_lógica.*;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class PanelProducto extends JPanel {
    /**Producto recibido por el panel*/
    private Producto P;
    /**Constructor del panel de productos*/
    public PanelProducto(Producto P) {
        this.P = P;
        this.setSize(100, 100);
        JLabel NSerie = new JLabel("5");
        this.add(NSerie);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Objects.equals(P.getNombre(), "CocaCola")) {
            ImageIcon PIcon = new ImageIcon(getClass().getClassLoader().getResource("Pcocacola.png"));
            g.drawImage(PIcon.getImage(), 0, 0, null);
        }
        else if(Objects.equals(P.getNombre(), "Sprite")) {
            ImageIcon PIcon = new ImageIcon(getClass().getClassLoader().getResource("Psprite.png"));
            g.drawImage(PIcon.getImage(), 0, 0, null);
        }
        else if(Objects.equals(P.getNombre(), "Fanta")) {
            ImageIcon PIcon = new ImageIcon(getClass().getClassLoader().getResource("Pfanta.png"));
            g.drawImage(PIcon.getImage(), 0, 0, null);
        }
        else if(Objects.equals(P.getNombre(), "Snickers")) {
            ImageIcon PIcon = new ImageIcon(getClass().getClassLoader().getResource("Psnickers.png"));
            g.drawImage(PIcon.getImage(), 0, 0, null);
        }
        else if(Objects.equals(P.getNombre(), "Super8")) {
            ImageIcon PIcon = new ImageIcon(getClass().getClassLoader().getResource("Psuper8.png"));
            g.drawImage(PIcon.getImage(), 0, 0, null);
        }
    }
}