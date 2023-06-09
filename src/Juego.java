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


    int puntos = 0;


    public Juego() {

        setSize(900, 600);
        setTitle("Tiros Libres Pro 3");                             //dimensiones y titulo de la ventana
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ////////Logo
        setIconImage(new ImageIcon("Basketball-PNG-Picture.png").getImage());
        ////////

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);
        setContentPane(panel);
        ////////////////////////////////777Marcador Puntos

        Font fuente2 = new Font("Arial", Font.BOLD, 50);
        JLabel fondo9 = new JLabel(String.valueOf(puntos));
        fondo9.setBounds(400, -20, 250, 130);
        fondo9.setFont(fuente2);
        panel.add(fondo9);
                                                                                    //Añade una imagen de un marcador y el int de puntos lo pasa a string para meterlo en un label y poder mostrarlo.
        ImageIcon canastafondo = new ImageIcon("MarcadorSin(2).png");
        JLabel fondo12 = new JLabel(canastafondo);
        fondo12.setLayout(null);
        fondo12.setBounds(300, -5, 250, 130);
        fondo12.setVisible(true);
        panel.add(fondo12);

        ///////////////////////////////////////////////


        ///////Imagenes Puntos Canasta
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

        //////// Imagen Canasta
        ImageIcon canasta = new ImageIcon("CanastaPuntosRed.png");
        JLabel fondo2 = new JLabel(canasta);
        fondo2.setLayout(null);
        fondo2.setBounds(525, 60, 500, 500);
        panel.add(fondo2);
        ///////////////////////////////////////////////////////7






        ////Imagen final de has ganado si llegas a 20 puntos
        ImageIcon HasGanado = new ImageIcon("has ganado2.png");
        JLabel fondo8 = new JLabel(HasGanado);
        fondo8.setLayout(null);
        fondo8.setBounds(70, -50, 800, 800);
        fondo8.setVisible(false);
        panel.add(fondo8);
        ///////////////////////////////////

        //////Imagen de has perdido si llegas a el limite de tiros permitidos.
        ImageIcon Loser = new ImageIcon("HasPerdido.png");
        JLabel fondo7 = new JLabel(Loser);
        fondo7.setLayout(null);
        fondo7.setBounds(70  , 5, 800, 800);
        fondo7.setVisible(false);
        panel.add(fondo7);
        ////////////////////////////////////////

        ////////Confeti final que sale si ganas (es un gif igualado a un label para poder mostrarlo igual que he hecho anjteriormente con las imagenes)
        ImageIcon Confeti = new ImageIcon("confeti.gif");
        JLabel fondo10 = new JLabel(Confeti);
        fondo10.setLayout(null);
        fondo10.setBounds(0  , 0, 900, 600);
        fondo10.setVisible(false);
        panel.add(fondo10);
        ////////////////////(((

        ///////////Imagen de los dos personajes que te da a elegir en el modo seleccion
        JLabel JugadorEspanol = new JLabel(VentanaEleccion.setPlayer());
        JugadorEspanol.setLayout(null);
        JugadorEspanol.setBounds(100, 250, 300, 300);
        panel.add(JugadorEspanol);


        JLabel JugadorAfricano = new JLabel(VentanaEleccion.setPlayer());
        JugadorAfricano.setLayout(null);
        JugadorAfricano.setBounds(100, 250, 300, 300);
        panel.add(JugadorAfricano);
        ///////////////////////////////////////////////

        /////////////////////ProgressBar que calcula "la fuerza con la que hace el tiro"
        JProgressBar progressbar = new JProgressBar(0, 100);
        progressbar.setOrientation(SwingConstants.HORIZONTAL);
        progressbar.setBounds(180, 225, 100, 50);
        progressbar.setStringPainted(true);
        progressbar.setBackground(Color.RED);
        progressbar.setForeground(Color.BLACK);
        progressbar.setVisible(true);
        panel.add(progressbar);
        ////////////////////////////////////////////////

        ////////////////El boton salir que esta igualado a un ImagenIcon para tener una imagen de boton, también le pongo parametros para poder tener la imagen sin el fondo ni el borde de el boton.
        ImageIcon BotonSalir = new ImageIcon("salirfoto.png");
        JButton bot5 = new JButton(BotonSalir);
        bot5.setFocusable(false);
        bot5.setFocusPainted(false);
        bot5.setBorderPainted(false);
        bot5.setContentAreaFilled(false);
        bot5.setBounds(5, 500, 100, 100);
        bot5.setVisible(true);
        panel.add(bot5);
        ///////////////////////////7


        ///////Imagen de campos a elegir
        JLabel CampoStreet = new JLabel(VentanaEleccion.setMap());
        CampoStreet.setLayout(null);
        CampoStreet.setBounds(0, 0, 900, 600);
        panel.add(CampoStreet);


        JLabel CampoPlayika = new JLabel(VentanaEleccion.setMap());
        CampoPlayika.setLayout(null);
        CampoPlayika.setBounds(0, 0, 900, 600);
        panel.add(CampoPlayika);
        ////////////////////////////////////////777

        bot5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

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

                    if (counter >= 100) {
                        counter = 0;
                    }

                    counter += 4;


                } else {
                    e.consume();
                }

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                contador++;


                do {

                    try {
                        FileWriter escritor = new FileWriter("Puntos.txt");

                        escritor.write(Integer.toString(puntos));
                        escritor.write("\n");
                        escritor.close();

                        fondo9.setText(String.valueOf(puntos));
                    } catch (IOException e) {

                    }


                    if (contador == 30 ) {
                        fondo7.setVisible(true);
                    }if (puntos >= 20){
                        puntos = -1;
                        fondo4.setVisible(false);
                        fondo6.setVisible(false);
                        fondo8.setVisible(true);
                        fondo10.setVisible(true);
                    }
                    if (contador > 20){
                        dispose();
                        new JuegoBasquet();
                    }
                    if (counter == 16) {
                        puntos += 2;
                        fondo9.setText(String.valueOf(puntos));  //S
                        fondo4.setVisible(true);
                    } else if (counter == 28) {
                        puntos += 2;
                        fondo9.setText(String.valueOf(puntos));

                        fondo4.setVisible(true);
                    } else if (counter == 44) {
                        puntos += 2;
                        fondo9.setText(String.valueOf(puntos));
                        fondo4.setVisible(true);
                    } else if (counter == 60) {
                        puntos += 2;
                        fondo9.setText(String.valueOf(puntos));
                        fondo4.setVisible(true);
                    } else if (counter == 80) {
                        puntos += 3;
                        fondo9.setText(String.valueOf(puntos));
                        fondo6.setVisible(true);
                    } else if (counter == 96) {
                        puntos += 3;
                        fondo9.setText(String.valueOf(puntos));
                        fondo6.setVisible(true);
                    }


                } while (puntos >= 20);




                counter = 0;


            }


        });
        setVisible(true);


    }
}

