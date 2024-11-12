import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner namn = new Scanner(System.in);

        String Password = namn.nextLine();
        while (!Password.equals("12345")) {
            System.out.println("Sriv ditt lösenord: ");
            Password = namn.nextLine();

        }

        // int Tal= 0;
        // while (Tal < 32) {
        // System.out.println("hello, world");
        // Tal++;

        // }

        // System.out.println("Skriv ditt användernamn: ");
        // String användernamn = namn.nextLine();
        // System.out.println("Skriv ditt lösenord: ");
        // String Lösen = namn.nextLine();

        // if (användernamn.equals("kalleanka") && Lösen.equals("12345")) {
        // System.out.println("welcome");
        // }
        // if (6 >= 3) {

        // System.out.println("Hello, World!")

    }
}
// }
