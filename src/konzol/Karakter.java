package konzol;

import java.util.ArrayList;

public abstract class Karakter {

    String nev, faj;
    ArrayList<Eszkoz> eszkozok;
            
    public Karakter(String nev, String faj) {
        this.nev = nev;
        this.faj = faj;
        this.eszkozok = new ArrayList<>();
    }
    
}
