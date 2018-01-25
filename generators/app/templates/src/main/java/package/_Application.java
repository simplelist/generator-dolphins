package <%= groupCases.splitByDot %>.<%= nameCases.splitByDot %>;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class <%= nameCases.hump %>Application {

    public static void main(String[] args) {
        SpringApplication.run(<%= nameCases.hump %>Application.class, args);
    }
}
