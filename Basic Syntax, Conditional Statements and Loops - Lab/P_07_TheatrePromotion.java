import java.util.Scanner;

public class P_07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        boolean isValid = true;

        switch (day){
            case"Weekday":
                if (age >= 0 && age <= 18){
                    price = 12;
                } else if (age > 18 && age < 65) {
                    price = 18;
                }else if (age >= 65 && age <= 122) {
                    price = 12;
                }
                else {
                    isValid = false;
                }
                break;
            case"Weekend":
                if (age >= 0 && age <= 18){
                    price = 15;
                } else if (age > 18 && age < 65) {
                    price = 20;
                }else if (age >= 65 && age <= 122) {
                    price = 15;
                }else {
                    isValid = false;
                }
                break;
            case"Holiday":
                if (age >= 0 && age <= 18){
                    price = 5;
                } else if (age > 18 && age < 65) {
                    price = 12;
                }else if (age >= 65 && age <= 122) {
                    price = 10;
                }else {
                    isValid = false;
                }
                break;
        }
        if (!isValid) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }

    }
}
