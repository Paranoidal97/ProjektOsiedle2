package Exceptions;

import osoba.Osoba;

public class ProblematicTenantException extends Exception{
    public ProblematicTenantException(Osoba osoba) {
        super("Osoba " + osoba.getImie() + " " + osoba.getNazwisko() + " posiadała już najem pomieszczen: " + osoba.getNajmy());
    }
}
