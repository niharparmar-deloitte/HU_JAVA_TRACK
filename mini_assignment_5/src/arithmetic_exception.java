public class arithmetic_exception {

    public static void main(String[] args) {
        try{
            int n1=15,n2=0;
            int result = n1/n2;
            System.out.println(result);
        }
        catch (ArithmeticException ae){
            System.out.println("Catch Block Executed");
        }
        finally {
            System.out.println("Thank you");
        }
    }
}
