package springcloud.com.atguigu.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/19 17:04
 */
@RestController
@EnableBinding(Sink.class)
public class ReceiveMessageListernerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者2号---------->接收到消息:"+message.getPayload()+"\t"+"port:" +serverPort);
    }
}
