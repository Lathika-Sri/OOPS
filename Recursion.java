import java.util.*;
public class Recursion{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //sum of natural numbers
        int n = s.nextInt();
        System.out.println("answer:"+ sum(n));

        s.close();
    }
}