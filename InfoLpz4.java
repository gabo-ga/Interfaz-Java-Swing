import javax.swing.*;
import java.awt.*;
public class InfoLpz4 extends JFrame{
    JPanel panel = new JPanel();

    public InfoLpz4() {
        setTitle("");
        setBounds(500, 200, 1080, 800);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(32, 112, 193));
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiqueta();
        colocarAreaDeTexto();
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
        //imagen
        ImageIcon imagen1 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/info4/info1.jpg");
        JLabel foto1 = new JLabel();
        foto1.setBounds(30,100,350,250);
        foto1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(300,200,4)));
        panel.add(foto1);
        //imagen1
        ImageIcon imagen2 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/info4/info3.jpg");
        JLabel foto2 = new JLabel();
        foto2.setBounds(750,120,350,200);
        foto2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(300,450,4)));
        panel.add(foto2);
        //imagen2
        ImageIcon imagen3 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/info4/info2.jpg");
        JLabel foto3 = new JLabel();
        foto3.setBounds(30,340,350,250);
        foto3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(300,250,4)));
        panel.add(foto3);
        //imagen 3
        ImageIcon imagen4 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/LaPaz/info4/info4.jpg");
        JLabel foto4 = new JLabel();
        foto4.setBounds(750,340,350,250);
        foto4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(300,250,4)));
        panel.add(foto4);
    }
    private void colocarAreaDeTexto() {
        JTextArea descripcion = new JTextArea();
        descripcion.setLineWrap(true);
        descripcion.setWrapStyleWord(true);
        descripcion.setBounds(350, 130, 380, 450);
        descripcion.setBackground(new Color(11, 93, 157));
        descripcion.setForeground(Color.white);
        descripcion.setFont(new Font("arial",Font.PLAIN, 18));
        descripcion.setText("Tiahuanaco fue el centro de la civilización tiahuanaco, una cultura " +
                "preincaica que basaba su economía en la agricultura, la ganadería y la arquitectura," +
                " y que abarcó los territorios de la meseta del Collao, entre el oeste de Bolivia," +
                " suroeste de Perú, el norte de Argentina y el norte de Chile. \nLa ciudad de Tiahuanaco se " +
                "caracteriza por su arquitectura decorada con relieves y planos incisos colocados sobre estelas; " +
                "está compuesta por siete construcciones arquitectónicas importantes: Kalasasaya, templete" +
                " semisubterráneo, pirámide de Akapana, Puerta del Sol , Puma Punku y templete , también grandes " +
                "pirámides y esculturas.");
        panel.add(descripcion);
        //contactanos
        JTextArea contactanos = new JTextArea();
        contactanos.setBounds(20, 610, 300, 300);
        contactanos.setBackground(null);
        contactanos.setForeground(Color.white);
        contactanos.setText("Contáctanos: \nAv. Ayacucho entre Colombia y Ecuador \n+591 62615493 \n4 4446666 \n Cochabamba-Bolivia");
        panel.add(contactanos);
    }
}
