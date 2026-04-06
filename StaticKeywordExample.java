class Computer {
    static void print() {
        System.out.println("Calling");
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        Computer.print(); //no need to create object because of static keyword
    }
}
