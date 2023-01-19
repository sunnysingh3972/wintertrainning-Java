public class string {
    public static void main(String[] args) {
//        String FirstName="Manju";
//        String LastName="Bhardwaj";
//        String FullName= FirstName+ LastName;
//        System.out.println(FullName);
//        int n=FullName.length();
//        to print string
//        for (int i = 0; i < n; i++) {
//            System.out.println(FullName.charAt(i));
//
//        }

        //comparison
        String s1= "hello"; //string as literal
        String s2= "Hello";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1==s2);
        String s= new String("anju"); //string as object
        String ss= new String("anju");
        System.out.println(s.compareTo(ss));

        String a="compare to string";
        System.out.println(a.substring(8,10));
        a=a.replaceAll(" ","");
        System.out.println(a);


    }
}
