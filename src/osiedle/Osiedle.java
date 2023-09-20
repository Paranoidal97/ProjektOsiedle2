package osiedle;

import osoba.Osoba;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Osiedle implements Serializable {
    private String nazwa;
    private String id;
    private Set<Blok> bloki;
    private Set<Osoba> mieszkancy;

    public Osiedle(String nazwa) {
        this.nazwa = nazwa;
        this.id = UUID.randomUUID().toString();
        this.bloki = new HashSet<>();
        this.mieszkancy = new HashSet<>();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<Blok> getBloki() {
        return bloki;
    }

    public void setBloki(Set<Blok> bloki) {
        this.bloki = bloki;
    }

    public void addBlok(Blok blok){
        if(bloki.contains(blok)){
            System.out.println("taki blok jest już dodany");
        } else {
            bloki.add(blok);
        }
    }

    public void usunBlok(Blok blok) {
        bloki.remove(blok);
    }

    public Set<Osoba> getMieszkancy() {
        return mieszkancy;
    }

    public void setMieszkancy(Set<Osoba> mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osiedle osiedle = (Osiedle) o;
        return Objects.equals(id, osiedle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Osiedle{" +
                "nazwa='" + nazwa + '\'' +
                ", id='" + id + '\'' +
                ", bloki=" + bloki +
                '}';
    }
}
