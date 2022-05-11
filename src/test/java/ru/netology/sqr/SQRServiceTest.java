package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/TestData.csv"})
    public void sqrRange(int minD, int maxD, int expected) {
        SQRService service = new SQRService();

        long actual = service.calculate(minD, maxD);

        Assertions.assertEquals(expected, actual);
    }
}
