package Contest1;

import java.util.*;

public class C_Marenol_hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        int[] results = new int[t]; // store answers for each test case

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            // Count 1s
            int countA1 = 0, countB1 = 0;
            for (char ch : a.toCharArray())
                if (ch == '1')
                    countA1++;
            for (char ch : b.toCharArray())
                if (ch == '1')
                    countB1++;

            if (countA1 != countB1) {
                results[i] = -1;
                continue;
            }

            // Collect positions of 1s
            List<Integer> posA = new ArrayList<>();
            List<Integer> posB = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (a.charAt(j) == '1')
                    posA.add(j);
                if (b.charAt(j) == '1')
                    posB.add(j);
            }

            // Compute maximum difference
            int ops = 0;
            for (int j = 0; j < posA.size(); j++) {
                ops = Math.max(ops, Math.abs(posA.get(j) - posB.get(j)));
            }
            results[i] = ops;
        }

        // Print results
        for (int res : results) {
            System.out.println(res);
        }

        sc.close();
    }
}
