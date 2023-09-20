package przedmiot;

import osiedle.Powierzchnia;
import przedmiot.abstrakcyjne.Pojazd;
import przedmiot.enumy.TypMotocykla;

public class Motocykl extends Pojazd {
    private TypMotocykla typMotocykla;

    public Motocykl(String nazwa, Powierzchnia powierzchnia, TypMotocykla typMotocykla) {
        super(nazwa, powierzchnia);
        this.typMotocykla = typMotocykla;
    }
}
