public class day3 {
    static void permute(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
	public static void main(String[] args) {
	    String firstname="Sunny";
	    String lastname="Singh";
	    String fullname=firstname+lastname;
	    System.out.println(fullname);
	for(int i=0;i<fullname.length();i++)
	{
	    System.out.print(fullname.charAt(i)+" ");
	}
	String s1=new String("hello");
	String s2=new String("bello");
	System.out.println(s1.compareTo(s2));
	String s3="compare to string";
	String[] a = s3.split(" ");
	for(int i=a.length-1;i>=0;i--)
	{
	    System.out.println(a[i]);
	}
	String s4=s3.substring(8,10);
	System.out.println(s4);
	System.out.println(firstname.compareTo(lastname));
	System.out.println(firstname==lastname);
	String ans="";
	for(int i=0;i<s1.length();i++)
	{
	    char c=s1.charAt(i);
	    if(ans.indexOf(c)<0)
	    {
	        ans+=c;
	    }
	}
	System.out.println(ans);
	
	//wap to reverse the string....
	//wap to remove duplicate elememnt
	//wap to longest substring with nonrepeating element...
	
	}
}


