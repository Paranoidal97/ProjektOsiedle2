package przedmiot.abstrakcyjne;

import osiedle.RozmiarPomieszczenia;
import przedmiot.abstrakcyjne.Pojazd;

public abstract class Samochod extends Pojazd {
    private String nazwaSilnika;

    public Samochod(String nazwa, RozmiarPomieszczenia rozmiarPomieszczenia, String nazwaSilnika) {
        super(nazwa, rozmiarPomieszczenia);
        this.nazwaSilnika = nazwaSilnika;
    }
}
