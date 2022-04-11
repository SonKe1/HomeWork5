package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculatePossibleSquaresInTheСorrectRangeNumbers() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }
    
    @Test
    void shouldCalculateSquaresInTheNegativeRangeNumbers() {
        SQRService service = new SQRService();
        int actual = service.calculate(-200, -300);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquaresWithTheSameRangeNumbers() {
        SQRService service = new SQRService();
        int actual = service.calculate(0, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }
}