import java.util.InputMismatchException;
import java.util.Scanner;
public class ScannerException {
    public static int[] input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("enter positive integers only!!");
        }

        int arr[] = new int[n];
        System.out.println("enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    }

