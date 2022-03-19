import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String... args) throws IOException {
        Example example1 = new Example();
        example1.printI();

        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{\"i\": 11}";
        Example example2 = mapper.reader().withType(Example.class).readValue(jsonInString);
        example2.printI();
    }
}

class Example {
    public final Integer i = 10;

    public void printI() {
        System.out.println(i);
    }
}
