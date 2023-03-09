import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test {

class Main
{
    public static void main(String[] args)
    {
        Path path = Paths.get("demo.txt");
 
        String content = null;
        try {
            byte[] encoded = Files.readAllBytes(path);
            content = new String(encoded, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        System.out.println(content);
    }
}
    
}
