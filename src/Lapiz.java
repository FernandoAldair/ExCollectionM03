

public class Lapiz{
    private String col;
    private float gru;

    public Lapiz (String color, float grueso){
        col = color;
        gru = grueso;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public float getGru() {
        return gru;
    }

    public void setGru(float gru) {
        this.gru = gru;
    }



    @Override
    public String toString() {
        return "Lapiz{" +
                "col='" + col + '\'' +
                ", gru=" + gru +
                '}';
    }


}
