package Service;

import osiedle.Osiedle;
import osoba.Developer;
import osoba.Osoba;

import java.util.HashSet;
import java.util.Set;

public class MenuService {

    public void showOsoby(Developer developer){
        Set<Osoba> mieszkancyWszystkichOsiedli = new HashSet<>();
        Set<Osiedle> osiedla = developer.getOsiedla();
        for (Osiedle osiedle : osiedla) {
            Set<Osoba> mieszkany = osiedle.getMieszkancy();
            mieszkancyWszystkichOsiedli.addAll(mieszkany);
        }

        for (Osoba osoba : mieszkancyWszystkichOsiedli) {
            System.out.println(osoba);
        }
    }
}
