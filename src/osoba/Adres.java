package osoba;

public class Adres {
    private String ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String miasto;

    private String numerMieszkania;

    public Adres(String ulica, String numerDomu, String kodPocztowy, String miasto) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public Adres(String ulica, String numerDomu, String kodPocztowy, String miasto, String numerMieszkania) {
        this(ulica, numerDomu, kodPocztowy, miasto);
        this.numerMieszkania = numerMieszkania;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(String numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Adres{");
        stringBuilder.append("ulica='").append(ulica).append('\'');
        stringBuilder.append(", numerDomu='").append(numerDomu).append('\'');
        stringBuilder.append(", kodPocztowy='").append(kodPocztowy).append('\'');
        stringBuilder.append(", miasto='").append(miasto).append('\'');

        if (numerMieszkania != null) {
            stringBuilder.append(", numerMieszkania='").append(numerMieszkania).append('\'');
        }

        stringBuilder.append('}');

        return stringBuilder.toString();
    }
}