import java.util.Scanner;

public class Switch_Case {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter No");
        int i = sc.nextInt();
        sc.close();

        switch(i)
        {
            case 1:
            {
                System.out.println("Entered No 1");
                break;
            }
            case 2:
            {
                System.out.println("Entered No 2");
                break;
            }case 3:
            {
                System.out.println("Entered No 3");
                break;
            }
            default:
            {
                System.out.println("Entered No not in Range.");
            }
        }
    }
}
