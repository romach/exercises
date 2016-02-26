package liang.chapter_2.exercise_2_19;

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
//        Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
//        The area of the triangle is 33.6

        systemInMock.provideLines("1.5", "-3.4", "4.6", "5", "9.5", "-3.4");
        Exercise.main(new String[]{});
        String expectedOutput = "Enter three points for a triangle: " +
                                "The area of the triangle is 33.6\n";
        assertEquals(expectedOutput, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
