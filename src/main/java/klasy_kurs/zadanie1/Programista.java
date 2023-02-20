package klasy_kurs.zadanie1;

public class Programista {
    private String imie;
    private String nazwisko;
    private String jezyk;
    private int zarobki;

    public String pobierzImie() {
        return imie;
    }

    public String pobierzNazwisko() {
        return nazwisko;
    }

    public String pobierzJezyk() {
        return jezyk;
    }

    public int pobierzZarobki() {
        return zarobki;
    }

    public Programista(String imie, String nazwisko, String jezyk, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.jezyk = jezyk;
        this.zarobki = zarobki;
    }
}
