import java.util.Scanner;

public class While_Loop {
    public static void main(String args[]){
        int i = 0;
        Scanner sc = new Scanner (System.in);

        while(i!=1){
            System.out.println("Your in while loop.");
            System.out.println("Press 1 to Exit.");
            i = sc.nextInt();
        }
        System.out.println("Your out of while loop.");
        sc.close();
    }   
    
}
