package args

import kotlin.test.assertEquals
import org.junit.Test

class ArgsParserTest {
    @Test fun testOK() {
        val argsParser = ArgsParser("schema",arrayOf("hi", "there"))
        assertEquals("Hello, world!", argsParser.hello())
    }

    @Test fun testWrong() {
        assertEquals("Hello, world!", "world, hello!")
    }
}