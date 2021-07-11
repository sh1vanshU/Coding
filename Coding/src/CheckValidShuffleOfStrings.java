class CheckValidShuffleOfStrings {
    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = { "1XY2", "Y12X" };

        // call the method to check if result string is
        // shuffle of the string first and second
        for (String result : results) {
            if (shuffleCheck(first, second, result) == true) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            } else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }
    }

    private static boolean shuffleCheck(String first, String second, String result) {
        int rLen=result.length();
        int j=0,k=0;
        for(int i=0;i<rLen;i++)
        {
            if(j<first.length() && result.charAt(i)==first.charAt(j)){
                j++;
            }else  if(k<second.length() && result.charAt(i)==second.charAt(k))
            {
                k++;
            }
        }
        if(j==first.length() && k==second.length())
            return true;
        return false;
    }
}