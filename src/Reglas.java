import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reglas extends JFrame {

    Font fuente2 = new Font("Arial", Font.BOLD, 35);

    Scanner teclat = new Scanner(System.in);

    static String text = null;
    static String text2 = null;

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

                new VentanaEleccion();
                dispose();


            }
        });


        setVisible(true);

    }
}