import com.hit.lyx.dubbo.demo.api.service.House;
import com.hit.lyx.dubbo.demo.api.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestDubboRequest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/consumer.xml");
        ctx.start();
        UserService service = ctx.getBean(UserService.class);
        House house= ctx.getBean(House.class);
        System.out.println(house.m());
        Scanner in = new Scanner(System.in);
        while (true){
            Long id = in.nextLong();
            System.out.println(service.getUser(id));
        }
    }
}
