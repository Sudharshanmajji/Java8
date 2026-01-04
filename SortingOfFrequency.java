import java.util.List;
import java.util.*;

public class SortingOfFrequency
{
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "tree";
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> values = new ArrayList<>(map.entrySet());
        {
            values.sort((a,b)->b.getValue() - a.getValue());
        }
        StringBuilder sb1=new StringBuilder();
        for(Map.Entry<Character,Integer> map1:values)
        {
            char ch2=map1.getKey();
            int count1=map1.getValue();
            for(int i=0;i<count1;i++)
            {
                sb1.append(ch2);
            }
        }
        System.out.println(sb1.toString());
    }
}
