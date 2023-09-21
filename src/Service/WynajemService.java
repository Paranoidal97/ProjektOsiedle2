package Service;

import osiedle.Mieszkanie;
import osiedle.abstrakcyjne.Miejsce;
import osoba.Osoba;

import java.util.Date;
import java.util.List;

public class WynajemService {

    // ustawiamy 1 osobe jako najmujacego i dodajemy do listy wynajmujacych
    public void zameldujOsobe(Osoba osobaDoZameldowania, Mieszkanie mieszkanie){
        if(mieszkanie.getWynajmujacy().size() == 0){
            mieszkanie.setNajemca(osobaDoZameldowania);
            mieszkanie.zameldujOsobe(osobaDoZameldowania);
            System.out.println("ustawiono najemce");
        } else {
            System.out.println("mieszkanie ma już ustawionego Najemce");
        }
    }

    public void zameldujOsobe(Osoba najemca, Osoba osobaDoZameldowania, Mieszkanie mieszkanie){
        if(najemca.equals(mieszkanie.getNajemca())){
            if(mieszkanie.getWynajmujacy().contains(osobaDoZameldowania)){
                System.out.println("ta osoba jest już zameldowana");
            } else {
                mieszkanie.zameldujOsobe(osobaDoZameldowania);
                System.out.println("osoba została zameldowana");
            }
        } else {
            System.out.println("ta osoba nie jest najemca");
        }
    }


    //TODO

//    Pomieszczenie dla określonego najemcy posiada również date rozpoczęcia najmu oraz datę
//    zakończenia najmu. Jeśli data zakończenia najmu się przedawniła, to zostaje wystosowane pismo(
//            obiekt typu File), które zostaje zapisane do obiektu klasy Osoba definiującego konkretnego
//    najemce.

    public void monitorujDatyZakoczeniaNajmu(List<Miejsce> miejsce){
        Date currentDate = new Date();

        for (Miejsce miejsce1 : miejsce) {
            Date dataZakończeniaNajmu = miejsce1.getDataZakonczeniaNajmu();
            if(currentDate.after(dataZakończeniaNajmu)){

            }
        }

    }
}
