import java.util.Scanner;

public class Scanner_Demo {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Name");
        String Name = sc.nextLine();

        System.out.println("Enter Sem");
        int Sem = sc.nextInt();

        System.out.println("Enter CGPA");
        float CGPA = sc.nextFloat();

        System.out.println("Name : "+ Name);
        System.out.println("Sem : "+ Sem);
        System.out.println("CGPA : "+ CGPA);

        sc.close();
    }
}
