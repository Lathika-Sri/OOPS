class Father {
     void display() {
        System.out.println("Msg from father");
    }
}
class Daughter extends Father {
    @Override
     void display() {
        System.out.println("Msg from daughter");
    }
}
class Son extends Father {
    @Override
     void display() {
        System.out.println("Msg from son");
    }
}
class GrandDaughter extends Daughter {
    @Override
     void display() {
        System.out.println("Msg from granddaughter");
    }
}
 // here father - > daughter, son : Hierarchical Inheritance and
 // granddaughter  -> daughter Single Inheritance
public class HybridInheritance {
    public static void main(String[] args) {
        Father f = new Father();
        f.display();

        Daughter d = new Daughter();
        d.display();

        Son s = new Son();
        s.display();

        GrandDaughter gd = new GrandDaughter();
        gd.display();
    }
}
