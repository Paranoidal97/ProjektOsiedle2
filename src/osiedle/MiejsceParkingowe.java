package osiedle;

import osiedle.abstrakcyjne.Miejsce;
import przedmiot.abstrakcyjne.Pojazd;

import java.util.ArrayList;
import java.util.List;

public class MiejsceParkingowe extends Miejsce {
    private List<Pojazd> pojazdy = new ArrayList<>();

    public MiejsceParkingowe(int powierzchnia) {
        super(powierzchnia);
    }
}
