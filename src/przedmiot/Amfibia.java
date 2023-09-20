package przedmiot;

import osiedle.Powierzchnia;
import przedmiot.abstrakcyjne.Pojazd;
import przedmiot.enumy.TypAmfibii;

public class Amfibia extends Pojazd {
    TypAmfibii typAmfibii;

    public Amfibia(String nazwa, Powierzchnia powierzchnia, TypAmfibii typAmfibii) {
        super(nazwa, powierzchnia);
        this.typAmfibii = typAmfibii;
    }
}
