class Solution {
    public String sortSentence(String s) {
        // Split the sentence into individual word-number tokens
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            // Get 1-based index from the last character of the token
            int position = word.charAt(word.length() - 1) - '0';
            
            // Extract the word without the trailing number digit
            String actualWord = word.substring(0, word.length() - 1);
            
            // Store it at the corresponding 0-indexed position
            result[position - 1] = actualWord;
        }

        // Join the words back into a single space-separated string
        return String.join(" ", result);
    }
}
