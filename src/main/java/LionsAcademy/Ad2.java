package LionsAcademy;


public class Ad2 {

    private String[] outOfBounds = {"Out Of Bounds"};

    public String[] wordsFront(String[] words, int n) {
        if(n <= words.length && n >= 0) {
            String[] newWords = new String[n];
            for (int i = 0; i < n; i++) {
                newWords[i] = words[i];
            }
            return newWords;
        }
        return outOfBounds;
    }
}

