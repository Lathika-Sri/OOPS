class Father{
    void house(){
        System.out.println("2BHK");
    }
}
class Daughter extends Father{
    @Override //method overriding : manipulating the member of a class while inherited
    void house(){
        System.out.println("2BHK -> 3BHK");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Father f = new Father();
        f.house();
        System.out.println();
        Daughter d = new Daughter();
        d.house();
    }
}
