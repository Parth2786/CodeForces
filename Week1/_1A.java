package Week1;
import java.util.*;
public class _1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long rows = (n + a - 1) / a;
        long cols = (m + a - 1) / a;
        long flagstones = rows * cols;
        System.out.println(flagstones);
    }
}
