package PokeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PokeTest {
    @Test
    void shouldReturn1WhenGive1() {
        Hands hands = new Hands();
        int expectResult = hands.ifTongHua();
        Assertions.assertEquals(1,expectResult);
    }
}