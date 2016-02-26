package liang.chapter_2.exercise_2_20;

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
//        Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
//        The interest is 2.91667

        systemInMock.provideLines("1000", "3.5");
        Exercise.main(new String[]{});
        String expectedOutput = "Enter balance and interest rate (e.g., 3 for 3%): " +
                                "The interest is 2.91667\n";
        assertEquals(expectedOutput, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
