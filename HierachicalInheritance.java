class Parent {
    void care() {
        System.out.println("Message from parents : Mom and Dad");
    }
}
class ElderSister extends Parent {
    void display() {
        super.care();
        System.out.println("Message from Elder Sister");
    }
}
class YoungerSister extends Parent {
    void display() {
        super.care();
        System.out.println("Message from Younger Sister");
    }
}

public class HierachicalInheritance {
    public static void main(String[] args) {
        ElderSister e = new ElderSister();
        e.display();

        YoungerSister y = new YoungerSister();
        y.display();
    }
}
