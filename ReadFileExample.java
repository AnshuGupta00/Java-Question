import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {

        FileReader sourceStream = null;

        try {
            sourceStream = new FileReader("D:\\test.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1) {
                System.out.print((char) temp);
            }

            System.out.println("\nFile read successfully");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (sourceStream != null) {
                sourceStream.close();
            }
        }
    }
}