package konzol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Harcos extends Karakter implements Comparable<Harcos>, Serializable {

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
