import Helpers.StringToDate;
import Service.MenuService;
import Service.WynajemService;
import osiedle.Blok;
import osiedle.Mieszkanie;
import osiedle.Osiedle;
import osoba.Adres;
import osoba.Developer;
import osoba.Osoba;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        WynajemService wynajemService = new WynajemService();

        StringToDate stringToDate = new StringToDate();
        Date data1 = StringToDate.StringtoDate("2000.11.30").get();
        Adres adres1 = new Adres("Pruszkowa", "4", "02-121", "Warszawa", "19a");


        Developer developer1 = new Developer("Łukasz", "Rams", "91043061893", adres1, data1, "enriko");
        Osiedle osiedle1 = new Osiedle("Fiołkowe");
        developer1.dodajOsiedle(osiedle1);
//        developer1.dodajOsiedle(osiedle1);  // walidacja czy można 2 razy dodac to samo osiedle

        // Przykładowe adresy
        Adres adres2 = new Adres("Ulica 1", "1A", "00-001", "Warszawa");
        Adres adres3 = new Adres("Ulica 2", "2B", "00-002", "Warszawa");
        Adres adres4 = new Adres("Ulica 3", "3C", "00-003", "Warszawa");
        Adres adres5 = new Adres("Ulica 4", "4D", "00-004", "Warszawa");
        Adres adres6 = new Adres("Ulica 5", "5E", "00-005", "Warszawa");

// Tworzenie pięciu obiektów typu Blok
        Blok blok1 = new Blok(adres2, 10);
        Blok blok2 = new Blok(adres3, 8);
        Blok blok3 = new Blok(adres4, 12);
        Blok blok4 = new Blok(adres5, 6);
        Blok blok5 = new Blok(adres6, 15);

        // przypisanie bloków do osiedla

        osiedle1.addBlok(blok1);
        osiedle1.addBlok(blok2);
        osiedle1.addBlok(blok3);
        osiedle1.addBlok(blok4);
        osiedle1.addBlok(blok5);

        // sprawdzenie czy bloki sie przypisały

        System.out.println(osiedle1.getBloki());

        // dodanie mieszkan do bloku

        Mieszkanie mieszkanie1_1 = new Mieszkanie(60); // Mieszkanie o powierzchni 60 m^2
        Mieszkanie mieszkanie1_2 = new Mieszkanie(70); // Mieszkanie o powierzchni 70 m^2
        Mieszkanie mieszkanie1_3 = new Mieszkanie(55); // Mieszkanie o powierzchni 55 m^2
        blok1.addMieszkanie(mieszkanie1_1);
        blok1.addMieszkanie(mieszkanie1_2);
        blok1.addMieszkanie(mieszkanie1_3);

        Mieszkanie mieszkanie2_1 = new Mieszkanie(50); // Mieszkanie o powierzchni 50 m^2
        Mieszkanie mieszkanie2_2 = new Mieszkanie(55); // Mieszkanie o powierzchni 55 m^2
        Mieszkanie mieszkanie2_3 = new Mieszkanie(45); // Mieszkanie o powierzchni 45 m^2
        blok2.addMieszkanie(mieszkanie2_1);
        blok2.addMieszkanie(mieszkanie2_2);
        blok2.addMieszkanie(mieszkanie2_3);

        // sprawdzenie czy mieszkania sie dodały

        System.out.println(blok1.getMieszkania());
        System.out.println(blok2.getMieszkania());

        // utwórz kilka osób

        Osoba osoba1 = new Osoba("Jan", "Kowalski", "89102145772", new Date(95, 0, 2));
        Osoba osoba2 = new Osoba("Anna", "Nowak", "50071023512", new Date(88, 2, 3));
        Osoba osoba3 = new Osoba("Marek", "Wójcik", "00291786119", new Date(75, 3, 1));
        Osoba osoba4 = new Osoba("Ewa", "Lis", "72022633711", new Date(91, 4, 1));
        Osoba osoba5 = new Osoba("Alicja", "Kaczmarek", "74082246849", new Date(86, 5, 1));
        Osoba osoba6 = new Osoba("Agnieszka", "Pawlak", "69072529446", new Date(99, 6, 1));
        Osoba osoba7 = new Osoba("Tomasz", "Michalak", "98031294783", new Date(81, 7, 1));
        Osoba osoba8 = new Osoba("Karolina", "Kwiatkowska", "90050132585", new Date(92, 8, 1));
        Osoba osoba9 = new Osoba("Piotr", "Czajkowski", "67082926431", new Date(80, 0, 1));
        Osoba osoba10 = new Osoba("Katarzyna", "Wojda", "53120742561", new Date(93, 1, 2));

        // przypisanie osob do mieszkan

        wynajemService.zameldujOsobe(osoba2, mieszkanie1_1);
        wynajemService.zameldujOsobe(osoba2, mieszkanie1_1); // test walidacji ustawiania najemcy

        wynajemService.zameldujOsobe(osoba2, osoba3, mieszkanie1_1);
        wynajemService.zameldujOsobe(osoba2, osoba3, mieszkanie1_1); // test czy mozna zameldowac ta sama osobe
        wynajemService.zameldujOsobe(osoba4, osoba3, mieszkanie1_1); // test czy nie najemca moze kogos zameldowac


        Scanner scanner = new Scanner(System.in);
        boolean programRunning = true;

            System.out.println("Menu:");
            System.out.println("1. Wybierz osobę");
            System.out.println("2. Wyświetl dane osoby");
            System.out.println("3. Wyświetl wolne pomieszczenia");
            System.out.println("4. Wynajmij mieszkanie");
            System.out.println("5. Wyświetl zawartość mieszkania");
            System.out.println("6. Włóż przedmiot lub pojazd");
            System.out.println("7. Wyjmij przedmiot lub pojazd");
            System.out.println("8. Zapisz stan osiedla do pliku");
            System.out.println("9. Zakończ program");

        while (programRunning) {

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    menuService.showOsoby(developer1);
                    break;
                case 2:
                    // Implementacja wyświetlania danych osoby
                    break;
                case 3:
                    // Implementacja wyświetlania wolnych pomieszczeń
                    break;
                case 4:
                    // Implementacja wynajmowania mieszkania
                    break;
                case 5:
                    // Implementacja wyświetlania zawartości mieszkania
                    break;
                case 6:
                    // Implementacja wkładania przedmiotu lub pojazdu
                    break;
                case 7:
                    // Implementacja wyjmowania przedmiotu lub pojazdu
                    break;
                case 8:
                    // Implementacja zapisywania stanu osiedla do pliku
                    break;
                case 9:
                    programRunning = false;
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }

        System.out.println("Program zakończony");
    }
}
