package liang.chapter_2.exercise_2_23;

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
//        Enter the driving distance: 900.5
//        Enter miles per gallon: 25.5
//        Enter price per gallon: 3.55
//        The cost of driving is $125.36

        systemInMock.provideLines("900.5", "25.5", "3.55");
        Exercise.main(new String[]{});
        String expectedOutput = "Enter the driving distance: " +
                                "Enter miles per gallon: " +
                                "Enter price per gallon: " +
                                "The cost of driving is $125.36\n";
        assertEquals(expectedOutput, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
