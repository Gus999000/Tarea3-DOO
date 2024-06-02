package parte_gráfica;
/**Panel de la clase expendedor
 * @author Gustavo González
 * @version versión 3, 2 de junio de 2024*/
import parte_lógica.Expendedor;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelExpendedor extends JPanel implements ActionListener {
    /**Instancia de expendedor*/
    private Expendedor EXP;
    /**Constructor del panel del expendedor*/
    public PanelExpendedor() {
        super();
        this.EXP = new Expendedor(5);
        this.setBackground(Color.blue);
        this.setLayout(null);
        ImageIcon CIcon = new ImageIcon("coca_cola.png");
        JButton C = new JButton(new ImageIcon(CIcon.getImage().getScaledInstance(500, 100, Image.SCALE_SMOOTH)));
        C.setBounds(25, 75, 500, 100);
        this.add(C);
        C.addActionListener(this);
        JButton S = new JButton("Sprite");
        S.setBounds(575, 75, 500, 100);
        this.add(S);
        JButton F = new JButton("Fanta");
        F.setBounds(25, 200, 500, 100);
        this.add(F);
        JButton SS = new JButton("Snickers");
        SS.setBounds(575, 200, 500, 100);
        this.add(SS);
        JButton S8 = new JButton("Super8");
        S8.setBounds(300, 325, 500, 100);
        this.add(S8);
    }
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}