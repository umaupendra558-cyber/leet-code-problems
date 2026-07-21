import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < n; i++) {
            if (!vowels.contains(word.charAt(i))) {
                continue;
            }

            Set<Character> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                if (!vowels.contains(c)) {
                    break;
                }
                seen.add(c);
                if (seen.size() == 5) {
                    count++;
                }
            }
        }

        return count;
    }
}
