package Contest1;


import java.util.*;
public class A_Riptide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] round = new int[t];
        for (int i = 0; i < t; i++) {
            int rounds = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            while (!(a == b || b == c || c == a)) {
                if (a > b && a > c) {
                    if (b < c) {
                        a--;
                        b++;
                    }
                    else{
                        a--;
                        c++;
                    }
                }
                else if (b > a && b > c) {
                    if (a < c) {
                        b--;
                        a++;
                    }
                    else{
                        b--;
                        c++;
                    }
                }
                else{
                    if (a < b) {
                        c--;
                        a++;
                    }
                    else{
                        c--;
                        b++;
                    }
                }
                rounds++;
            }
            round[i] = rounds;
            
        }
        for (int i = 0; i < round.length; i++) {
            System.out.println(round[i]);
        }
    }
}
