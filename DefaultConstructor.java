//default constructor

class Sample{
    String name;
    int no;

    public void display(){
        System.out.println(name);
        System.out.println(no);
    }

    public void setValues(String user, int num){
        name = user;
        no = num;
    }

    public String getValue(){
        return name;
    }
}


public class DefaultConstructor {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.display();
    }
}
