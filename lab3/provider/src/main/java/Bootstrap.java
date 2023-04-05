import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Bootstrap {

    public static void main(String[] args) throws InterruptedException, IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/provider.xml");
        ctx.start();
        System.out.println("provider is started...");
//        ServerSocket server = new ServerSocket(8080);
        while(true){
//            Socket client = server.accept();
//            client.getOutputStream().write(InetAddress.getLocalHost().getHostAddress().getBytes(StandardCharsets.UTF_8));
//            client.getOutputStream().flush();
        }
    }
}
