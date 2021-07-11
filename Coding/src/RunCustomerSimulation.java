public class RunCustomerSimulation {
    /*
     * https://www.geeksforgeeks.org/function-to-find-number-of-customers-who-could-
     * not-get-a-computer/
     */
    public static void main(String[] args) {
        System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ".toCharArray()));
        System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE".toCharArray()));
        System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE".toCharArray()));
        System.out.println(runCustomerSimulation(1, "ABCBCA".toCharArray()));
        System.out.println(runCustomerSimulation(1, "ABCBCADEED".toCharArray()));
    }

    private static int runCustomerSimulation(int n, char[] charArray) {
        int result = 0;
        // ABBAJJKZKZ
        int totalCapacity = n;
        int initCapacity = 0;

        int[] hash = new int[26];
        int i = 0;
        while (i < charArray.length) {
            int index = charArray[i] - 'A';
            if (hash[index] == 0) {
                hash[index]=1;
                if(initCapacity<totalCapacity)
                {
                    initCapacity++;
                    hash[index]=2;
                }else
                {
                    result++;
                }
            }else
            {
                if(hash[index]==2)
                    initCapacity--;
                hash[index]=0;
            }
            i++;
        }
        return result;
    }
}
