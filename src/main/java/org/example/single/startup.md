# 最简单的实例

SOFARPC 中的术语和Dubbo类似，都是Consumer/Provider这种的

## 服务端

Server 和 ServerImpl 没有好说的，都是这种方式。关键是Server的启动

- `ServerConfig` 配置了协议和接口
- `ProviderConfig` 则指定了接口和实现，和上面的配置

服务发布的动作由 `ProviderConfig.export()` 接口完成

## 客户端

1. 接口通过SDK获取到
2. 代理是通过 `ConsumerConfig` 获取，它知晓协议，HostAndPort，接口后返回代理对象。

## 思考

https://www.sofastack.tech/projects/sofa-rpc/getting-started-with-sofa-boot/

SpringBoot 启动时，也是通过配置，为什么不是代码呢