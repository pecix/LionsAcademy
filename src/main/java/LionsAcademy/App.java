package LionsAcademy;

public class App {

    public static void main( String[] args ){

        String[] words = {"a", "bb", "b", "ccc"};

//-----------------------------------------------------------------------------
        Ad1 ad1 = new Ad1();
        System.out.println("Ad. 1");
        System.out.println(ad1.wordsCount(words, 1));
        System.out.println(ad1.wordsCount(words, 3));
        System.out.println(ad1.wordsCount(words, 4));
        System.out.println("-----------------------");
//-----------------------------------------------------------------------------
        Ad2 ad2 = new Ad2();
        System.out.println("Ad. 2");
        for (String s: ad2.wordsFront(words, 1)){
            System.out.print(s + ", ");
        };
        System.out.println();
        for (String s: ad2.wordsFront(words, 2)){
            System.out.print(s + ", ");
        };
        System.out.println();
        for (String s: ad2.wordsFront(words, 3)){
            System.out.print(s + ", ");
        };
        System.out.println();
        System.out.println("-----------------------");
//-----------------------------------------------------------------------------
        Ad3 ad3 = new Ad3();
        System.out.println("Ad. 3");
        System.out.println(ad3.greenTicket(1,2,3));
        System.out.println(ad3.greenTicket(2,2,2));
        System.out.println(ad3.greenTicket(1,1,2));


    }
}
