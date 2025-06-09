import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);

        if (gender == 'M'){
            System.out.println("Male");
        } else if (gender == 'F') {
            System.out.println("Female");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}