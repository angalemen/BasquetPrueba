import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VentanaEleccion extends JFrame {

    Font fuente2 = new Font("Arial", Font.BOLD, 35);

    public VentanaEleccion() {


        setSize(900, 600);
        setTitle("Tiros Libres Pro 3");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ////////Logo
        setIconImage(new ImageIcon("Basketball-PNG-Picture.png").getImage());
        ////////


        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setVisible(true);
        setContentPane(panel3);

        ImageIcon imagen2 = new ImageIcon("Elige.png" );
        JLabel fondo2 = new JLabel(imagen2);
        fondo2.setLayout(null);
        fondo2.setBounds(200,5,500,130);
        panel3.add(fondo2);











        setVisible(true);
    }
}