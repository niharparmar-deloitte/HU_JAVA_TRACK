import java.io.*;
import java.util.Scanner;
public class student_data {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("C:\\Users\\pyogeshbhai\\Documents\\StudentData.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            System.out.print(sc.next());
        }
        sc.close();
    }
}