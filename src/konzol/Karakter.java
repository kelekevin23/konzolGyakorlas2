package konzol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Karakter implements Cloneable, Serializable {

    private String nev, faj;
    private ArrayList<Eszkoz> eszkozok;
    private boolean rendezes;

    public Karakter(String nev) {
        this(nev, "ember");
    }

    public Karakter(String nev, String faj) {
            if (nev.length() < 3) {
                new NevException("Nem megfelelő név!");
            } else {
                this.nev = nev;
                this.faj = faj;
                this.eszkozok = new ArrayList<>();
                this.rendezes = false;
            }
        

    }

    public String getNev() {
        return nev;
    }

    public String getFaj() {
        return faj;
    }

    public ArrayList<Eszkoz> getEszkozok() {
        return eszkozok;
    }

    public void felvesz(Eszkoz esz) {
        eszkozok.add(esz);
    }

    public void eldobIndex(int index) {
        eszkozok.remove(index);
    }

    public void eldobEszkoz(Eszkoz esz) {
        boolean marVolt = false;
        for (int i = 0; i < eszkozok.size(); i++) {
            if (eszkozok.get(i).getNev().equals(esz.getNev()) && !marVolt) {
                if (eszkozok.get(i).getSuly() == esz.getSuly()) {
                    eldobIndex(i);
                    marVolt = true;
                }
            }
        }
    }

    public ArrayList<Eszkoz> rendez() {
        Collections.sort(eszkozok, new NevComparator());
        return (ArrayList<Eszkoz>) eszkozok.clone();
    }

    

    /*public List<Eszkoz> modosithatatlanRendez(){
        Collections.sort(eszkozok, new NevComparator());
        return Collections.unmodifiableList(eszkozok);
    } */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("\nKarakter{\nHarcos\n\tnev=").append(nev).append("\n\tfaj=").append(faj).append("\n\teszkozok=");
        if (rendezes) {
            s.append(rendez());
        } else {
            s.append(getEszkozok());
        }
        s.append('}');
        return s.toString();
    }

}
