import java.util.HashMap;
import java.util.Map;

public class ValidAnagramRunner {
    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return  false;
        }
        Map<Character, Integer> sCharactersAndCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            sCharactersAndCount.put(c, sCharactersAndCount.getOrDefault(c, 0) + 1);
        }

        for (char b : t.toCharArray()) {
            if (!sCharactersAndCount.containsKey(b) || sCharactersAndCount.get(b) < 0) {
                return false;
            }
            sCharactersAndCount.put(b, sCharactersAndCount.get(b) - 1);
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
