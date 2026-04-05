/*
Four types of Methods :

    1. void function without parameterized
    2. void function with parameterized
    3. non-void function without parameterized
    4. non-void function with parameterized

*/ 

public class Methods {
    public static void main(String[] args) {
        // add(); //1
        //add(10,10); //2
        //System.out.println(add()); //3
        System.out.println(add(10,10)); //4

    }
    //void function without parameterized

    /*public static void add(){
        int a = 10, b = 10;
        int c = a + b;
        System.out.print(c);
    }*/

    //void function with parameterized

    /*public static void add(int a, int b){
        int c = a + b;
        System.out.print(c);
    }*/

    //non-void function without parameterized

    /*public static int add(){
        int a = 10, b = 10;
        int c = a+b;
        return c;
    }*/

    //non-void function with parameterized

    public static int add(int a, int b){
        int c = a + b;
        return c;
    }
}