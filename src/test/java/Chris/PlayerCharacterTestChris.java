package Chris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTestChris
{
    @Test
    void getX_ExpectReturnZero()
    {
           int playerPosX = 0;

           int expectedPos = 0;
           int actualPos = PlayerCharacter.getX(playerPosX);

         Assertions.assertEquals(expectedPos, actualPos);
    }

    @Test
    void getY_ExpectReturnZero()
    {
        int playerPosY = 0;

        int expectedPos = 0;
        int actualPos = PlayerCharacter.getY(playerPosY);

        Assertions.assertEquals(expectedPos, actualPos);
    }

    @Test
    void moveY_ExpectReturnOne()
    {
        int playerPosY = 1;

        int expectedPos = 1;
        int actualPos = PlayerCharacter.move(playerPosY);

        Assertions.assertEquals(expectedPos, actualPos);
    }
}
