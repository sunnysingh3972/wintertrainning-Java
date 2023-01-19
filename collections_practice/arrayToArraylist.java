package collections_practice;

import java.util.*;

public class arrayToArraylist {
    public static void main(String[] args) {
        System.out.println("Array to Arraylist");
        int arr[]= {1,2,3,4,5,6};
        List<Integer> al= new ArrayList<>();
        for (int i:arr ) {
            al.add(i);
        }
        System.out.println(al);

        System.out.println("Arraylist to Array");

        List<Integer> list= new ArrayList<>();
        list.add(13);
        list.add(15);
        list.add(14);
        list.add(20);
        list.add(30);

        int []ary= new int[list.size()];
        for (int i = 0; i < ary.length; i++) {
            ary[i]=list.get(i);
        }
        for (int n:ary ) {
            System.out.print(n+" ");
        }
    }
}
