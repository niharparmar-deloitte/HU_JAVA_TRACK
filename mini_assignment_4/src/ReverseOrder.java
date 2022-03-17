import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseOrder {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String m;
            Integer n = sc.nextInt();
            ArrayList al = new ArrayList();
            for(int i=0; i<n+1; i++)
            {
                m = sc.nextLine();
                al.add(m);
            }
            Collections.reverse(al);
            System.out.println(al);
        }
    }

