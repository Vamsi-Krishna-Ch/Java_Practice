public class labelledLoop {
    public static void main(String args[]){
        Outer_Loop: for (int i =1;i <=3;i++){
            inner_Loop : for(int j=1;j<=3;j++){
                if (i==2 && j==2){
                    System.out.println("If i=2 & j=2 Continue Execution of Outer Loop");
                    continue Outer_Loop;
                }
                System.out.println("Value of i : "+i+" & value of j : "+j);
            }
        }
    }
}
