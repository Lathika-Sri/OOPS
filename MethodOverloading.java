//Method overloading same function/method name with different arguments

class Operation1 {
    void min(int a,int b){
        if(a < b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    void min(int a, int b, int c) {
        if(a < b && a < c){
            System.out.println(a);
        }
        else if(b < a && b < c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Operation1 o = new Operation1();
        o.min(5,6);
        o.min(2,1,3);
    }
}
