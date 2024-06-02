package parte_gráfica;
/**Ventana que contien las monedas del comprador
 * @author Gustavo González
 * @version 1, 2 de junio de 2024*/
import javax.swing.*;
import java.awt.*;
public class VentanaBilletera extends JFrame {
    /***/
    public VentanaBilletera() {
        super();
        this.setSize(500, 400);
        this.setTitle("Billetera");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paintComponents(Graphics g) {
    }
}