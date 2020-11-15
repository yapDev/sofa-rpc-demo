package org.example.single;

import static java.util.concurrent.TimeUnit.SECONDS;

import com.alipay.sofa.rpc.api.GenericService;
import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.google.common.util.concurrent.Uninterruptibles;

public class GenericClient {

    public static void main(String[] args) {
        ConsumerConfig<GenericService> consumerConfig = new ConsumerConfig<GenericService>()
                .setInterfaceId("org.example.single.HelloService")
                .setGeneric(true)
                .setProtocol("bolt")
                .setDirectUrl("bolt://127.0.0.1:12200");
        GenericService testService = consumerConfig.refer();
        while (true) {
            String result = (String) testService.$invoke("sayHello", new String[]{"java.lang.String"}, new Object[]{"1111"});
            System.out.println("result: " + result);
            Uninterruptibles.sleepUninterruptibly(2, SECONDS);
        }

    }
}
