public class replace_occ {
    static int count(String str ,char a){
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        if (str.charAt(0) == a) {
            count++;
        }
        return count + count(str.substring(1), a);
    }
    public static void main(String[] args) {
        String s="compare to string";
        s=s.replaceAll(" ","");
        int n= s.length();
        for (int i = 0; i < n; i++) {
            char c= s.charAt(i);
            int count= count(s,c);

            System.out.print(count);

         }


    }
}
