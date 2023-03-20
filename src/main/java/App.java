import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cbean =  applicationContext.getBean("cat", Cat.class);
        Cat csbean =  applicationContext.getBean("cat", Cat.class);

        boolean comparisonHW = bean == secondBean;
        boolean comparisonC = cbean == csbean;

        System.out.println(comparisonHW);
        System.out.println(comparisonC);
        System.out.println(bean.getMessage());
        System.out.println(cbean.getMessage());
    }
}