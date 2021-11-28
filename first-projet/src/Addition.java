import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number one: ");
        int number1 = sc.nextInt();

        System.out.print("Number two: ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        System.out.println("Result: " + sum);
    }
}
