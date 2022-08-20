import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        double sum = Math.pow(firstNumber, 2) + Math.pow(secondNumber, 2);
        System.out.println(String.format("%.5f", Math.sqrt(sum)));
    }
}