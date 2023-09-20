package przedmiot;

import osiedle.Powierzchnia;
import przedmiot.abstrakcyjne.Samochod;
import przedmiot.enumy.TypNapedu;

public class samochodTerenowy extends Samochod {
    private TypNapedu typNapedu;

    public samochodTerenowy(String nazwa, Powierzchnia powierzchnia, String nazwaSilnika, TypNapedu typNapedu) {
        super(nazwa, powierzchnia, nazwaSilnika);
        this.typNapedu = typNapedu;
    }
}
