import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEleccion extends JFrame {

    Font fuente2 = new Font("Arial", Font.BOLD, 35);

    static String text = null;
    static String text2 = null;

    public VentanaEleccion() {


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


        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setVisible(true);
        setContentPane(panel3);

        ImageIcon imagen2 = new ImageIcon("Elige.png");
        JLabel fondo2 = new JLabel(imagen2);
        fondo2.setLayout(null);
        fondo2.setBounds(200, 5, 500, 130);
        panel3.add(fondo2);


        ////
        ImageIcon imagen3 = new ImageIcon("NPerso.png");
        JLabel fondo3 = new JLabel(imagen3);
        fondo3.setBounds(150, 150, 250, 130);
        panel3.add(fondo3);

        JTextField nombreyapellidos = new JTextField();
        nombreyapellidos.setBounds(450, 190, 300, 40);
        panel3.add(nombreyapellidos);

        ImageIcon imagen4 = new ImageIcon("coollogo_com-16271739(7).png");
        JLabel fondo4 = new JLabel(imagen4);
        fondo4.setBounds(150, 250, 250, 130);
        panel3.add(fondo4);

        ImageIcon imagen5 = new ImageIcon("PersonajesTitulo(2).png");
        JLabel fondo5 = new JLabel(imagen5);
        fondo5.setBounds(500, 250, 250, 130);
        panel3.add(fondo5);


        /////BOTON JUGAR

        ImageIcon jugar = new ImageIcon("Jugar(2).gif");

        JButton bot1 = new JButton(jugar);
        bot1.setFocusPainted(false);
        bot1.setBorderPainted(false);
        bot1.setContentAreaFilled(false);
        bot1.setBounds(320, 430, 200, 100);
        bot1.setVisible(true);
        panel3.add(bot1);

        //////////////////////
        ImageIcon imagen6 = new ImageIcon("marcadorvacio(4).png");
        JLabel fondo6 = new JLabel(imagen6);
        fondo6.setBounds(250, 400, 350, 160);
        panel3.add(fondo6);


        /////


        /////////////////
        JRadioButton botn1 = new JRadioButton("Campo PABELLÓN");
        botn1.setLayout(null);
        botn1.setFocusPainted(false);
        botn1.setBorderPainted(false);
        botn1.setContentAreaFilled(false);
        botn1.setForeground(Color.WHITE);
        botn1.setBounds(125, 350, 150, 50);
        botn1.setVisible(true);
        panel3.add(botn1);

        JRadioButton botn2 = new JRadioButton("Campo BEACH");
        botn2.setLayout(null);
        botn2.setFocusPainted(false);
        botn2.setBorderPainted(false);
        botn2.setContentAreaFilled(false);
        botn2.setBounds(260, 350, 150, 50);
        botn2.setVisible(true);
        panel3.add(botn2);

        
        ButtonGroup btnGroup1 = new ButtonGroup();
        btnGroup1.add(botn1);
        btnGroup1.add(botn2);
        ///////////////////

        //////////
        JRadioButton botn3 = new JRadioButton("Selección Española");
        botn3.setLayout(null);
        botn3.setFocusPainted(false);
        botn3.setBorderPainted(false);
        botn3.setContentAreaFilled(false);
        botn3.setBounds(475, 350, 140, 50);
        botn3.setVisible(true);
        panel3.add(botn3);

        JRadioButton botn4 = new JRadioButton("Selección Africana");
        botn4.setLayout(null);
        botn4.setFocusPainted(false);
        botn4.setBorderPainted(false);
        botn4.setContentAreaFilled(false);
        botn4.setBounds(650, 350, 150, 50);
        botn4.setVisible(true);
        panel3.add(botn4);

        ButtonGroup btnGroup2 = new ButtonGroup();
        btnGroup2.add(botn3);
        btnGroup2.add(botn4);
        //////////

        ////Logo esquina

        ImageIcon imagen8 = new ImageIcon("Basketball-PNG-Picture(22).png");
        JLabel fondo8 = new JLabel(imagen8);
        fondo8.setLayout(null);
        fondo8.setBounds(800, 500, 100, 100);
        panel3.add(fondo8);


        ////


        ImageIcon imagen = new ImageIcon("NoCreo.jpg");
        JLabel fondo = new JLabel(imagen);
        fondo.setLayout(null);
        fondo.setBounds(0, 0, getWidth(), getHeight());
        panel3.add(fondo);

        setVisible(true);


        bot1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (botn1.isSelected()) {

                }
                if (botn4.isSelected()){
                    text = "ConBalon375.png";
                }
                if (botn3.isSelected()){
                   text = "JugadorEspanol.png";
                }
                if (botn1.isSelected()){
                    text2 = "Strett(1).png";
                }
                if (botn2.isSelected()){
                    text2 = "Beach(1).png";
                }
                new Juego();
                dispose();


            }
        });
    }

    static ImageIcon setPlayer(){
        return new ImageIcon(text);
    }

    static ImageIcon setMap(){

        return new ImageIcon(text2);
    }
    static ImageIcon setCambio1(){

        return new ImageIcon("SinBalon375.png");
    }
}