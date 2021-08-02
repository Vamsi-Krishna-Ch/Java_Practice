import java.io.*;

public class Array2D 
{
    public static void main(String args[])
    {
        DataInputStream input = new DataInputStream(System.in);
        int arr[][] = new int[3][3];
       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                try{
                    arr[i][j]=Integer.parseInt(input.readLine());
                }
                catch(Exception e){}
            }//end of inner loop
        }//end of outer loop

        System.out.println("Array is : \n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                System.out.println("Value at arr["+i+"]["+j+"] is : "+arr[i][j]);
            }
        }
    }
}
