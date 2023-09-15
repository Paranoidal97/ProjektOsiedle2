package przedmiot;

import osiedle.RozmiarPomieszczenia;
import przedmiot.abstrakcyjne.Samochod;
import przedmiot.enumy.TypNapedu;

public class samochodTerenowy extends Samochod {
    private TypNapedu typNapedu;

    public samochodTerenowy(String nazwa, RozmiarPomieszczenia rozmiarPomieszczenia, String nazwaSilnika, TypNapedu typNapedu) {
        super(nazwa, rozmiarPomieszczenia, nazwaSilnika);
        this.typNapedu = typNapedu;
    }
}
