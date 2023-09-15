package osiedle;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Blok {
    private String miasto;
    private String ulica;
    private String nrBudynku;
    private int iloscMieszkan;

    private Set<Mieszkanie> mieszkania;

    public Blok(String miasto, String ulica, String nrBudynku, int iloscMieszkan) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrBudynku = nrBudynku;
        this.iloscMieszkan = iloscMieszkan;
        this.mieszkania = new HashSet<>();
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrBudynku() {
        return nrBudynku;
    }

    public void setNrBudynku(String nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    public int getIloscMieszkan() {
        return iloscMieszkan;
    }

    public void setIloscMieszkan(int iloscMieszkan) {
        this.iloscMieszkan = iloscMieszkan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blok blok = (Blok) o;
        return Objects.equals(miasto, blok.miasto) && Objects.equals(ulica, blok.ulica) && Objects.equals(nrBudynku, blok.nrBudynku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(miasto, ulica, nrBudynku);
    }

    @Override
    public String toString() {
        return "Blok{" +
                "miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", nrBudynku='" + nrBudynku + '\'' +
                ", iloscMieszkan=" + iloscMieszkan +
                '}';
    }
}
