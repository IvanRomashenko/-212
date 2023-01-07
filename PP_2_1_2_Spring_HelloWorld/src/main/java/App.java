import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(bean);
        System.out.println(bean2);
        System.out.println("Variables HelloWorld refer to the same object? " + (bean == bean2));

        System.out.println(cat);
        System.out.println(cat2);
        System.out.println("Variables Cat refer to the same object? " + (cat == cat2));

    }
}