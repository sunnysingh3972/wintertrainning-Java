public class count_alpha {
    public static void main(String[] args) {
        String s="aeb@ikou*#";
        int count=0;
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {

        }
    }
}
