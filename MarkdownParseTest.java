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
        assertEquals(List.of("https://something.com", "some-thing.html"), testThis);
    }

    @Test
    public void test2() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file2.md"));
        ArrayList<String> testThis = MarkdownParse.getLinks(testFile);
        assertEquals(List.of("https://google.com", "some-thing.html"), testThis);
    }

    @Test
    public void test3() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file3.md"));
        List testThis = MarkdownParse.getLinks(testFile);
        assertEquals(List.of(), testThis);
    }

    @Test
    public void test4() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file4.md"));
        List testThis = MarkdownParse.getLinks(testFile);
        assertEquals(List.of(), testThis);
    }

    @Test
    public void test5() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file5.md"));
        List testThis = MarkdownParse.getLinks(testFile);
        assertEquals(List.of(), testThis);
    }

    @Test
    public void test6() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file6.md"));
        List testThis = MarkdownParse.getLinks(testFile);
        assertEquals(List.of(), testThis);
    }

    @Test
    public void test7() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file7.md"));
        List testThis = MarkdownParse.getLinks(testFile);
        assertEquals(List.of(), testThis);
    }

    @Test
    public void test8() throws IOException {
        String testFile = Files.readString(Path.of("/Users/darri/OneDrive/Documents/GitHub/markdown-parser-1/test-file8.md"));
        List testThis = MarkdownParse.getLinks(testFile);
        assertEquals(List.of(), testThis);
    }
}