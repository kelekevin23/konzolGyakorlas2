package konzol;

public class Program {

    public static void main(String[] args) {

        Harcos h = new Harcos("Kevin", "faj", 0, 0);

        h.felvesz(new Eszkoz("Kalapács", 10));
        h.felvesz(new Eszkoz("Kard", 8));
        h.felvesz(new Eszkoz("Pajzs", 30));
        h.felvesz(new Eszkoz("Buzogány", 10));

        System.out.println(h);
        //h.eldobEszkoz(new Eszkoz("Kard", 8));
        h.masolhatoRendez();
        System.out.println(h);
    }
}
