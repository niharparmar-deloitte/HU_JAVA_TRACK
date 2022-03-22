import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows you want to print: ");

        int rows = sc.nextInt();
        System.out.print("Printing the pattern... ");
        for (int i=1; i<=rows; i++) {
            for (int j=i; j<rows; j++) {
                System.out.print(" ");
            }

            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=rows;i>=1;i--){
            for(int j=i;j<=rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
