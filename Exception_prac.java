


public class Exception_prac {


    public Exception_prac(String s) {
    }

    public static void main(String[] args) {
//        doStuff();
//        Exception obj= new Exception();
//        try{
//            System.out.println(obj.divideNum(44,0));
//
//        }catch (ArithmeticException e){
//            System.out.println("number cannot be divided by 0");
//        }
//        System.out.println("rest code");
//        throw new ArithmeticException("/ by 0 not possible");

    }
//    public static void doStuff() throws InterruptedException {
//        domorestuff();
//    }
//    public static void domorestuff() throws InterruptedException {
//        Thread.sleep(1000);

//    }




    public static int divideNum(int m,int n) throws ArithmeticException{
        int div= m/n;
        return div;
    }


}
