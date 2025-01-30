import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTestMax {
    @BeforeEach
    void resetPosition() {
        PlayerCharacterMax.x = 0;
        PlayerCharacterMax.y = 0;

    }

    @Test
    void givenx0_thenReturnsX0(){
        int expectedX = 0;
        int actualX = PlayerCharacterMax.getX();
        Assertions.assertEquals(expectedX,actualX);
    }

    @Test
    void givenY0_thenReturnsY0(){
        int expectedY = 0;
        int actualY = PlayerCharacterMax.getY();
        Assertions.assertEquals(expectedY,actualY);
    }

    @Test
    void givenW_thenY1(){
        String input = "w";
        int expectedY = 1;
        int actualY = PlayerCharacterMax.move(input);
        Assertions.assertEquals(expectedY,actualY);
    }

    @Test
    void givenPressS_thenYminus1(){
        String input = "s";
        int expectedY = -1;
        int actualY = PlayerCharacterMax.move(input);
        Assertions.assertEquals(expectedY,actualY);
    }

    @Test
    void givenPressD_thenX1(){
        String input = "d";
        int expectedX = 1;
        int actualX = PlayerCharacterMax.move(input);
        Assertions.assertEquals(expectedX,actualX);
    }

    @Test
    void givenPressA_thenXminus1(){
        String input = "a";
        int expectedX = -1;
        int actualX = PlayerCharacterMax.move(input);
        Assertions.assertEquals(expectedX,actualX);
    }
    @Test
    void givenSequenceAWAW_thenXminus2_Y2() {
        PlayerCharacterMax.move("a"); // x = -1, y = 0
        PlayerCharacterMax.move("w"); // x = -1, y = 1
        PlayerCharacterMax.move("a"); // x = -2, y = 1
        PlayerCharacterMax.move("w"); // x = -2, y = 2

        int expectedX = -2;
        int expectedY = 2;

        Assertions.assertEquals(expectedX, PlayerCharacterMax.getX());
        Assertions.assertEquals(expectedY, PlayerCharacterMax.getY());
    }
    @Test
    void givenSequenceAWAWWWWDDD_thenXminus2_Y2() {
        PlayerCharacterMax.move("a"); // x = -1, y = 0
        PlayerCharacterMax.move("w"); // x = -1, y = 1
        PlayerCharacterMax.move("a"); // x = -2, y = 1
        PlayerCharacterMax.move("w"); // x = -2, y = 2
        PlayerCharacterMax.move("w"); // x = -2, y = 2
        PlayerCharacterMax.move("w"); // x = -2, y = 2
        PlayerCharacterMax.move("w"); // x = -2, y = 2
        PlayerCharacterMax.move("d"); // x = -2, y = 2
        PlayerCharacterMax.move("d"); // x = -2, y = 2
        PlayerCharacterMax.move("d"); // x = -2, y = 2

        int expectedX = 1;
        int expectedY = 5;

        Assertions.assertEquals(expectedX, PlayerCharacterMax.getX());
        Assertions.assertEquals(expectedY, PlayerCharacterMax.getY());
    }

}
