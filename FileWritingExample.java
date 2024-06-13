import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class FileWritingExample {
    public static void main(String[] args) {
        String sourceFile = "C://MINDEN AMI A SULIHOZ KAPCSOLÓDIK//asztalfejl(java)KA/Új mappa/Bagossy";
        String targetFile = "C://MINDEN AMI A SULIHOZ KAPCSOLÓDIK//asztalfejl(java)KA/Új mappa/Olyan_o.txt";
        
        // Tartalom beolvasása a forrás fájlból
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(Paths.get(sourceFile));
        } catch (IOException e) {
            System.err.printf("Unable to read file: %s", sourceFile);
            e.printStackTrace();
        }
        
        content.add("Olyan ő, hogy megáll\r\n" + //
                        "A szívem kalapál\r\n" + //
                        "Mégis olyan ember\r\n" + //
                        "Hogyha kell, odébbáll\r\n" + //
                        "Ő az úton merre jár\r\n" + //
                        "Abban nincsen rendszer\r\n" + //
                        " \r\n" + //
                        "Kimerít, makacs és\r\n" + //
                        "Szemérmetlen is\r\n" + //
                        "Én vele nem beszélek\r\n" + //
                        "Hogyha kellek, ölelj át\r\n" + //
                        "Add a szíved, add a\r\n" + //
                        "");

        Path newPath = Paths.get(targetFile);

        try {
            Files.write(newPath, content);
            System.out.println("A new file has been created.");
        } catch (IOException e) {
            System.err.printf("Unable to write file: %s", targetFile);
            e.printStackTrace();
        }
    }
}
