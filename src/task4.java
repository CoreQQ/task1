import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scn.nextInt();
        System.out.print("Enter number of apples: ");
        int apples = scn.nextInt();
        int remainder = apples % students;
        System.out.printf("Remaining apples in bucket: %d", remainder);
    }
}