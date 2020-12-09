import javax.swing.*;
import java.awt.*;
public class InfoPnd1 extends JFrame{
    JPanel panel = new JPanel();

    public InfoPnd1() {
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
        ImageIcon imagen1 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Pando/info1/info1.jpg");
        JLabel foto1 = new JLabel();
        foto1.setBounds(30,100,350,250);
        foto1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(300,200,4)));
        panel.add(foto1);
        //imagen1
        ImageIcon imagen2 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Pando/info1/info3.jpg");
        JLabel foto2 = new JLabel();
        foto2.setBounds(750,120,350,450);
        foto2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(300,450,4)));
        panel.add(foto2);
        //imagen2
        ImageIcon imagen3 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Pando/info1/info2.jpg");
        JLabel foto3 = new JLabel();
        foto3.setBounds(30,340,350,230);
        foto3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(300,230,4)));
        panel.add(foto3);

    }
    private void colocarAreaDeTexto() {
        JTextArea descripcion = new JTextArea();
        descripcion.setLineWrap(true);
        descripcion.setWrapStyleWord(true);
        descripcion.setBounds(350, 130, 380, 450);
        descripcion.setBackground(new Color(11, 93, 157));
        descripcion.setForeground(Color.white);
        descripcion.setFont(new Font("arial",Font.PLAIN, 18));
        descripcion.setText("La Reserva Nacional de Vida Silvestre Amazónica Manuripi es un área protegida del departamento de Pando, " +
                "Bolivia. Tiene una superficie de 7.470 km² y fue creada el 20 de diciembre de 1973.1"+
                "\nLos principales río son Manurupi, Madre de Dios y Tahumanu. En flora alberga castaña, mara, cedro, siringa," +
                " variedad de palmeras entre otros. En fauna alberga jaguares, pumas, capibaras, variedad de monos, osos, sapos, ranas, " +
                "serpientes, tortugas, lagartijas, caimanes, 1000 especies de aves y variedad de peces.");
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
