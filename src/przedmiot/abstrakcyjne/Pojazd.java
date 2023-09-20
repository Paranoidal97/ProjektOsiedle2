package przedmiot.abstrakcyjne;

import osiedle.Powierzchnia;
import przedmiot.Przedmiot;

public abstract class Pojazd extends Przedmiot {

    public Pojazd(String nazwa, Powierzchnia powierzchnia) {
        super(nazwa, powierzchnia);
    }
}
