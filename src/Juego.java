import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Juego extends JFrame {

    Font fuente2 = new Font("Arial", Font.BOLD, 35);

    public Juego() {


        setSize(900, 600);
        setTitle("Tiros Libres Pro 3");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ////////Logo
        setIconImage(new ImageIcon("Basketball-PNG-Picture.png").getImage());
        ////////

        /////Fuente
        Font fuente1 = new Font("Agency FB", Font.BOLD, 70);
        /////


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);
        setContentPane(panel);


        ImageIcon imagen = new ImageIcon("Personajee(1).gif");
        JLabel fondo = new JLabel(imagen);
        fondo.setLayout(null);
        fondo.setBounds(150,250,300,300);
        panel.add(fondo);

        ImageIcon imagen2 = new ImageIcon("CanastaPrueba.png");
        JLabel fondo2 = new JLabel(imagen2);
        fondo2.setLayout(null);
        fondo2.setBounds(400,250,300,300);
        panel.add(fondo2);

        setVisible(true);
    }
}