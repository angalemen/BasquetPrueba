import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Juego extends JFrame {

    Calendar ahora1;
    Calendar ahora2;

    long segundos;

    int counter = 0;
    int puntos = 0;


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
        ////Marcador Puntos

        Font fuente2 = new Font("Arial", Font.BOLD, 50);
        JLabel fondo9 = new JLabel(String.valueOf(puntos));
        fondo9.setBounds(400, -20, 250, 130);
        fondo9.setFont(fuente2);
        panel.add(fondo9);

        ImageIcon canastafondo = new ImageIcon("MarcadorSin(2).png");
        JLabel fondo12 = new JLabel(canastafondo);
        fondo12.setLayout(null);
        fondo12.setBounds(300, -5, 250, 130);
        fondo12.setVisible(true);
        panel.add(fondo12);

        ////
        ImageIcon Canasta = new ImageIcon("+2.png");
        JLabel fondo4 = new JLabel(Canasta);
        fondo4.setLayout(null);
        fondo4.setBounds(250, 150, 400, 400);
        fondo4.setVisible(false);
        panel.add(fondo4);

        ImageIcon Triple = new ImageIcon("TripleCanasta.png");
        JLabel fondo6 = new JLabel(Triple);
        fondo6.setLayout(null);
        fondo6.setBounds(250, 150, 400, 400);
        fondo6.setVisible(false);
        panel.add(fondo6);


        ImageIcon canasta = new ImageIcon("CanastaPuntosRed.png");
        JLabel fondo2 = new JLabel(canasta);
        fondo2.setLayout(null);
        fondo2.setBounds(525, 60, 500, 500);
        panel.add(fondo2);

        ImageIcon TiroAfricano = new ImageIcon("SinBalon375.png");
        JLabel fondo5 = new JLabel(TiroAfricano);
        fondo5.setLayout(null);
        fondo5.setBounds(100, 250, 300, 300);
        fondo5.setVisible(false);
        panel.add(fondo5);

        ImageIcon Loser = new ImageIcon("HasPerdido.png");
        JLabel fondo7 = new JLabel(Loser);
        fondo7.setLayout(null);
        fondo7.setBounds(250, 250, 300, 300);
        fondo7.setVisible(false);
        panel.add(fondo7);

        JLabel JugadorEspanol = new JLabel(VentanaEleccion.setPlayer());
        JugadorEspanol.setLayout(null);
        JugadorEspanol.setBounds(100, 250, 300, 300);
        panel.add(JugadorEspanol);


        JLabel JugadorAfricano = new JLabel(VentanaEleccion.setPlayer());
        JugadorAfricano.setLayout(null);
        JugadorAfricano.setBounds(100, 250, 300, 300);
        panel.add(JugadorAfricano);


        JProgressBar progressbar = new JProgressBar(0, 100);
        progressbar.setOrientation(SwingConstants.HORIZONTAL);
        progressbar.setBounds(180, 225, 100, 50);
        progressbar.setStringPainted(true);
        progressbar.setBackground(Color.RED);
        progressbar.setForeground(Color.BLACK);
        progressbar.setVisible(true);
        panel.add(progressbar);

        ImageIcon BotonSalir = new ImageIcon("salirfoto.png");

        JButton bot5 = new JButton(BotonSalir);
        bot5.setFocusPainted(false);
        bot5.setBorderPainted(false);
        bot5.setContentAreaFilled(false);
        bot5.setBounds(5, 500, 100, 100);
        bot5.setVisible(true);
        panel.add(bot5);

        /*
        JLabel CambioPersonaje = new JLabel(VentanaEleccion.setCambio1());
        CambioPersonaje.setLayout(null);
        CambioPersonaje.setBounds(0,0,900,600);
        panel.add(CambioPersonaje);*/


        JLabel CampoStreet = new JLabel(VentanaEleccion.setMap());
        CampoStreet.setLayout(null);
        CampoStreet.setBounds(0, 0, 900, 600);
        panel.add(CampoStreet);


        JLabel CampoPlayika = new JLabel(VentanaEleccion.setMap());
        CampoPlayika.setLayout(null);
        CampoPlayika.setBounds(0, 0, 900, 600);
        panel.add(CampoPlayika);


        bot1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {



                if (bot5.isSelected()) {
                }

                new VentanaEleccion();
                dispose();


            }
        });

        addKeyListener(new KeyListener() {

            int counter = 0;
            int contador =0;

            @Override
            public void keyTyped(KeyEvent e) {

                fondo6.setVisible(false);
                fondo4.setVisible(false);
                progressbar.setVisible(true);
                progressbar.setValue(counter);

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    contador++;
                    if (counter >= 100) {
                        counter = 0;
                    }

                    counter += 4;
                    System.out.println(counter);
                } else {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

                do {

                    try {
                        FileWriter escritor = new FileWriter("Puntos.txt");

                        escritor.write(Integer.toString(puntos));
                        escritor.write("\n");
                        escritor.close();
                        System.out.println("Entero guardado correctamente en el archivo.");
                    } catch (IOException e) {
                        System.out.println("Error al guardar el entero en el archivo: " + e.getMessage());
                    }
                    fondo9.setText(String.valueOf(puntos));

                    if (counter == 16) {
                        puntos += 2;
                        fondo9.setText(String.valueOf(puntos));
                        //JugadorAfricano.setVisible(false);
                        //fondo5.setVisible(true);
                        fondo4.setVisible(true);
                    } else if (counter == 28) {
                        puntos += 2;
                        fondo9.setText(String.valueOf(puntos));
                        //JugadorAfricano.setVisible(false);
                        //fondo5.setVisible(true);
                        fondo4.setVisible(true);
                    } else if (counter == 44) {
                        puntos += 2;
                        fondo9.setText(String.valueOf(puntos));
                        //JugadorAfricano.setVisible(false);
                        //fondo5.setVisible(true);
                        fondo4.setVisible(true);
                    } else if (counter == 60) {
                        puntos += 2;
                        fondo9.setText(String.valueOf(puntos));
                        //JugadorAfricano.setVisible(false);
                        //fondo5.setVisible(true);
                        fondo4.setVisible(true);
                    } else if (counter == 80) {
                        puntos += 3;
                        fondo9.setText(String.valueOf(puntos));
                        //JugadorAfricano.setVisible(false);
                        //fondo5.setVisible(true);
                        fondo6.setVisible(true);
                    } else if (counter == 96) {
                        puntos += 3;
                        fondo9.setText(String.valueOf(puntos));
                        //JugadorAfricano.setVisible(false);
                        //fondo5.setVisible(true);
                        fondo6.setVisible(true);
                    }if (contador >= 20){
                        fondo7.setVisible(true);
                    }

                } while (puntos >= 20);


                counter = 0;


            }


        });
        setVisible(true);


    }
}

