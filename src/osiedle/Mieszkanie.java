package osiedle;

import osiedle.abstrakcyjne.Miejsce;
import osoba.Najemca;
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
        if (najemca == null) {
            najemca = osoba;
        } else {
            System.out.println("Mieszkanie jest już wynajmowane przez inną osobę.");
        }
    }

    // Metoda do wymeldowania osoby z mieszkania
    public void wymeldujOsobe() {
        if (najemca != null) {
            najemca = null;
        } else {
            System.out.println("Mieszkanie nie jest wynajmowane.");
        }
    }

}
