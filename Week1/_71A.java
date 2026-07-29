package Week1;
import java.util.*;
public class _71A {

    // This is the question based on the a way too long in which we have to return string in such a way that if the length of the string is more than 10 characters than we have to write its 1st character and last character_ and in between these character_ we have to write the number of character that are in between these two 1st and last character.
    // example : localization
    // output must be : l10n. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= 10) {
                System.out.println(arr[i]);
            }
            else{
                char first = arr[i].charAt(0);
                char last = arr[i].charAt(arr[i].length() - 1);
                int middle = arr[i].length() - 2;
                System.out.println(""+first + middle + last);
            }
        }
        
    }
}
