import java.util.Scanner;

public class printSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        int s= sc.nextInt();
        int e= sc.nextInt();
        System.out.println(str.substring(s,e));
    }
}
