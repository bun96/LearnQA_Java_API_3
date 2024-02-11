import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorotkaiaFrazaTest {

    @ParameterizedTest
    @ValueSource (strings = {"HelloSomeBody", "HelloSomeBodyToday"}) // HelloSomeBody are 13 symbols and HelloSomeBodyToday are 17 symbols

    public void checkLengthOfPhrase(String phrase) {
        String expectedName = (phrase.length() > 15) ? phrase : "";
        assertEquals("HelloSomeBodyToday",expectedName, "Phrase more shortly when 15 characters");
    }
}