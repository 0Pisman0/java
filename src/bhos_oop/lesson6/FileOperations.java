package lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class FileOperations {
    public static <T> void writeToFile(String filename, List<T> data) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), data);
            System.out.println("Yazıldı: " + filename);
        } catch (Exception e) {
            System.err.println("Fayla yazarkən xəta: " + filename);
            e.printStackTrace();
        }
    }
}

