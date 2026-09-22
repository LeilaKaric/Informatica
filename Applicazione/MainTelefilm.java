package Applicazione;

public class MainTelefilm {
    public static void main(String[] args) {
        CollezioneTelefilm collezione = new CollezioneTelefilm();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del telefilm: ");
        String nomeTelefilm = scanner.nextLine();

        System.out.print("Inserisci il genere del telefilm: ");
        String genereTelefilm = scanner.nextLine();

        System.out.print("Il telefilm è in produzione? (true/false): ");
        boolean produzione = scanner.nextBoolean();

        System.out.print("Inserisci il numero di stagioni: ");
        int numStagioni = scanner.nextInt();

        
    }
}
