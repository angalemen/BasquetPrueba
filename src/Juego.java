import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Instant;
import java.util.Calendar;

public class Juego extends JFrame {

     Calendar ahora1;
    Calendar ahora2;

    long segundos;

    int counter = 0;
    int puntos = 0;

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

        ImageIcon Canasta = new ImageIcon("+2.png");
        JLabel fondo4 = new JLabel(Canasta);
        fondo4.setLayout(null);
        fondo4.setBounds(200, 150, 400, 400);
        fondo4.setVisible(false);
        panel.add(fondo4);


        ImageIcon canasta = new ImageIcon("CanastaPuntosRed.png");
        JLabel fondo2 = new JLabel(canasta);
        fondo2.setLayout(null);
        fondo2.setBounds(525,60,500,500);
        panel.add(fondo2);

        ImageIcon TiroAfricano = new ImageIcon("SinBalon375.png");
        JLabel fondo5 = new JLabel(TiroAfricano);
        fondo5.setLayout(null);
        fondo5.setBounds(100, 250, 300, 300);
        fondo5.setVisible(false);
        panel.add(fondo5);

        JLabel JugadorEspanol = new JLabel(VentanaEleccion.setPlayer());
        JugadorEspanol.setLayout(null);
        JugadorEspanol.setBounds(100,250,300,300);
        panel.add(JugadorEspanol);

        JLabel JugadorAfricano = new JLabel(VentanaEleccion.setPlayer());
        JugadorAfricano.setLayout(null);
        JugadorAfricano.setBounds(100,250,300,300);
        panel.add(JugadorAfricano);



        JProgressBar progressbar = new JProgressBar(0, 100);
        progressbar.setOrientation(SwingConstants.HORIZONTAL);
        progressbar.setBounds(180,225 ,100,50);
        progressbar.setStringPainted(true);
        progressbar.setBackground(Color.RED);
        progressbar.setForeground(Color.BLACK);
        progressbar.setVisible(true);
        panel.add(progressbar);


        JLabel CambioPersonaje = new JLabel(VentanaEleccion.setCambio());
        CambioPersonaje.setLayout(null);
        CambioPersonaje.setBounds(0,0,900,600);
        panel.add(CambioPersonaje);

        JLabel CampoStreet = new JLabel(VentanaEleccion.setMap());
        CampoStreet.setLayout(null);
        CampoStreet.setBounds(0,0,900,600);
        panel.add(CampoStreet);


        JLabel CampoPlayika = new JLabel(VentanaEleccion.setMap());
        CampoPlayika.setLayout(null);
        CampoPlayika.setBounds(0,0,900,600);
        panel.add(CampoPlayika);



        addKeyListener(new KeyListener() {

            long t1, t2,dif;
            int counter= 0;

            Instant startTime;



            @Override
            public void keyTyped(KeyEvent e) {

                progressbar.setVisible(true);
                progressbar.setValue(counter);



            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode()== KeyEvent.VK_SPACE){
                    if (counter >= 100){
                        counter = 0;
                    }

                    counter += 1;
                    System.out.println(counter);
                }else{
                    e.consume();
                }
                   // ahora1 = Calendar.getInstance();
                    //t1 = ahora1.getTimeInMillis();

                }

              //  ahora2 = Calendar.getInstance();
               // t2 = ahora2.getTimeInMillis();

                //dif = t2 - t1  ;
                //segundos = (dif / 1000) % 11;
                //System.out.println(segundos);

            //}


            @Override
            public void keyReleased(KeyEvent e) {

                if (counter == 2){
                    puntos += 2;
                    JugadorAfricano.setVisible(false);
                    fondo5.setVisible(true);
                    fondo4.setVisible(true);
                }




                //counter = 0;
            }
        });



    setVisible(true);
    }
}