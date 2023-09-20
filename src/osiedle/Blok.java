package osiedle;

import osoba.Adres;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Blok {
    private Adres adres;
    private int iloscMieszkan;

    private Set<Mieszkanie> mieszkania;

    public Blok(Adres adres, int iloscMieszkan) {
        this.adres = adres;
        this.iloscMieszkan = iloscMieszkan;
        this.mieszkania = new HashSet<>();
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public int getIloscMieszkan() {
        return iloscMieszkan;
    }

    public void setIloscMieszkan(int iloscMieszkan) {
        this.iloscMieszkan = iloscMieszkan;
    }

    public Set<Mieszkanie> getMieszkania() {
        return mieszkania;
    }

    public void setMieszkania(Set<Mieszkanie> mieszkania) {
        this.mieszkania = mieszkania;
    }

    public void addMieszkanie(Mieszkanie mieszkanie){
        if(mieszkania.size() + 1 > iloscMieszkan){
            System.out.println("Za duża liczba mieszkań");
        } else {
            this.mieszkania.add(mieszkanie);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blok blok = (Blok) o;
        return Objects.equals(adres, blok.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adres);
    }

    @Override
    public String toString() {
        return "Blok{" +
                "adres=" + adres +
                ", iloscMieszkan=" + iloscMieszkan +
                ", mieszkania=" + mieszkania +
                '}';
    }
}
