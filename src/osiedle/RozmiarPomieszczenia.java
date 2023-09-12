package osiedle;

public class RozmiarPomieszczenia {
    private double objetosc;

    public RozmiarPomieszczenia(double objetosc) {
        this.objetosc = objetosc;
    }

    public RozmiarPomieszczenia(double dlugosc, double szerokosc, double wysokosc) {
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
