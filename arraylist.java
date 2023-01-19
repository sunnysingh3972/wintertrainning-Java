import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arylist= new ArrayList<>();
        LinkedList<Integer> lnklist= new LinkedList<>();
//        arylist.add(3);
//        arylist.add(4);
//        arylist.add(5);
//        arylist.add(6);
//
//        lnklist.add(10);
//        lnklist.add(11);
//        lnklist.add(12);
//        lnklist.add(13);

//        for (int i = 0; i <arylist.size() ; i++) {
//            System.out.print(arylist.get(i)+" ");
//        }
//        System.out.println();
//        for (int i:arylist) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        Iterator<Integer> itr= arylist.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }

        System.out.println("arraylist");
        doTimings("ArrayList", arylist);
        System.out.println("linkedlist");
        doTimings("LinkedList", lnklist);


    }
    public static void doTimings(String type, List<Integer> list){
        for (int i = 0; i < 1E5; i++) {
            list.add(i);

        }
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1E5; i++) {
            list.add(i);

        }

        long end= System.currentTimeMillis();
        System.out.println("time taken for "+type+" " +(end-start));
    }
}
