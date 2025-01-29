import java.util.Scanner;

public class ExtendedEuclidean {

    public static int[] findGCD(int a, int b) {
        if (b == 0) {
            return new int[]{a, 1, 0};
        }

        int[] values = findGCD(b, a % b);
        int gcd = values[0];
        int x = values[2];
        int y = values[1] - (a / b) * values[2];

        return new int[]{gcd, x, y};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int[] result = findGCD(a, b);
        System.out.println("GCD: " + result[0]);
        System.out.println("x: " + result[1] + ", y: " + result[2]);
        System.out.println("Verification: " + (a * result[1] + b * result[2]));

        scanner.close();
    }

/*OUTPUT*/
Enter first number: 30
Enter second number: 12
GCD: 6
x: -1, y: 3
Verification: 6
