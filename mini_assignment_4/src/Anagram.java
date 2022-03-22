import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String s2 = sc.nextLine();

        if (s1.length() == s2.length()){
            char[] cArr1 = s1.toCharArray();
            char[] cArr2 = s2.toCharArray();

            Arrays.sort(cArr1);
            Arrays.sort(cArr2);

            boolean answer = Arrays.equals(cArr1,cArr2);

            if(answer) {
                System.out.println(s1 + " and " + s2 + " Are Anagrams");
            }
            else {
                System.out.println(s1 + " and " + s2 + " Are Not Anagrams");
            }
        }
        else {
            System.out.println("Length of the two string are not same, so they are not anagrams");
        }
        sc.close();
    }
}
