import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTestMax {

    @Test
    void givenx0_thenReturns0(){
        int x = 0;
        int expected = 0;
        int actual = PlayerCharacterMax.getX(x);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenCharacterPosY0_thenReturns0(){
        int y = 0;
        int expected = 0;
        int actual = PlayerCharacterMax.getY(y);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenPressW_thenPositionY1(){
        String input = "W";
        int expected = 1;
        int actual = PlayerCharacterMax.move(input);
        Assertions.assertEquals(expected,actual);
    }
}
