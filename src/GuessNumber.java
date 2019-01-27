import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoise;
        boolean isBingo = false;

        while (!isBingo){
            System.out.println("Zgadnij liczbę całkowitą.");
            userChoise = input.nextInt();
            if (userChoise < 100) {
                System.out.println("Podana liczba jest za mała.");
            } else if (userChoise > 200) {
                System.out.println("Podana liczba jest za duża.");
            } else {
                if (userChoise % 3 == 0) {
                    System.out.println("Bingo! zgadłeś liczbę");
                    isBingo = true;
                } else {
                    System.out.println("Podana liczba nie dzieli się przez 3.");
                }
            }
        }
        input.close();
    }
}