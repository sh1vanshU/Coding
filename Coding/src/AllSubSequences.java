import java.util.HashSet;

public class AllSubSequences {
    static HashSet<String> list=new HashSet<>();
    public static void main(String[] args) {
        String str="abc";
        AllSubsequencesOfString(str);
        System.out.println(list);
    }
    private static void AllSubsequencesOfString(String str) {
        for(int i=0;i<str.length();i++)
        {
            for(int j=str.length();j>i;j--)
            {
                String sub_str=str.substring(i, j);
                if(!list.contains(sub_str))
                    list.add(sub_str);

                for(int k=1;k<sub_str.length()-1;k++)
                {
                    StringBuilder sb=new StringBuilder(sub_str);
                    sb.deleteCharAt(k);
                    if(!list.contains(sb.toString()))
                        AllSubsequencesOfString(sb.toString());
                }
            }
        }
    }
}
