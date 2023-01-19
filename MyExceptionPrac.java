public class MyExceptionPrac extends Exception {
    MyExceptionPrac(){}
     MyExceptionPrac(String msg){

        super(msg+ "please contact admin");
    }

}
