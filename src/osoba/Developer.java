package osoba;

import osiedle.Osiedle;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Developer extends Osoba{
    private Set<Osiedle> osiedla;
    private String nazwaFirmy;

    private Adres adres;

    public Developer(String imie, String nazwisko, String pesel, Adres adres, Date dataUrodzenia, String nazwaFirmy) {
        super(imie, nazwisko, pesel, dataUrodzenia);
        this.adres = adres;
        this.osiedla = new HashSet<>();
        this.nazwaFirmy = nazwaFirmy;
    }

    public Set<Osiedle> getOsiedla() {
        return osiedla;
    }

    public void setOsiedla(Set<Osiedle> osiedla) {
        this.osiedla = osiedla;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public void dodajOsiedle(Osiedle osiedle){
        if(osiedla.contains(osiedle)){
            System.out.println("Dany developer już ma takie osiedle");
        } else {
            osiedla.add(osiedle);
            System.out.println("Osiedle zostało dodane");
        }
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString() +
                "osiedla=" + osiedla +
                ", nazwaFirmy='" + nazwaFirmy + '\'' +
                '}';
    }
}
