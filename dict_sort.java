public class dict_sort {
    public static void main(String[] args) {
        String names[] = {"Anju", "Manju", "Anshul"};
        int n=names.length;
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(names[i].compareTo(names[j])>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
            
        }
        for (String s: names) {
            System.out.print(s+" ");
        }
            
               
        

    }
}
