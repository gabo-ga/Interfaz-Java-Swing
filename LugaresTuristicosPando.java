import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LugaresTuristicosPando extends JFrame{
    JPanel panel = new JPanel();
    public LugaresTuristicosPando() {
        setTitle("Lugares Turisticos");
        setBounds(500, 200, 1080, 800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiqueta();
        colocarListaDesplegable();
        colocarAreaDeTexto();
        colocarBotones();
    }
    private void colocarPaneles() {
        panel.setBackground(new Color(32, 112, 193));
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("AGENCIA DE VIAJES", SwingConstants.LEFT);//crea la etiqueta
        panel.add(etiqueta);
        etiqueta.setBounds(10, 0, 500, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));

    }
    private void colocarListaDesplegable() {
        String[] opciones = {"La Paz", "Cochabamba", "Santa Cruz", "Oruro", "Potosí", "Chuquisaca", "Tarija", "Beni", "Pando"};
        JComboBox lista = new JComboBox(opciones);
        lista.setBounds(430, 100, 200, 30);
        lista.setSelectedItem("Pando");
        panel.add(lista);
    }
    private void colocarAreaDeTexto() {
        JTextArea contactanos = new JTextArea();
        contactanos.setBounds(20, 610, 300, 300);
        contactanos.setBackground(null);
        contactanos.setForeground(Color.white);
        contactanos.setText("Contáctanos: \nAv. Ayacucho entre Colombia y Ecuador \n+591 62615493 \n4 4446666 \n Cochabamba-Bolivia");
        panel.add(contactanos);
        //descricion cristo
        JTextArea descripcion = new JTextArea();
        descripcion.setBounds(320, 180, 180, 90);
        descripcion.setBackground(new Color(11, 93, 157));
        descripcion.setForeground(Color.white);
        descripcion.setText("Una reserva creada en \n1978 con el objetivo de \nproteger la zona más \nrepresentativa de los \nbosques amazónicos.");
        panel.add(descripcion);
        //descripcion parque
        JTextArea descripcion2 = new JTextArea();
        descripcion2.setBounds(800, 180, 180, 90);
        descripcion2.setBackground(new Color(11, 93, 157));
        descripcion2.setForeground(Color.white);
        descripcion2.setText("Esta fue la primera \nciudad en ser la capital del\n departamento de Pando \ncuando fue creado en 1938");
        panel.add(descripcion2);
        //descripcion catedral
        JTextArea descripcion3 = new JTextArea();
        descripcion3.setBounds(320, 390, 180, 90);
        descripcion3.setBackground(new Color(11, 93, 157));
        descripcion3.setForeground(Color.white);
        descripcion3.setText("La ciudad de Cobija es \nla capital del Departamento \nde Pando. La ciudad \nes fronteriza con el vecino \npaís de Brasil");
        panel.add(descripcion3);

    }
    private void colocarBotones(){
        //boton del pando
        JButton boton1 = new JButton("Paquetes ");
        boton1.setBounds(320, 280, 180, 50);
        boton1.setEnabled(true);
        boton1.setBackground(new Color(104,205,253));
        boton1.setForeground(Color.black);
        boton1.setFont(new Font("cooper black", 2, 15));
        panel.add(boton1);
        //imagen de pando
        JButton boton5 = new JButton();
        boton5.setBounds(540,180,250,150);
        boton5.setEnabled(true);
        ImageIcon icono = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Pando/pando2.jpg");
        boton5.setIcon(new ImageIcon(icono.getImage().getScaledInstance(300,200,4)));
        panel.add(boton5);
        //evento de la imagen
        ActionListener accion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoPnd2 v2 = new InfoPnd2();
                v2.setVisible(true);
            }
        };
        boton5.addActionListener(accion);
        //boton de pando2
        JButton boton2 = new JButton("Paquetes ");
        boton2.setBounds(800, 280, 180, 50);
        boton2.setEnabled(true);
        boton2.setBackground(new Color(104,205,253));
        boton2.setForeground(Color.black);
        boton2.setFont(new Font("cooper black", 2, 15));
        panel.add(boton2);
        //imagen de pando2
        JButton boton6 = new JButton();
        boton6.setBounds(60,180,250,150);
        boton6.setEnabled(true);
        ImageIcon icono1 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Pando/pando.jpg");
        boton6.setIcon(new ImageIcon(icono1.getImage().getScaledInstance(300,200,4)));
        panel.add(boton6);
        //evento de la imagen
        ActionListener accion1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoPnd1 v2 = new InfoPnd1();
                v2.setVisible(true);
            }
        };
        boton6.addActionListener(accion1);
        //boton de pando1
        JButton boton3 = new JButton("Paquetes ");
        boton3.setBounds(320, 490, 180, 50);
        boton3.setEnabled(true);
        boton3.setBackground(new Color(104,205,253));
        boton3.setForeground(Color.black);
        boton3.setFont(new Font("cooper black", 2, 15));
        panel.add(boton3);
        //imagen de pando2
        JButton boton7 = new JButton();
        boton7.setBounds(60,390,250,150);
        boton7.setEnabled(true);
        ImageIcon icono2 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Pando/pando1.jpg");
        boton7.setIcon(new ImageIcon(icono2.getImage().getScaledInstance(300,200,4)));
        panel.add(boton7);
        //evento de la imagen
        ActionListener accion2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoPnd3 v2 = new InfoPnd3();
                v2.setVisible(true);
            }
        };
        boton7.addActionListener(accion2);

    }
}
