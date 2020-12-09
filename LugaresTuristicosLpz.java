import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LugaresTuristicosLpz extends JFrame{
    JPanel panel = new JPanel();
    public LugaresTuristicosLpz() {
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
        //imagen 1
        /*ImageIcon imagen1 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/valle.jpg");
        JLabel foto1 = new JLabel();
        foto1.setBounds(60,180,250,150);
        foto1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(300,200,4)));
        panel.add(foto1);
        //imagen 2
        ImageIcon imagen2 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/teleferico.jpg");
        JLabel foto2 = new JLabel();
        foto2.setBounds(540,180,250,150);
        foto2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(300,200,4)));
        panel.add(foto2);
        //imagen 3
        ImageIcon imagen3 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/cholets.jpg");
        JLabel foto3 = new JLabel();
        foto3.setBounds(60,390,250,150);
        foto3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(300,200,4)));
        panel.add(foto3);
        //imagen 4
        ImageIcon imagen4 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/tiahuanacu.jpg");
        JLabel foto4 = new JLabel();
        foto4.setBounds(540,390,250,150);
        foto4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(300,200,4)));
        panel.add(foto4);*/
    }
    private void colocarListaDesplegable() {
        String[] opciones = {"La Paz", "Cochabamba", "Santa Cruz", "Oruro", "Potosí", "Chuquisaca", "Tarija", "Beni", "Pando"};
        JComboBox lista = new JComboBox(opciones);
        lista.setBounds(430, 100, 200, 30);
        lista.setSelectedItem("La Paz");
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
        descripcion.setText("El valle de la Luna \nes una formacion geologica \nmuy curiosa debido \na sus formas");
        panel.add(descripcion);
        //descripcion parque
        JTextArea descripcion2 = new JTextArea();
        descripcion2.setBounds(800, 180, 180, 90);
        descripcion2.setBackground(new Color(11, 93, 157));
        descripcion2.setForeground(Color.white);
        descripcion2.setText("El Teleferico es el \nprincipal sistema de \ntransporte de la ciudad y \nofrece vistas inigualables");
        panel.add(descripcion2);
        //descripcion catedral
        JTextArea descripcion3 = new JTextArea();
        descripcion3.setBounds(320, 390, 180, 90);
        descripcion3.setBackground(new Color(11, 93, 157));
        descripcion3.setForeground(Color.white);
        descripcion3.setText("Las Cholets estan ubicados \nen El Alto, con sus colores \nconsiguen robarle la \nmirada a mas de uno");
        panel.add(descripcion3);
        //descripcion
        JTextArea descripcion4 = new JTextArea();
        descripcion4.setBounds(800, 390, 180, 90);
        descripcion4.setBackground(new Color(11, 93, 157));
        descripcion4.setForeground(Color.white);
        descripcion4.setText("La Tiahuanaco es una \n ciudad arqueologica que \npertenecia al imperio \nInca");
        panel.add(descripcion4);
    }
    private void colocarBotones(){
        //boton del valle de la luna
        JButton boton1 = new JButton("Paquetes ");
        boton1.setBounds(320, 280, 180, 50);
        boton1.setEnabled(true);
        boton1.setBackground(new Color(104,205,253));
        boton1.setForeground(Color.black);
        boton1.setFont(new Font("cooper black", 2, 15));
        panel.add(boton1);
        //imagen del valle de la luna
        JButton boton5 = new JButton();
        boton5.setBounds(60,180,250,150);
        boton5.setEnabled(true);
        ImageIcon icono = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/valle.jpg");
        boton5.setIcon(new ImageIcon(icono.getImage().getScaledInstance(300,200,4)));
        panel.add(boton5);
        //evento de la imagen
        ActionListener accion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoLpz1 v2 = new InfoLpz1();
                v2.setVisible(true);
            }
        };
        boton5.addActionListener(accion);
        //boton del teleferico
        JButton boton2 = new JButton("Paquetes ");
        boton2.setBounds(800, 280, 180, 50);
        boton2.setEnabled(true);
        boton2.setBackground(new Color(104,205,253));
        boton2.setForeground(Color.black);
        boton2.setFont(new Font("cooper black", 2, 15));
        panel.add(boton2);
        //imagen del teleferico
        JButton boton6 = new JButton();
        boton6.setBounds(540,180,250,150);
        boton6.setEnabled(true);
        ImageIcon icono2 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/teleferico.jpg");
        boton6.setIcon(new ImageIcon(icono2.getImage().getScaledInstance(300,200,4)));
        panel.add(boton6);
        //evento de la imagen
        ActionListener accion1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoLpz2 v2 = new InfoLpz2();
                v2.setVisible(true);
            }
        };
        boton6.addActionListener(accion1);
        //boton de los cholets
        JButton boton3 = new JButton("Paquetes ");
        boton3.setBounds(320, 490, 180, 50);
        boton3.setEnabled(true);
        boton3.setBackground(new Color(104,205,253));
        boton3.setForeground(Color.black);
        boton3.setFont(new Font("cooper black", 2, 15));
        panel.add(boton3);
        //imagen de los cholets
        JButton boton7 = new JButton();
        boton7.setBounds(60,390,250,150);
        boton7.setEnabled(true);
        ImageIcon icono3 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/cholets.jpg");
        boton7.setIcon(new ImageIcon(icono3.getImage().getScaledInstance(300,200,4)));
        panel.add(boton7);
        //evento de la imagen
        ActionListener accion2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoLpz3 v2 = new InfoLpz3();
                v2.setVisible(true);
            }
        };
        boton7.addActionListener(accion2);
        //boton de tiahuanacu
        JButton boton4 = new JButton("Paquetes ");
        boton4.setBounds(800, 490, 180, 50);
        boton4.setEnabled(true);
        boton4.setBackground(new Color(104,205,253));
        boton4.setForeground(Color.black);
        boton4.setFont(new Font("cooper black", 2, 15));
        panel.add(boton4);
        //imagen de tiahuanacu
        JButton boton8 = new JButton();
        boton8.setBounds(540,390,250,150);
        boton8.setEnabled(true);
        ImageIcon icono4 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/tiahuanacu.jpg");
        boton8.setIcon(new ImageIcon(icono4.getImage().getScaledInstance(300,200,4)));
        panel.add(boton8);
        //evento de la imagen
        ActionListener accion3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoLpz4 v2 = new InfoLpz4();
                v2.setVisible(true);
            }
        };
        boton8.addActionListener(accion3);

    }
}
