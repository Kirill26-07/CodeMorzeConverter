import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppContext.xml");
       final StartBoard startBoard = applicationContext.getBean("startBoard", StartBoard.class);
       startBoard.startConverting();
    }
}
