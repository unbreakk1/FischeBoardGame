public class PlayerCharacterMax {

    static int x = 0;
    static int y = 0;

    public static void main (String[] args){

    }

    public static int getX(int posX) {
        return 0;
    }

    public static int getY(int posY) {
        return 0;
    }

    public static int move(String input) {
        if ( input.equals("W")){
            y++;
            return y;
        }
        return 0;
    }
}
