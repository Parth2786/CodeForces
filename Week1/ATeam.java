package Week1;
import java.util.*;
public class ATeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] question = new int[n][3];
        for (int i = 0; i < question.length; i++) {
            for (int j = 0; j < question[0].length; j++) {
                question[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < question.length; i++) {
            int sum = question[i][0] + question[i][1] + question[i][2];
            if (sum >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
