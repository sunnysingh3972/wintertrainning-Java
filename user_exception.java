
public class user_exception {
    public static void main(String[] args) {
        try{
            int age=9;
            if(age<18){
            throw new MyExceptionPrac("age too small");
            }
        }
        catch (MyExceptionPrac e){
            System.out.println(e.getMessage());
        }
    }
}
