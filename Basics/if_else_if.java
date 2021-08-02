import java.util.Scanner;

public class if_else_if {
    public static void main (String args[]){
        // int amount = Integer.parseInt(args[0]); <<<<<<This meyhod is not working so using Scanner.

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        sc.close();

        if ( amount >=1000){
            amount = amount - 200;
        }else if (amount >= 500){
            amount = amount-100;
        }else if( amount >= 100){
            amount = amount - 50;
        }else{
            System.out.println("No Discount");
        }
        
        System.out.println("amount : "+amount);
    }
}
