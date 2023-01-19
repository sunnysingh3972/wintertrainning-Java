import java.util.InputMismatchException;
import java.util.Scanner;

public class assignmentq5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        String s[]=new String[3];
        int []a=new int[3];
        for(int i=0;i<3;i++)
        {
            String str=sc.next();
            s[i]=str;
            int j=sc.nextInt();
            a[i]=j;
            

        }
        System.out.println("--------------------------------------------------------------------------------------");
        
        for(int i=0;i<3;i++)
        {
            System.out.println(s[i]+"           "+a[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
    catch(InputMismatchException e)
    {
        System.out.println("oops! Enter wrong ");
    }
    catch(NumberFormatException e)
    {
        System.out.println("oops! Enter wrong format ");
    }
      
    }
}
