package przedmiot.abstrakcyjne;

import osiedle.RozmiarPomieszczenia;
import przedmiot.Przedmiot;

public abstract class Pojazd extends Przedmiot {

    public Pojazd(String nazwa, RozmiarPomieszczenia rozmiarPomieszczenia) {
        super(nazwa, rozmiarPomieszczenia);
    }
}
