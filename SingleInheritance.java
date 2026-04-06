class Parent {
    void property() {
        System.out.println("Properties have car and 3bhk house with love and care");
    }
}
class Daughter extends Parent{
    void display(){
        System.out.println("So lucky to have such a lovable parents - by daughter");
        super.property(); // super keyword
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.property();
        Daughter d = new Daughter();
        d.display();
    }
}
