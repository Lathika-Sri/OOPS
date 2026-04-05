class ApplicationForm{
    String name;
    int no;

    public void display(){
        System.out.println(name);
        System.out.println(no);
    }


    //using parameterized function - This helps when input is get from user

    public void setValues(String user, int num){
        name = user;
        no = num;
    }
}



/*
    Access Modifiers :

    We can see the different types of access modifier related to this file:
        1. private - private String name (we can't able to use on main class as student1.name)
        2. public - public String name, public int no (we can access on same package, same class, sub class with different package and other classes also)
        3. protected - protected String name : (similar to public but (we can access only on same package, same class, sub class with different package))
        4. default - String name (similar to public but we can access only on same package, same class)

*/
public class BasicExampleofApplicationForm {
    public static void main(String[] args) {
        
        ApplicationForm student1 = new ApplicationForm();
        student1.setValues("lathika", 63);
        student1.display();

    }
}
