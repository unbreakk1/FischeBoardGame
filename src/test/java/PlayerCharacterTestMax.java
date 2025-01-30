import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
    void givenIllegalArgumentU_thenReturnX0(){
        String input = "u";
        int expectedX = 0;
        int actualX = PlayerCharacterMax.move(input);
        Assertions.assertEquals(expectedX,actualX);
    }

    @ParameterizedTest
    @CsvSource({
            "'d',1",
            "'a',-1"
    })
    void givenD_thenX1(String input, int expectedX){
        PlayerCharacterMax.move(input);
        Assertions.assertEquals(expectedX,PlayerCharacterMax.getX());
    }

    @ParameterizedTest
    @CsvSource({
            "'w',1",
            "'s',-1"
    })
    void givenW_thenY1(String input, int expectedY){
        PlayerCharacterMax.move(input);
        Assertions.assertEquals(expectedY,PlayerCharacterMax.getY());
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
