import java.util.HashMap;
import java.util.Map;

public class RansomNoteRunner {
    private static boolean construct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCharactersAndCount = new HashMap<>();

        for (char b : magazine.toCharArray()) {
            magazineCharactersAndCount.put(b, magazineCharactersAndCount.getOrDefault(b, 0) + 1);
        }
        for (char a : ransomNote.toCharArray()) {
            if (!magazineCharactersAndCount.containsKey(a) || magazineCharactersAndCount.get(a) <= 0) {
                return false;
            }
            magazineCharactersAndCount.put(a, magazineCharactersAndCount.get(a) - 1);
        }

        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        System.out.println(construct("a", "b"));
        System.out.println(construct("aa", "ab"));
        System.out.println(construct("aa", "aab"));
    }
}
