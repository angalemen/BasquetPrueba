import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class JuegoBasquet extends JFrame {

    Scanner teclado = new Scanner(System.in);
    int num1;
    private Image image;
    public JuegoBasquet() {


        setSize(900, 600);
        setTitle("Tiros Libres Pro 3");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        ////////Logo
        setIconImage(new ImageIcon("Basketball-PNG-Picture.png").getImage());
        ////////


        JPanel panel = new JPanel();
        panel.setLayout(null);
        setContentPane(panel);
        ////////
        ///Boton JUGAR

        ImageIcon jugar = new ImageIcon("ee.png");

        JButton bot1 = new JButton(jugar);
        bot1.setFocusPainted(false);
        bot1.setBorderPainted(false);
        bot1.setContentAreaFilled(false);
        bot1.setBounds(280,200,350,200);
        bot1.setVisible(true);
        panel.add(bot1);

        ///Titulo

        ImageIcon imagen2 = new ImageIcon("estaSi.png" );
        JLabel fondo2 = new JLabel(imagen2);
        fondo2.setLayout(null);
        fondo2.setBounds(200,5,500,101);
        panel.add(fondo2);




    ////////////////////////
    //Fuentes

    Font fuente1 = new Font("Agency FB", Font.BOLD, 70);
    Font fuente2 = new Font("Arial", Font.BOLD, 35);

    //////////////////




        ImageIcon imagen = new ImageIcon("fondico.jpg");
        JLabel fondo = new JLabel(imagen);
        fondo.setLayout(null);
        fondo.setBounds(0,0,900,600);
        panel.add(fondo);

    setVisible(true);

        bot1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {



                if (bot1.isSelected()) {
                }

                new VentanaEleccion();
                dispose();


            }
        });
    }




    public static void main(String[] args) {

        new VentanaInicio();
    }

}
