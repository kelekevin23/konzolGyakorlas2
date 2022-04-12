package konzol;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {

        ArrayList<Harcos> harcosok = new ArrayList<>();
        Harcos h = new Harcos("Kevin", "ork", 10, 3);
        Harcos h1 = new Harcos("Béla", 3, 5);
        Harcos h2 = new Harcos("Marci", "troll", 9, 9);
        Harcos h3 = new Harcos("Roli", "mágus", 1, 3);

        harcosok.add(h);
        harcosok.add(h1);
        harcosok.add(h2);
        harcosok.add(h3);
        h.felvesz(new Eszkoz("Kalapács", 10));
        h.felvesz(new Eszkoz("Kard", 8));
        h.felvesz(new Eszkoz("Pajzs", 30));
        h.felvesz(new Eszkoz("Buzogány", 10));

        // System.out.println(h);
        //h.eldobEszkoz(new Eszkoz("Kard", 8));
        //  h.masolhatoRendez();
        //  System.out.println(h);
        System.out.println(harcosok);
        System.out.println("Erő rendezés");
        Collections.sort(harcosok, Harcos.RendezEro());
        System.out.println(harcosok);
        System.out.println("Ügyesség rendezés");
        Collections.sort(harcosok, Harcos.RendezUgy());
        System.out.println(harcosok);
    }
}
