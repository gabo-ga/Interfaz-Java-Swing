import javax.swing.*;
import java.awt.*;
public class InfoCbba2 extends JFrame{
    JPanel panel = new JPanel();

    public InfoCbba2() {
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
        ImageIcon imagen1 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Cochabamba/info2/info1.jpg");
        JLabel foto1 = new JLabel();
        foto1.setBounds(30,100,350,250);
        foto1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(300,200,4)));
        panel.add(foto1);
        //imagen1
        ImageIcon imagen2 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Cochabamba/info2/info4.jpg");
        JLabel foto2 = new JLabel();
        foto2.setBounds(750,120,350,450);
        foto2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(300,450,4)));
        panel.add(foto2);
        //imagen2
        ImageIcon imagen3 = new ImageIcon("/Users/gabrielgonzales/Documents/Universidad/4toSemestre/MyT/Cochabamba/info2/info3.jpg");
        JLabel foto3 = new JLabel();
        foto3.setBounds(30,340,350,250);
        foto3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(300,250,4)));
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
        descripcion.setText("Ubicado en la avenida costanera, al noroeste de la ciudad, donde funciono el antiguo zoologico, recientemente<p>" +
                "            fue remozado con una importante inversion para consolidar como un lugar turistico. donde destacan las 5 fuentes de aguas danzantes, +" +
                "                con hermosas proyecciones de imagenes en el agua, videos y luces LED multicolores, combinado con los enormes disparos de agua a una altura de hasta 20 metros. +" +
                "                n Cuenta ademas con zona de comidas, areas de descanso, etc");
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
