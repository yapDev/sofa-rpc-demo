package org.example.single;

import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;

public class ServerStarter {
    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig()
                .setProtocol("bolt")
                .setPort(12200)
                .setDaemon(false);
        ProviderConfig<HelloService> providerConfig = new ProviderConfig<HelloService>()
                // 指定接口
                .setInterfaceId(HelloService.class.getName())
                // 手动指定的服务实现类，也不是不可以
                .setRef(new HelloServiceImpl())
                .setServer(serverConfig);

        providerConfig.export();
    }
}
