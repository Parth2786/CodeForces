package Week1;

import java.util.Scanner;

public class _4A_watermelon {


    // In this question we have to check whether the weight of the watermelon can be divides into two equal weight between two freinds such that both of them will get equal amount of watermelon in weight.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
