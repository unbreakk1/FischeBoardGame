import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTestMax {

    @Test
    void givenCharacterPosX0_thenReturns0(){
        int positionX = 0;
        int expected = 0;
        int actual = PlayerCharacterMax.getX(positionX);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenCharacterPosY0_thenReturns0(){
        int positionY = 0;
        int expected = 0;
        int actual = PlayerCharacterMax.getY(positionY);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenPressW_thenPositionY1(){
        int positionY = 0;
        int expected = 1;
        int actual = PlayerCharacterMax.move(positionY);
        Assertions.assertEquals(expected,actual);
    }
}
