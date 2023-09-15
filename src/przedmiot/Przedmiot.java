package przedmiot;

import osiedle.RozmiarPomieszczenia;

public class Przedmiot {
    private String nazwa;
    private RozmiarPomieszczenia rozmiarPomieszczenia;

    public Przedmiot(String nazwa, RozmiarPomieszczenia rozmiarPomieszczenia) {
        this.nazwa = nazwa;
        this.rozmiarPomieszczenia = rozmiarPomieszczenia;
    }
}
