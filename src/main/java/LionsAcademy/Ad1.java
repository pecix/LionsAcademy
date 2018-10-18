package LionsAcademy;

public class Ad1 {

    private int count;

    public int wordsCount(String[] words, int len) {
        count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }
}
