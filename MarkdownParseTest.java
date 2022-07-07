import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;


import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void test1() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file.md"));
        ArrayList<String> testThis = MarkdownParse.getLinks(testFile);
        assertEquals(testThis, List.of("https://something.com", "some-thing.html"));
    }

    @Test
    public void test2() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file2.md"));
        ArrayList<String> testThis = MarkdownParse.getLinks(testFile);
        assertEquals(testThis, List.of("https://google.com", "some-thing.html"));
    }
}