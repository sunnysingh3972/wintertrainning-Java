import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//WAP to sorting string without using string Methods...
public class assignq1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the string which you ");
        String s=sc.next();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
    {
        char ch=s.charAt(i);
        for(int j=0;j<c.length;j++)
        {
            if(c[i]<c[j])
            {
                char temp=c[j];
                c[j]=c[i];
                c[i]=temp;
            }
        }

    }
    String ans="";
    for(int i=0;i<c.length;i++)
    {
        ans+=c[i];
    }
    System.out.println("Sorted string : "+ans);
    }
    catch(InputMismatchException e)
    {
        System.out.println("Inavli input");
    }
    catch(NumberFormatException e)
    {
        System.out.println("wrong input");
    }
}
}

//count the no vowels and constant in string the string can contain 