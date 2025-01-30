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

}
