package osiedle;

public class Powierzchnia {
    private double objetosc;

    public Powierzchnia(double objetosc) {
        this.objetosc = objetosc;
    }

    public Powierzchnia(double dlugosc, double szerokosc, double wysokosc) {
        this.objetosc = dlugosc * szerokosc * wysokosc;
    }

    public double getObjetosc() {
        return objetosc;
    }

    public void setObjetosc(double objetosc) {
        this.objetosc = objetosc;
    }

    @Override
    public String toString() {
        return "RozmiarPomieszczenia{" +
                "objetosc=" + objetosc +
                '}';
    }
}
