package parte_gráfica;
/**Panel de la clase comprador
 * @author Gustavo González
 * @version versión 3, 2 de junio de 2024*/
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PanelComprador extends JPanel implements ActionListener {
    /**Botón del comprador*/
    JButton B;
    /**Constructor del panel del comprador*/
    public PanelComprador() {
        super();
        this.setPreferredSize(new Dimension(400,765));
        this.setLayout(new BorderLayout());
        ImageIcon ComIcon = new ImageIcon("slayer.png");
        this.B = new JButton(ComIcon);
        B.setBounds(0, 0, this.getWidth(), this.getHeight());
        B.setIcon(new ImageIcon(ComIcon.getImage().getScaledInstance(400, 765, Image.SCALE_SMOOTH)));
        this.add(B, BorderLayout.CENTER);
        B.addActionListener(this);
    }
    @Override
    public void paintComponent (Graphics g) {
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == B) {
            System.out.println("POTO");
        }
    }
}