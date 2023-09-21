package osiedle;

import osiedle.abstrakcyjne.Miejsce;
import osoba.Osoba;

import java.util.ArrayList;
import java.util.List;

public class Mieszkanie extends Miejsce {
    private List<Osoba> wynajmujacy;
    private Osoba najemca;

    public Mieszkanie(int powierzchnia) {
        super(powierzchnia);
        this.wynajmujacy = new ArrayList<>();
    }

    public List<Osoba> getWynajmujacy() {
        return wynajmujacy;
    }

    public void setWynajmujacy(List<Osoba> wynajmujacy) {
        this.wynajmujacy = wynajmujacy;
    }

    public Osoba getNajemca() {
        return najemca;
    }

    public void setNajemca(Osoba najemca) {
        this.najemca = najemca;
    }

    public void zameldujOsobe(Osoba osoba) {
        wynajmujacy.add(osoba);
    }

    // Metoda do wymeldowania osoby z mieszkania
    public void wymeldujOsobe(Osoba osoba) {
        wynajmujacy.remove(osoba);
    }

}
