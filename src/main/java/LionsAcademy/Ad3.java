package LionsAcademy;

public class Ad3 {

    private int score;

    public int greenTicket(int a, int b, int c) {
        score = 0;

        if (a == b && a == c){
            score = 20;
        } else if (a != b && a != c && b !=c){
            score = 0;
        } else {
            score = 10;
        }

        return score;
    }
}
