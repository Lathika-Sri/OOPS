//parameterized constructor

class Sample{

    String name;
    int no;

    Sample(String user,int num){

        name = user;
        no = num;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Sample obj = new Sample("Lathika",63);
        System.out.println(obj.name);
        System.out.println(obj.no);
        String str = obj.name + " Sri";
        System.out.println(str);
    }
}
