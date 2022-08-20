import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scn.nextInt();
        System.out.print("Enter number of apples: ");
        int apples = scn.nextInt();
        int formula = apples / students;
        System.out.println("Every student will get: " + formula);
    }
}