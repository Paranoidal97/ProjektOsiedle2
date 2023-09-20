package przedmiot;

import osiedle.Powierzchnia;
import przedmiot.abstrakcyjne.Pojazd;
import przedmiot.enumy.TypLodzi;

public class Lodz extends Pojazd {
    private TypLodzi typLodzi;

    public Lodz(String nazwa, Powierzchnia powierzchnia, TypLodzi typLodzi) {
        super(nazwa, powierzchnia);
        this.typLodzi = typLodzi;
    }
}
