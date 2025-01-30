package Chris;

import org.junit.jupiter.api.Test;

public class PlayerCharacterTestChris
{
    @Test
    void getX_ExpectReturnZero()
    {
           int playerPosX = 0;

           int expectedPos = 0;
           int actualPos = PlayerCharacter.getX(playerPosX);

           assert expectedPos == actualPos;
    }

    @Test
    void getY_ExpectReturnZero()
    {
        int playerPosY = 0;

        int expectedPos = 0;
        int actualPos = PlayerCharacter.getY(playerPosY);

        assert expectedPos == actualPos;
    }

}
