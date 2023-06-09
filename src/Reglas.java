import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reglas extends JFrame {


    String reglas =
            "<html>\n" +
            "<head>\n" +
            "  <meta charset=\"UTF-8\">\n" +
            "  <title>Reglas del juego</title>\n" +
            "  <style>\n" +
            "    body {\n" +
            "      color: white;\n" +
            "      background-color: black;\n" +
            "      font-family: Arial, sans-serif;\n" +
            "    }\n" +
            "    \n" +
            "    h1 {\n" +
            "      text-align: center;\n" +
            "      text-decoration: underline;\n" +
            "    }\n" +
            "    \n" +
            "    h2 {\n" +
            "      color: orange;\n" +
            "    }\n" +
            "    \n" +
            "    ul {\n" +
            "      list-style-type: none;\n" +
            "      padding: 0;\n" +
            "    }\n" +
            "    \n" +
            "    li {\n" +
            "      margin-bottom: 5px;\n" +
            "    }\n" +
            "    \n" +
            "    p {\n" +
            "      margin-bottom: 10px;\n" +
            "    }\n" +
            "  </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "  <h1>Reglas del juego</h1>\n" +
            "  \n" +
            "  <h2>Porcentajes de canastas:</h2>\n" +
            "  <ul>\n" +
            "    <li>16% = 2 puntos</li>\n" +
            "    <li>28% = 2 puntos</li>\n" +
            "    <li>44% = 2 puntos</li>\n" +
            "    <li>60% = 2 puntos</li>\n" +
            "    <li>80% = 3 puntos</li>\n" +
            "    <li>96% = 3 puntos</li>\n" +
            "  </ul>\n" +
            "  \n" +
            "  <h2>Para poder ganar:</h2>\n" +
            "  <p>Tienes que conseguir un total de 20 puntos.</p>\n" +
            "  \n" +
            "  <h2>Límite de intentos:</h2>\n" +
            "  <p>Tienes un límite de 30 intentos de canastas para conseguir la victoria.</p>\n" +
            "</body>\n" +
            "</html>\n";


    public Reglas() {


        setSize(900, 600);
        setTitle("Tiros Libres Pro 3");
        setLocationRelativeTo(null);


        ////////Logo
        setIconImage(new ImageIcon("Basketball-PNG-Picture.png").getImage());
        ////////



        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setVisible(true);
        setContentPane(panel3);

        ImageIcon imagen3 = new ImageIcon("reglastexto.png");
        JLabel fondo3 = new JLabel(imagen3);
        fondo3.setBounds(5, 5, 250, 130);
        panel3.add(fondo3);

        JLabel fondo4 = new JLabel(reglas);
        fondo4.setBounds(20, 100, 400, 400);
        panel3.add(fondo4);

        ImageIcon BotonSalir = new ImageIcon("salirfoto.png");

        JButton bot1 = new JButton(BotonSalir);
        bot1.setFocusPainted(false);
        bot1.setBorderPainted(false);
        bot1.setContentAreaFilled(false);
        bot1.setBounds(5, 500, 100, 100);
        bot1.setVisible(true);
        panel3.add(bot1);

        ImageIcon fondicoreglas = new ImageIcon("fondoreglas.jpeg");
        JLabel fondo = new JLabel(fondicoreglas);
        fondo.setBounds(0, 0, 900, 600);
        panel3.add(fondo);



        bot1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {



                if (bot1.isSelected()) {
                }

                new JuegoBasquet();
                dispose();


            }
        });


        setVisible(true);

    }
}