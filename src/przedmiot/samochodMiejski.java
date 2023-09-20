package przedmiot;

import osiedle.Powierzchnia;
import przedmiot.abstrakcyjne.Samochod;
import przedmiot.enumy.TypSamochodu;

public class samochodMiejski extends Samochod {
    private TypSamochodu typSamochodu;

    public samochodMiejski(String nazwa, Powierzchnia powierzchnia, String nazwaSilnika, TypSamochodu typSamochodu) {
        super(nazwa, powierzchnia, nazwaSilnika);
        this.typSamochodu = typSamochodu;
    }
}
