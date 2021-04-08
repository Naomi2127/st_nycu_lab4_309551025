import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    public static Stream<Arguments> input() {
        return Stream.of(
                arguments("rock","rock","Draw."),
                arguments("paper","paper","Draw."),
                arguments("scissors","scissors","Draw."),
                arguments("rock","paper","Player 2 wins."),
                arguments("rock","scissors","Player 1 wins."),
                arguments("paper","rock","Player 1 wins."),
                arguments("paper","scissors","Player 2 wins."),
                arguments("scissors","rock","Player 2 wins."),
                arguments("scissors","paper","Player 1 wins.")
        );
    }

    @ParameterizedTest(name = "#{index} - Test with Argument={0},{1}")
    @MethodSource("input")
    public void resultsTest(String p1,String p2,String r) {
        assertEquals(Game.result(p1,p2),r);
    }

    @Test
    public void inputTest() {
        assertFalse(Game.check_input("hehehe"));
    }
}