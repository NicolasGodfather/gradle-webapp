/**
 * Created by User on 25.02.2016.
 */
public class Main{

    private String str;

    public static String doSomething() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
//        Main main = (Main) context.getBean("main");
//        return main.getStr();
        return "";
    }

    public static void main(String[] args) {
        System.out.print(doSomething());
    }

    public String getStr() {
        return str;
    }

}
