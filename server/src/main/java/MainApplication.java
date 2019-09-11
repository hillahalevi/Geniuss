import controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        TestController testController = new TestController();

        testController.addTest("C:\\Users\\Asus\\Desktop\\hilaCV - Google Docs.pdf");
    }
}