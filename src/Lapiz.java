import java.awt.*;
import java.util.Objects;


public class Lapiz implements Comparable<Lapiz>{

    private int col;
    private float gru;

    public Lapiz (int color, float grueso){
        this.col = color;
        this.gru = grueso;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public float getGru() {
        return gru;
    }

    public void setGru(float gru) {
        this.gru = gru;
    }

    @Override
    public int compareTo(Lapiz lapiz) {
        return 0;
    }

    @Override
    public String toString() {
        return "Lapiz{" +
                "col='" + col + '\'' +
                ", gru=" + gru +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lapiz lapiz = (Lapiz) o;
        return Float.compare(lapiz.gru, gru) == 0 &&
                Objects.equals(col, lapiz.col);
    }

    @Override
    public int hashCode() {
        return Objects.hash(col, gru);
    }

}
