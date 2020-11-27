import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        System.out.println(bean3.getSound());
        if (bean.equals(bean2)) {
            System.out.println("True. HW.");
        } else {
            System.out.println("False. HW.");
        }
        if (bean3.equals(bean4)) {
            System.out.println("True. Cat.");
        } else {
            System.out.println("False. Cat.");
        }

    }
}