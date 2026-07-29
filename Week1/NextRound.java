package Week1;

import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int cutoff = arr[k - 1];
            if (arr[i] >= cutoff) {
                count++;
            }
        }
        System.out.println(count);
    }
}
