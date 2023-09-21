package osiedle.abstrakcyjne;

import przedmiot.Przedmiot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public abstract class Miejsce {
    private String id;
    private int powierzchnia;

    private Date dataRozpoczeciaNajmu;
    private Date dataZakonczeniaNajmu;
    private List<Przedmiot> przedmioty = new ArrayList<>();

    public Miejsce(int powierzchnia) {
        this.powierzchnia = powierzchnia;
        this.id = UUID.randomUUID().toString();
    }

    public int getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(int powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public String getId() {
        return id;
    }

    public Date getDataRozpoczeciaNajmu() {
        return dataRozpoczeciaNajmu;
    }

    public void setDataRozpoczeciaNajmu(Date dataRozpoczeciaNajmu) {
        this.dataRozpoczeciaNajmu = dataRozpoczeciaNajmu;
    }

    public Date getDataZakonczeniaNajmu() {
        return dataZakonczeniaNajmu;
    }

    public void setDataZakonczeniaNajmu(Date dataZakonczeniaNajmu) {
        this.dataZakonczeniaNajmu = dataZakonczeniaNajmu;
    }

    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty) {
        this.przedmioty = przedmioty;
    }

    @Override
    public String toString() {
        return "Miejsce{" +
                "powierzchnia=" + powierzchnia +
                ", id='" + id + '\'' +
                '}';
    }
}
