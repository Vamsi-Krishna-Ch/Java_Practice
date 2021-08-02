public class CommandLine_Args {
    public static void main(String user[]){
        int length = Integer.parseInt(user[0]);
        int height = Integer.parseInt(user[1]);
        int area = length * height /2;

        System.out.println("Area of a triangle is : "+area);
    }
}
// This Program is not working v.
