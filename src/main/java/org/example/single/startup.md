# Start Up

## 最简单的实例

SOFARPC 中的术语和Dubbo类似，都是Consumer/Provider这种的

### 服务端

Server 和 ServerImpl 没有好说的，都是这种方式。关键是Server的启动

将服务拆分为3部分： `RegistryConfig` ，`ServerConfig` ，`ProviderConfig` ，分布是

- 配置注册中心信息
- 服务注册信息
- 服务接口/实现类 + 上面两个

服务发布的动作由 `ProviderConfig.export()` 接口完成

### 客户端

1. 接口通过SDK获取到
2. 代理是通过 `ConsumerConfig` 获取，它知晓协议，HostAndPort，接口后返回代理对象。

将客户拆分为两个部分： `RegistryConfig` ，`ConsumerConfig`

- 注册中心地址
- 接口信息 + 上面那个

## 思考

https://www.sofastack.tech/projects/sofa-rpc/getting-started-with-sofa-boot/

SpringBoot 启动时，也是通过配置，为什么不是代码呢