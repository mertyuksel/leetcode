import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    public static boolean isAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        for (int i = 0; i < t.length(); i++)
        {
            if (map.containsKey(t.charAt(i)))
            {
                if (map.get(t.charAt(i)) > 1){
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                }
                else
                    map.remove(t.charAt(i));
            }
            else
                return false;
        }

        return map.isEmpty();
    }
}