//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) throws IndexOutOfBoundsException {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            System.out.println("OpenBracket" +openBracket);
            System.out.println("closebracket" + closeBracket);
            System.out.println("openparen" + openParen);
            System.out.println("closedparen" + closeParen);
            System.out.println("-----------");

            // checks for incomplete link
            if (openBracket == -1 ||
            closeBracket == -1 ||
            openParen == -1 ||
            closeParen == -1) {
                break;
            }

            // checks if there's nothing in the brackets
            if (openBracket == closeBracket -1) {
                currentIndex = closeBracket + 1;
                continue;
            }

            // checks for exclamation marks
            if (openBracket > 1) {
                if (markdown.charAt(openBracket-1) == '!') {
                    currentIndex= openBracket + 2;
                    System.out.println("Excla");
                    continue;
                }
            }



            // checks for exclamation marks
            if (currentIndex != 0 && openBracket != -1) {
                if (markdown.charAt(openBracket-1) == '!') {
                    currentIndex= openBracket + 1;
                    System.out.println("Excla");
                    continue;
                }
            }
            
            // checks to see if close bracket is right before open paren
            if (closeBracket != (openParen - 1)) {
                System.out.println("Closeb");
                currentIndex = openBracket + 1;
                continue;
            }

            currentIndex = closeParen;
            toReturn.add(markdown.substring(openParen + 1, closeParen));


        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
