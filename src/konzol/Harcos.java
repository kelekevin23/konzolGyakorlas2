package konzol;

public class Harcos extends Karakter implements Comparable<Harcos> {

    public static EroComparator RendezEro() {
        return new EroComparator();
    }

    public static UgyComparator RendezUgy() {
        return new UgyComparator();
    }

    private int ero, ugyesseg;

    public Harcos(String nev, int ero, int ugyesseg) {
        this(nev, "ember", ero, ugyesseg);
    }

    public Harcos(String nev, String faj, int ero, int ugyesseg) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }

    public int getEro() {
        return ero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n\tero=" + ero
                + "\n\tugyesseg=" + ugyesseg
                + "\n}";
    }

    @Override
    public int compareTo(Harcos o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
