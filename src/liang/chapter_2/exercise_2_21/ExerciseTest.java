package liang.chapter_2.exercise_2_21;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class ExerciseTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void writesTextToSystemOut() {
//        Enter investment amount: 1000.56
//        Enter annual interest rate in percentage: 4.25
//        Enter number of years: 1
//        Accumulated value is $1043.92

        systemInMock.provideLines("1000.56", "4.25", "1");
        Exercise.main(new String[]{});
        String expectedOutput = "Enter investment amount: " +
                                "Enter annual interest rate in percentage: " +
                                "Enter number of years: " +
                                "Accumulated value is $1043.92\n";
        assertEquals(expectedOutput, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
