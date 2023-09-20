package przedmiot.abstrakcyjne;

import osiedle.Powierzchnia;

public abstract class Samochod extends Pojazd {
    private String nazwaSilnika;

    public Samochod(String nazwa, Powierzchnia powierzchnia, String nazwaSilnika) {
        super(nazwa, powierzchnia);
        this.nazwaSilnika = nazwaSilnika;
    }
}
