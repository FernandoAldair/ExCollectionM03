import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int contenido = 10;

        Lapiz lapiz = new Lapiz(0,0);

        List<Lapiz> listaLapiz1 = new ArrayList<>();
        List<Lapiz> listaLapiz2 = new ArrayList<>();

        for (int i = 0; i < contenido ; i++) {
            lapiz = new Lapiz((int)(rand.nextInt(8)),0);
            listaLapiz1.add(new Lapiz(lapiz));
        }

        for (int i = 0; i < contenido ; i++) {

        }

    }
}
