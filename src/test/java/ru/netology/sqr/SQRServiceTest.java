package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    public void sqrCalc () {
        SQRService service = new SQRService();

        int actual = service.calculate(400, 500);
        int expected = 3;
        assertEquals(actual, expected);
    }
}
