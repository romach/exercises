package liang.chapter_2.exercise_2_17;

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
//        Enter the temperature in Fahrenheit between -58°F and 41°F:
//        5.3
//        Enter the wind speed (>=2) in miles per hour: 6
//        The wind chill index is -5.56707

        systemInMock.provideLines("5,3", "6");
        Exercise.main(new String[]{});
        String expectedOutput = "Enter the temperature in Fahrenheit between -58°F and 41°F: " +
                                "Enter the wind speed (>=2) in miles per hour: " +
                                "The wind chill index is -5.56707\n";
        assertEquals(expectedOutput, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
