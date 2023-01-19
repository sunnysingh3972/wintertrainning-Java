import java.util.InputMismatchException;
import java.util.Scanner;

//package Trainning.JAVA;

public class assignmntq6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
System.out.println("Enter the String : ");
String str=sc.next();
System.out.println("Enter the starting indices which you want to slice :");
int n1=sc.nextInt();
System.out.println("Enter the last indices which you want to slice :");
int n2=sc.nextInt();
System.out.println("Sliced String : "+str.substring(n1, n2));
        }
        catch(InputMismatchException e)
        {
System.out.println("Opps! You enter wrong");
        }
    }
}
