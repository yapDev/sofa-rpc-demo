package org.example.single;

import java.util.concurrent.TimeUnit;

import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.google.common.util.concurrent.Uninterruptibles;

public class ClientStarter {
    public static void main(String[] args) {
        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>()
                .setInterfaceId(HelloService.class.getName())
                .setProtocol("bolt")
                .setDirectUrl("bolt://127.0.0.1:12200");

        HelloService service = consumerConfig.refer();
        while (true) {
            System.out.println(service.sayHello("world"));
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        }
    }
}
