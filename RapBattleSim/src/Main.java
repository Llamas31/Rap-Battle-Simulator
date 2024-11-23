import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("!RAP BATTLE SIMULATOR!");

        Scanner init = new Scanner(System.in); // Reading from System.in
        System.out.println("some rando, \"You wanna go buddy!?\", WILL YOU ENGAGE; y/n: ");
        String x1 = init.next(); // Scans the next token of the input as a variable
        if (x1.equals("y")) {
            Scanner second = new Scanner(System.in); // Reading from System.in
            System.out.println("WHAT IS YOUR OPENING BAR?(make it like... a 6/10): ");
            String x2 = second.next();
            System.out.println("rando: yeah...well...i eat losers like you for breakfast!");
            Scanner third = new Scanner(System.in);
            System.out.println("WHAT IS YOUR REBUTTAL?(make it epic this time): ");
            String x3 = third.next();
            System.out.println("YOU DID 10,000 DAMAGE! YOU WIN!");



        }
    else {
            System.out.println("ur boring and u suck at rap");
        }
    }
}