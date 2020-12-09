import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LugaresTuristicosCbba extends JFrame{
    JPanel panel = new JPanel();
    public LugaresTuristicosCbba() {
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
        lista.setSelectedItem("Cochabamba");
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
        descripcion.setText("El Cristo de la concorida es \nuna estatua monumental de \n Jesucristo a una altura de \n 265 msnm");
        panel.add(descripcion);
        //descripcion parque
        JTextArea descripcion2 = new JTextArea();
        descripcion2.setBounds(800, 180, 180, 90);
        descripcion2.setBackground(new Color(11, 93, 157));
        descripcion2.setForeground(Color.white);
        descripcion2.setText("El Parque de la Familia es \nun magnifico destino \ncon su principal atraccion que \nson las aguas danzantes");
        panel.add(descripcion2);
        //descripcion catedral
        JTextArea descripcion3 = new JTextArea();
        descripcion3.setBounds(320, 390, 180, 90);
        descripcion3.setBackground(new Color(11, 93, 157));
        descripcion3.setForeground(Color.white);
        descripcion3.setText("La Catedral de San Sebastian fue \nconstruida en el siglo XVIII y \nes un simbolo de la \nciudad de Cochabamba");
        panel.add(descripcion3);
        //descripcion
        JTextArea descripcion4 = new JTextArea();
        descripcion4.setBounds(800, 390, 180, 90);
        descripcion4.setBackground(new Color(11, 93, 157));
        descripcion4.setForeground(Color.white);
        descripcion4.setText("Villa Tunari se ha consolidado \ncomo el centro turistico del \ncon gran variedad de parque y \nreservas naturales");
        panel.add(descripcion4);
    }
    private void colocarBotones(){
        //boton del cristo
        JButton boton1 = new JButton("Paquetes ");
        boton1.setBounds(320, 280, 180, 50);
        boton1.setEnabled(true);
        boton1.setBackground(new Color(104,205,253));
        boton1.setForeground(Color.black);
        boton1.setFont(new Font("cooper black", 2, 15));
        panel.add(boton1);
        //imagen del cristo
        JButton boton2 = new JButton();
        boton2.setBounds(60,180,250,150);
        boton2.setEnabled(true);
        ImageIcon icono = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Cochabamba/cristo.jpg");
        boton2.setIcon(new ImageIcon(icono.getImage().getScaledInstance(300,200,4)));
        panel.add(boton2);
        //evento de la imagen
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoCbba1 v1 = new InfoCbba1();
                v1.setVisible(true);
            }
        };
        boton2.addActionListener(accion);
        //boton del parque de la familia
        JButton boton3 = new JButton("Paquetes ");
        boton3.setBounds(800, 280, 180, 50);
        boton3.setEnabled(true);
        boton3.setBackground(new Color(104,205,253));
        boton3.setForeground(Color.black);
        boton3.setFont(new Font("cooper black", 2, 15));
        panel.add(boton3);
        //imagen del parque de la familia
        JButton boton4 = new JButton();
        boton4.setBounds(540,180,250,150);
        boton4.setEnabled(true);
        ImageIcon icono2 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Cochabamba/parque.jpg");
        boton4.setIcon(new ImageIcon(icono2.getImage().getScaledInstance(300,200,4)));
        panel.add(boton4);
        //evento de la imagen
        ActionListener accion2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoCbba2 v2 = new InfoCbba2();
                v2.setVisible(true);
            }
        };
        boton4.addActionListener(accion2);
        //boton de la catedral
        JButton boton5 = new JButton("Paquetes ");
        boton5.setBounds(320, 490, 180, 50);
        boton5.setEnabled(true);
        boton5.setBackground(new Color(104,205,253));
        boton5.setForeground(Color.black);
        boton5.setFont(new Font("cooper black", 2, 15));
        panel.add(boton5);
        //imagen de la catedral
        JButton boton6 = new JButton();
        boton6.setBounds(60,390,250,150);
        boton6.setEnabled(true);
        ImageIcon icono3 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Cochabamba/lugares.jpg");
        boton6.setIcon(new ImageIcon(icono3.getImage().getScaledInstance(300,200,4)));
        panel.add(boton6);
        //evento de la imagen
        ActionListener accion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoCbba3 v3 = new InfoCbba3();
                v3.setVisible(true);
            }
        };
        boton6.addActionListener(accion3);
        //boton de villa tunari
        JButton boton7 = new JButton("Paquetes ");
        boton7.setBounds(800, 490, 180, 50);
        boton7.setEnabled(true);
        boton7.setBackground(new Color(104,205,253));
        boton7.setForeground(Color.black);
        boton7.setFont(new Font("cooper black", 2, 15));
        panel.add(boton7);
        //imagen de villa tunari
        JButton boton8 = new JButton();
        boton8.setBounds(540,390,250,150);
        boton8.setEnabled(true);
        ImageIcon icono4 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Cochabamba/villa.jpg");
        boton8.setIcon(new ImageIcon(icono4.getImage().getScaledInstance(300,200,4)));
        panel.add(boton8);
        //evento de la imagen
        ActionListener accion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoCbba4 v4 = new InfoCbba4();
                v4.setVisible(true);
            }
        };
        boton8.addActionListener(accion4);


    }
}
