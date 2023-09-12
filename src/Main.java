import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programRunning = true;

        while(programRunning){
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
        }

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                // Implementacja wyboru osoby
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

        System.out.println("Program zakończony");
    }
}
