package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/diapason.csv")

    public void testSqrService(int min, int max, int result) {
        SQRService service = new SQRService();

        int actual = service.calculSqr(min, max);
        int counter = result;

        Assertions.assertEquals(counter, actual);

    }

}

