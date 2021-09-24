import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharIndexRunner {
    private static int uniqueCharIndex(String s) {
        //return index of first unique character
        Map<Character, Integer> mapOfCharAndCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            mapOfCharAndCount.put(c, mapOfCharAndCount.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (1 == mapOfCharAndCount.get(c)) {
                return s.indexOf(String.valueOf(c));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        uniqueCharIndex("loveleetcode");
    }
}
