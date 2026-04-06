interface Father{
    abstract void call(); //should override further
}

interface Mother {
    abstract void talk(); //should override further
}

class Daughter implements Father, Mother {
    @Override
    public void call() { //should public 
        System.out.println("Calling");
    }
    @Override
    public void talk() {
        System.out.println("Talking");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.call();
        d.talk();
    }
}
