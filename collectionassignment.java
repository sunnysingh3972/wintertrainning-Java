import java.util.ArrayList;

public class collectionassignment {
    int count=0;
    static void push(ArrayList<Integer> l1,int k)
    {
        l1.add(k);

    }
    static int pop(ArrayList<Integer> l1)
    {
        int i=l1.size()-1;
        int ans;
        if(l1.size()!=0)
        {
             ans=l1.get(i);
            l1.remove(i);
          return ans;
        }
        return -1;
    }
    static boolean isEmpty(ArrayList<Integer> l1)
    {
        if(l1.size()==0)
        return true;
        else
        return false;
    }
    static boolean isFull(ArrayList<Integer> l1,int size)
    {
        if(size==l1.size())
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        push(l1,1);
        int j=pop(l1);
        System.out.println(j);
        System.out.println(isEmpty(l1));
        System.out.println(isFull(l1, 1));


    }
}
