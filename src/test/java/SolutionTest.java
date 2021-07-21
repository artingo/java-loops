import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void repeat_number() {
        String result = Solution.repeat(3, "number");
        assertTrue(result.equals("number1 number2 number3 "));
    }

    @Test
    void repeat_article() {
        String result = Solution.repeat(5, "article");
        assertTrue(result.equals("article1 article2 article3 article4 article5 "));
    }
}