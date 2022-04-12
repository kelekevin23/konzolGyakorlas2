package konzol;

public class Eszkoz {

    
    private String nev;
    private int suly;

    public Eszkoz(String nev, int suly) {
        this.nev = nev;
        this.suly = suly;
    }

    @Override
    public String toString() {
        return "\n\t\tnev=" + nev + ", suly=" + suly;
    }

    public String getNev() {
        return nev;
    }

    public int getSuly() {
        return suly;
    }


}
