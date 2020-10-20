import java.util.Comparator;

public class comparador implements Comparator<Lapiz> {
    @Override
    public int compare(Lapiz o1, Lapiz o2) {
        if(o1.getGru() < o2.getGru()) return 1;
        else if(o1.getGru() > o2.getGru()) return -1;
        else return 0;
    }
}
