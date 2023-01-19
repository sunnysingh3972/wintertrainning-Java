// package Trainning.JAVA;

public class day1q3 {
    public static void main(String[] args) {
        String s="SunnSu12";
        int u=0;
        int l=0;
        int d=0;
        int o=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                u++;
            }
            else if(Character.isLowerCase(ch))
            {
                l++;
            }
            else if(Character.isDigit(ch))
            {
                d++;
            }
            else
            {
                o++;
            }
        }
        int total=u+l+d+o;
        System.out.println("total character "+total);
        System.out.println("Upper case : "+u+"\nLower Case : "+l+"\nDigit : "+d+"\nSpecial Character : "+o);
        System.out.println("Percentage: ");
        System.out.println("Upper case : "+(float)(u*100/total)+"\nLower Case : "+(float)(l*100/total)+"\nDigit : "+(float)(d*100/total)+"\nSpecial Character : "+(float)(o*100 /total));

    }
}
