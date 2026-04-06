class Grandfather {
    void traits() {
        System.out.println("Elephant ear");
    }
}
class Father extends Grandfather{
    @Override
    void traits() {
        super.traits();
        System.out.println("Hair strong");
    } 
}
class Daughter extends Father {
    @Override
    void traits() {
        super.traits();
        System.out.println("Short eyes");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.traits();
    }
}
