package Contest1;

import java.util.*;

public class C_Marenol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // number of test cases
        String[] results = new String[t]; // store answers for each test case
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            
            // Count 0s and 1s in both strings
            int countA0 = 0, countA1 = 0;
            int countB0 = 0, countB1 = 0;
            
            for (char ch : a.toCharArray()) {
                if (ch == '0') countA0++;
                else countA1++;
            }
            for (char ch : b.toCharArray()) {
                if (ch == '0') countB0++;
                else countB1++;
            }
            
            // Check if counts match
            if (countA0 == countB0 && countA1 == countB1) {
                results[i] = "YES";
            } else {
                results[i] = "NO";
            }
        }
        for (String res : results) {
            System.out.println(res);
        }
    }
}
