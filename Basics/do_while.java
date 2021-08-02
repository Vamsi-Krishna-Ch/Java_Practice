import java.util.Scanner;

public class do_while {
    public static void main (String args[]){
        int i = 0;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("In loop");
            i = sc.nextInt();
        }while(i!=1);
        System.out.println("Out of Loop");
        sc.close();
    }
}
