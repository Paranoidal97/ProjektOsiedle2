package przedmiot;

import osiedle.RozmiarPomieszczenia;
import przedmiot.abstrakcyjne.Pojazd;
import przedmiot.enumy.TypAmfibii;

public class Amfibia extends Pojazd {
    TypAmfibii typAmfibii;

    public Amfibia(String nazwa, RozmiarPomieszczenia rozmiarPomieszczenia, TypAmfibii typAmfibii) {
        super(nazwa, rozmiarPomieszczenia);
        this.typAmfibii = typAmfibii;
    }
}
