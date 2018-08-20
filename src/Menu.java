import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        boolean isCorrect = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz opcję spośród dostępnych poniżej: ");
        System.out.println("PRYWATNE / FIRMOWE / KONSULTANT / KONIEC");
        String userInput = scan.nextLine();
        userInput = userInput.toUpperCase();

        while (!isCorrect)
            try {
                Options option = Options.valueOf(userInput);
                System.out.println("Wybrano opcję " + option);
                isCorrect = true;
            } catch (IllegalArgumentException ex) {
                System.err.println("Podano nieprawidłową opcję!");
                System.err.println("Spróbuj jeszcze raz");
                userInput = scan.nextLine();
                userInput = userInput.toUpperCase();
            }
    }
}