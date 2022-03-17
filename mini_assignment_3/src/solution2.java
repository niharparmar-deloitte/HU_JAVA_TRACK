public class solution2 {

    public static boolean validShuffle(String first, String second, String result) {
        if(first.length()+second.length()!=result.length()){
            return false;
        }
        int i=0,j=0,k=0;
        while(k!=result.length()){
            if (i<first.length() && first.charAt(i) == result.charAt(k))
                i++;


            else if (j<second.length() && second.charAt(j) == result.charAt(k))
                j++;


            else {
                return false;
            }
            k++;
        }
        return i>=first.length() && j>=second.length();
    }

    public static void main(String[] args) {
        String first = "gid";
        String second = "Hash";
        String[] results ={"Hgaidhs","Hgasidh"};

        for( String result : results){
            if(validShuffle(first,second,result)){
                System.out.println(result + " is Valid Shuffle");
            }
            else {
                System.out.println(result + " is Invalid Shuffle");
            }
        }
    }
}
