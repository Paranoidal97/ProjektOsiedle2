package osoba;

import osiedle.abstrakcyjne.Miejsce;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private Date dataUrodzenia;

    private List<Miejsce> najmy;
    private List<String> zadluzenia = new ArrayList<>(); // Lista plików z zadłużeniami

    public Osoba(String imie, String nazwisko, String pesel, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        PeselValidator peselValidator = new PeselValidator(pesel);
        if (peselValidator.isValid()) {
            this.pesel = pesel;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy numer pesel");
        }
        this.dataUrodzenia = dataUrodzenia;
        this.najmy = new ArrayList<>();
        this.zadluzenia = new ArrayList<>();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public List<Miejsce> getNajmy() {
        return najmy;
    }

    public void setNajmy(List<Miejsce> najmy) {
        this.najmy = najmy;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }
}
