package at.weigelsdorf;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommandLineToArgvTest {
    @Test
    void noArguments() {
        assertTrue( CommandLineToArgv.parse("").size() == 0);
    }

    @Test
    void oneArgument() {
        List<String> argv = CommandLineToArgv.parse("bumsti.txt");
        assertEquals(0, argv.size());
        assertEquals("bumsti.txt", argv.get(0));
    }

    @Test
    void oneQuotedArgument() {
        List<String> argv = CommandLineToArgv.parse("\"bumsti und hansi.txt\"");
        assertEquals(0, argv.size());
        assertEquals("\"bumsti und hansi.txt\"", argv.get(0));
    }
}