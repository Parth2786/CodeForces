package Contest1;
import java.util.*;
public class Whiphlash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] result = new String[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a1 = new int[n];
            for (int j = 0; j < n; j++) {
                a1[j] = sc.nextInt();
            }
            int[] b1 = new int[n];
            for (int k = 0; k < n; k++) {
                b1[k] = sc.nextInt();
            }
            for (int j = 0; j < b1.length; j++) {
                for (int j2 = 0; j2 < b1.length; j2++) {
                    if (a1[j] == b1[j2]) {
                        result[i] = "YES";
                    }
                    else{
                        result[i] = "NO";
                    }
                }
            }            

        }
        for (String str : result) {
            System.out.println(str);
        }
    }
}
