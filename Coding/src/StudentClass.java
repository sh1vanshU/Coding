import java.util.HashMap;
import java.util.Map;

public final class StudentClass{
    private final String name;
    private final int regNo;
    private final Map<String,String> metaData;
    
    public StudentClass(String name,int regNo, Map<String,String> metaData){
        this.name=name;
        this.regNo=regNo;
        Map<String,String> temp=new HashMap<>();
        for(String str:metaData.keySet())
        {
            temp.put(str,metaData.get(str));
        }
        this.metaData=temp;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetaData() {
        Map<String,String> mapNew=new HashMap<>();
        for(String key:metaData.keySet())
        {
            mapNew.put(key,metaData.get(key));
        }
        return mapNew;
    }
    

}