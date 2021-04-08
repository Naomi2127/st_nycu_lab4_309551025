


public class Game{
    static String result(String p1, String p2){
        if( p1.equals(p2)) return "Draw.";
        else if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper")) && p2.equals("rock")) return  "Player 1 wins.";
        else return "Player 2 wins.";
    }

    static boolean check_input(String s){
        return ((s.equals("rock")) || (s.equals("paper")) || (s.equals("scissors")));
    }
}