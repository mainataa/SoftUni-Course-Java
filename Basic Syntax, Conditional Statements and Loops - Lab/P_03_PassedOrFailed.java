import java.util.Scanner;

public class P_03_PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        if (grade < 3) {
            System.out.println("Failed!");
        }else {
            System.out.println("Passed!");
        }
    }
}
