import java.util.*;
public class solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int a[] = new int[b];
        int count=0;
        int m,n,sum = 0;
        for(m=0;m<b;m++)
        {
            a[m] = scan.nextInt();
        }
        scan.close();
        for(m=0;m<b;m++)
        {
            sum = 0;
            for(n=m;n<b;n++)
            {
                sum = a[n] + sum;
                if(sum<0){count++;}
            }
        }
        System.out.println(count);
    }
}


