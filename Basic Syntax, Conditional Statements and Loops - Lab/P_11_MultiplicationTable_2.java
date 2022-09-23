import java.util.Scanner;

public class P_11_MultiplicationTable_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n" , digit, times, digit * times);
            times++;
        }while (times <= 10);
    }
}
