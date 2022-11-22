package cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



/**
 * @author WH
 * @version 1.0
 * @date 2022/11/21 9:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9007 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9007.class,args);
    }
}
