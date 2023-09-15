package przedmiot;

import osiedle.RozmiarPomieszczenia;
import przedmiot.abstrakcyjne.Samochod;
import przedmiot.enumy.TypSamochodu;

public class samochodMiejski extends Samochod {
    private TypSamochodu typSamochodu;

    public samochodMiejski(String nazwa, RozmiarPomieszczenia rozmiarPomieszczenia, String nazwaSilnika, TypSamochodu typSamochodu) {
        super(nazwa, rozmiarPomieszczenia, nazwaSilnika);
        this.typSamochodu = typSamochodu;
    }
}
