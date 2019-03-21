import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class MinesweeperTest {

    final String [] input = {"4 4",
                    "*...",
                    "....",
                    ".*..",
                    "....",
                    "3 5",
                    "**...",
                    ".....",
                    ".*...",
                    "0 0"};

    final String[] expected = {"Field #1",
            "*100",
            "....",
            ".*..",
            "....",
            "Field #2",
            "**...",
            ".....",
            ".*...",
            "Field #3"};

    @Test
    void checkResultSize() {
        assertEquals(10, Minesweeper.calculate(input).length);
    }

    @Test
    void checkHeaders() {
        assertEquals("Field #1", Minesweeper.calculate(input)[0]);
        assertEquals("Field #2", Minesweeper.calculate(input)[5]);
        assertEquals("Field #3", Minesweeper.calculate(input)[9]);
    }

    @Test
    void checkSecondRow() {
        assertEquals("*100", Minesweeper.calculate(input)[1]);
    }
}


