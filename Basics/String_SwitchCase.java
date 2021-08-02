import java.util.Scanner;

public class String_SwitchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter No");
        String temp = sc.nextLine();
        String Country = temp.toLowerCase();
        sc.close();

        switch(Country)
        {
            case "india":
            {
                System.out.println("country No +91");
                break;
            }
            case "usa":
            {
                System.out.println("Entered No +1");
                break;
            }case "itly":
            {
                System.out.println("Entered No +39");
                break;
            }
            default:
            {
                System.out.println("Invalid.");
            }
        }
    }
}
