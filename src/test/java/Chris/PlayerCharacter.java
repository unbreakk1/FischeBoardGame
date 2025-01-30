package Chris;

public class PlayerCharacter
{
    public static void main(String[] args)
    {
        int playerPosX = 0;
        int playerPosY = 0;
        // these two could be static, but i don't want them to 8)

        }

    public static int getX(int playerPosX)
    {
        return playerPosX;
    }

    public static int getY(int playerPosY)
    {
        return playerPosY;
    }

    public static int move(int playerPos, String key)
    {

        switch (key)
        {
            case "w": return playerPos;
            case "a": return playerPos;
            case "s": return playerPos;
            case "d": return playerPos;
            default: return -1;
        }
    }
}
