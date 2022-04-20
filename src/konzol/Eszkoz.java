package konzol;

import java.io.Serializable;
import java.util.Objects;

public class Eszkoz implements Serializable {

    private String nev;
    private int suly;

    public Eszkoz(String nev, int suly) {
        this.nev = nev;
        //if
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nev);
        hash = 97 * hash + this.suly;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Eszkoz other = (Eszkoz) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (this.suly != other.suly) {
            return false;
        }

        return true;
    }

}
