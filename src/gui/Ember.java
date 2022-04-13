package gui;

public class Ember {

    private String nev;
    private int kor, munkaEv;
    private char neme;

    public Ember(String nev, int kor, char neme) {
       this(nev, kor, neme, 0);
    }

    public Ember(String nev, int kor, char neme, int munkaEv) {
        this.nev = nev;
        this.kor = kor;
        this.munkaEv = munkaEv;
        this.neme = neme;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public int getMunkaEv() {
        return munkaEv;
    }

    public char getNeme() {
        return neme;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", kor=" + kor + ", munkaEv=" + munkaEv + ", neme=" + neme + "}";
    }

}
