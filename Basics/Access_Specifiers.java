/*Only one is working. maybe IDE issue. */

class demo{
    public int a=10;

    int b=20;  //default access specifier.

    private int c = 30;

    public void method1(){
        System.out.println("Public method");
    }

    private void method2(){
        System.out.println("Private method");
    }
}

class Access_Specifiers {
public static void main(String args[]){
    demo obj = new demo();
    //obj.a;
    //obj.b;
    //obj.c;
    obj.method1();
    //obj.method2();
}    
}
