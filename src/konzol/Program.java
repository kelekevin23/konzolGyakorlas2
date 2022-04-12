package konzol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        ArrayList<Harcos> harcosok = new ArrayList<>();

        //1. feladatrész
        //Harcos h = new Harcos("Ke", "ork", 10, 3);
        Harcos h = new Harcos("Kevin", "ork", 10, 3);
        Harcos h1 = new Harcos("Béla", 3, 5);
        Harcos h2 = new Harcos("Marci", "troll", 9, 9);
        Harcos h3 = new Harcos("Roli", "mágus", 1, 3);

        harcosok.add(h);
        harcosok.add(h1);
        harcosok.add(h2);
        harcosok.add(h3);

        //2. feladatrész
        h.felvesz(new Eszkoz("Kalapács", 10));
        h.felvesz(new Eszkoz("Kard", 8));
        h.felvesz(new Eszkoz("Pajzs", 30));
        h.felvesz(new Eszkoz("Buzogány", 10));
        //System.out.println(h);
        //h.eldobEszkoz(new Eszkoz("Kard", 8));
        //h.eldobIndex(1);
        //h.rendez();
        //System.out.println(h);

        //3. feladatrész
        //órán!!!
        //4. feladatrész
        System.out.println(h);
        ment(h);
        System.out.println("harcos null");
        h = null;
        System.out.println("harcos beolvasva:");
        beolvas();
        System.out.println(h);

        //5. feladatrész
        /*  System.out.println(harcosok);
        System.out.println("Erő rendezés");
        Collections.sort(harcosok, Harcos.RendezEro());
        System.out.println(harcosok);
        System.out.println("Ügyesség rendezés");
        Collections.sort(harcosok, Harcos.RendezUgy());
        System.out.println(harcosok);*/
    }

    private static void ment(Harcos harcos) {
        try {
            FileOutputStream fajlKi = new FileOutputStream("harcos.ser");
            ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(harcos);
            objKi.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    private static Harcos beolvas() {
        Harcos harcos = null;
        
        try {
            FileInputStream fajlBe = new FileInputStream("harcos.ser");
            ObjectInputStream objBe = new ObjectInputStream(fajlBe);
            harcos = (Harcos) objBe.readObject();
            System.out.println(harcos);
            objBe.close();  
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException | ClassNotFoundException ex) {
           System.err.println(ex);
        }finally{
            return harcos;
        }
    }
}
