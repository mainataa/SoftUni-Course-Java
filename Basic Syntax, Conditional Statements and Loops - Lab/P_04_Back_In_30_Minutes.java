import java.util.Scanner;

public class P_04_Back_In_30_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int allMin = (hours * 60) + minutes + 30;

        int newH = allMin / 60;
        int newM = allMin % 60;
        if (newH > 23) {
            newH = 0;
        }
        System.out.printf("%d:%02d" , newH , newM);


    }
}
