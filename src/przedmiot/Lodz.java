package przedmiot;

import osiedle.RozmiarPomieszczenia;
import przedmiot.abstrakcyjne.Pojazd;
import przedmiot.enumy.TypLodzi;

public class Lodz extends Pojazd {
    private TypLodzi typLodzi;

    public Lodz(String nazwa, RozmiarPomieszczenia rozmiarPomieszczenia, TypLodzi typLodzi) {
        super(nazwa, rozmiarPomieszczenia);
        this.typLodzi = typLodzi;
    }
}
