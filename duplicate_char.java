import java.util.Arrays;

public class duplicate_char {
    public static void main(String[] args) {
    String s= "compare to string";
    char arr[]= s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
           int count=1;
            for (int j = i+1; j <s.length() ; j++) {
                if(arr[j]==arr[i]){

                    count++;
                }
            }
            if(count>1){
                System.out.println(arr[i]);
            }
        }


    }
}
