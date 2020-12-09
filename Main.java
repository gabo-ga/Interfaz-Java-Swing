import javax.imageio.spi.RegisterableService;
import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        Admin v1 = new Admin();
        v1.setVisible(true);
        RegistrarCliente v2 = new RegistrarCliente();
        v2.setVisible(true);
        ReservarPaquete v3 = new ReservarPaquete();
        v3.setVisible(true);
        CancelarReserva v4 = new CancelarReserva();
        v4.setVisible(true);
        ListaDePaquetes v5 = new ListaDePaquetes();
        v5.setVisible(true);
        LugaresTuristicosCbba v6 = new LugaresTuristicosCbba();
        v6.setVisible(true);
        LugaresTuristicosScz v7 = new LugaresTuristicosScz();
        v7.setVisible(true);
        LugaresTuristicosLpz v8 = new LugaresTuristicosLpz();
        v8.setVisible(true);
        LugaresTuristicosPando v9 = new LugaresTuristicosPando();
        v9.setVisible(true);

    }
}
