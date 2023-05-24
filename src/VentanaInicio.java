import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VentanaInicio extends JFrame {

    Font fuente2 = new Font("Arial", Font.BOLD, 35);

    public VentanaInicio() {


        setSize(1200, 480);
        setTitle("Tiros Libres Pro 3");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setVisible(true);
        setContentPane(panel2);

        ImageIcon presiona = new ImageIcon("output-onlinegiftools(2).gif");
        JLabel txt3= new JLabel(presiona);
        txt3.setForeground(Color.ORANGE);
        txt3.setFont(fuente2);
        txt3.setLayout(null);
        txt3.setBounds(20,150, 500, 150);
        panel2.add(txt3);

        ImageIcon imagen = new ImageIcon("Fondo1.jpg");
        JLabel fondo = new JLabel(imagen);
        fondo.setLayout(null);
        fondo.setBounds(0,0,1200,480);
        panel2.add(fondo);




        setVisible(true);


        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                new JuegoBasquet();
                dispose();
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
    }
}
