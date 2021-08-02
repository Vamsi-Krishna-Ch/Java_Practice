
class Test{
    int class_var1 = 10;
        float class_float = 20.5f;

        void method(){
            int method_var = 30;
            float method_float = (float) 40.5;

            System.out.println("class_var1 "+class_var1);
            System.out.println("class_float "+class_float);
            System.out.println("method_var "+method_var);
            System.out.println("method_float "+method_float);
        }
}


public class Class_Demo{
    public static void main (String args[]){
        Test t = new Test();
        t.method();
    }
    
}