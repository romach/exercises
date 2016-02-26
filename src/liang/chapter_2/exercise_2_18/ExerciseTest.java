package liang.chapter_2.exercise_2_18;

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
//        a b pow(a, b)
//        1 2 1
//        2 3 8
//        3 4 81
//        4 5 1024
//        5 6 15625

        Exercise.main(new String[]{});
        String expectedOutput = "a b pow(a, b)\n" +
                                "1 2 1\n" +
                                "2 3 8\n" +
                                "3 4 81\n" +
                                "4 5 1024\n" +
                                "5 6 15625\n";
        assertEquals(expectedOutput, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
