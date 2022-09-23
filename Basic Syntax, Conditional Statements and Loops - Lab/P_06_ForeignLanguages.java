import java.util.Scanner;

public class P_06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String countryName = scanner.nextLine();

        switch (countryName){
            //England and USA
            case "England":
            case "USA":
                System.out.println("English");
                break;
                //Spanish is spoken in Spain, Argentina, and Mexico
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
