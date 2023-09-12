package osoba;

import java.util.Date;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private Adres adres;
    private Date dataUrodzenia;

    public Osoba(String imie, String nazwisko, String pesel, Adres adres, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        PeselValidator peselValidator = new PeselValidator(pesel);
        if (peselValidator.isValid()) {
            this.pesel = pesel;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy numer pesel");
        }

        this.adres = adres;
        this.dataUrodzenia = dataUrodzenia;
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

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", adres=" + adres +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }
}
