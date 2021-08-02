import java.util.Scanner;

public class LargestDigit {
    public static void main(String args[]){
        int max,i,n;
        int a[];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n Numbers : ");
        n = sc.nextInt();

        a = new int[n];

        System.out.print("Enter the Numbers : ");
        for(i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        max = max_num(a,n);
        System.out.println("The Large Number is : "+max);
        sc.close();
    }

    static int max_num(int[] a, int n){
        int i;
        int m =0;

        for (i=0;i<n;i++)
        {
            if(a[i]>m){
                m = a[i];
            }
        }return m;

    } 
}
