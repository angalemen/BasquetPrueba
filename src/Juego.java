import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Instant;
import java.util.Calendar;

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

        ImageIcon imagen2 = new ImageIcon("CanastaPuntosRed.png");
        JLabel fondo2 = new JLabel(imagen2);
        fondo2.setLayout(null);
        fondo2.setBounds(550,160,500,500);
        panel.add(fondo2);

        JLabel JugadorEspanol = new JLabel(VentanaEleccion.setPlayer());
        JugadorEspanol.setLayout(null);
        JugadorEspanol.setBounds(100,310,300,300);
        panel.add(JugadorEspanol);

        JLabel JugadorAfricano = new JLabel(VentanaEleccion.setPlayer());
        JugadorAfricano.setLayout(null);
        JugadorAfricano.setBounds(100,310,300,300);
        panel.add(JugadorAfricano);



        JLabel CampoPabellon = new JLabel(VentanaEleccion.setMap());
        CampoPabellon.setLayout(null);
        CampoPabellon.setBounds(0,0,900,600);
        panel.add(CampoPabellon);


        JLabel CampoPlayika = new JLabel(VentanaEleccion.setMap());
        CampoPlayika.setLayout(null);
        CampoPlayika.setBounds(0,0,900,600);
        panel.add(CampoPlayika);


        addKeyListener(new KeyListener() {

            long t1, t2,dif;

            Instant startTime;



            @Override
            public void keyTyped(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    Calendar ahora1 = Calendar.getInstance();
                    t1 = ahora1.getTimeInMillis();
                }



            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

                Calendar ahora2 = Calendar.getInstance();
                t2 = ahora2.getTimeInMillis();

                dif = t2 - t1  ;
                long segundos = (dif / 1000) % 11;
                System.out.println(segundos);


            }

            @Override
            public void keyReleased(KeyEvent e) {




                    //System.out.println(Diferencia);


            }
        });



    setVisible(true);
    }
}