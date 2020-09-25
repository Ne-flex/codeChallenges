package azubi.challenges.task002;

public class UniqueCharsTester {

    /**
     * hasUniqueChars returs true, when the given string consists only of 
     * unique chars, false otherwise
     * 
     * @param candidate given String to test
     */
    public static boolean hasUniqueChars(String candidate) {
        if (candidate.length() == 1) {
            return true;
        }

        for (int i = 0; i < candidate.length(); i++) {
            char currentChar = candidate.charAt(i);
            for (int j = i+1; j < candidate.length(); j++) {
                char followingChar = candidate.charAt(j);
                if (currentChar == followingChar) {
                    return false;
                }
            }
        }
        return true;
    }
}