import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
    
        // loop through every character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
    
            // if the character is already in the map, increment its count
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                // otherwise, add it to the map with a count of 1
                map.put(c, 1);
            }
        }
    
        // find the character with the highest count
        char maxChar = ' ';
        int maxCount = 0;
        for (char c : map.keySet()) {
            int count = map.get(c);
            if (count > maxCount) {
                maxChar = c;
                maxCount = count;
            }
        }
    
        return maxChar;
    }
    
}
