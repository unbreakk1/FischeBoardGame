public class PlayerCharacterMax {

    static int x = 0;
    static int y = 0;

    public static void main (String[] args){

    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int move(String input) {
        if ( input.equals("w")){
            return ++y;
        }
        if ( input.equals("s")){
            return --y;
        }
        if ( input.equals("d")){
            return ++x;
        }
        return 0;
    }
}
