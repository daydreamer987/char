import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter an alphabet character: ");
        char ch = sc.next();
        if ((ch >= 'a' && ch <= 'z')) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("It is a vowel.");
                    break;
                default:
                    System.out.println("It is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }

        sc.close();
    }
}