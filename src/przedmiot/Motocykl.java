package przedmiot;

import osiedle.RozmiarPomieszczenia;
import przedmiot.abstrakcyjne.Pojazd;
import przedmiot.enumy.TypMotocykla;

public class Motocykl extends Pojazd {
    private TypMotocykla typMotocykla;

    public Motocykl(String nazwa, RozmiarPomieszczenia rozmiarPomieszczenia, TypMotocykla typMotocykla) {
        super(nazwa, rozmiarPomieszczenia);
        this.typMotocykla = typMotocykla;
    }
}
