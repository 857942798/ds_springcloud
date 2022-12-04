# ds_springcloud
 
# hystrix-dashboard9001
http://localhost:9001/hystrix

监控地址： http://localhost:8001/hystrix.stream

# hystrix-payment8001
正确的调用地址：http://localhost:8001/payment/circuit/1

错误的调用地址：http://localhost:8001/payment/circuit/-1

# eureka-server7001
http://eureka7001.com:7001/

# config-center-3344 ，配置中心服务端
http://localhost:3344/main/config-dev.yml
# config-center-3355 ，配置中心客户端
通过rest接口读取配置文件

http://localhost:3355/configInfo

需要运维人员发送一个post请求进行刷新，这个需要添加spring-boot-starter-actuator

curl -X POST "http://localhost:3355/actuator/refresh"
# config-center-3366 ，配置中心客户端
http://localhost:3366/configInfo

利用消息总线触发一个服务端ConfigServer的/bus/refresh断电，而刷新所有客户端的配置，一次发送，处处生效：

curl -X POST "http://localhost:3344/actuator/bus-refresh"

指定具体某一个实例生效而不是全部

curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"

# cloud-stream-rabbitmq-provider8801,作为生产者进行发消息模块
http://localhost:8801/sendMessage


# cloud-consumer-order80 ，消费者
zipkin 调用链路测试

http://localhost:80/consumer/payment/zipkin



# cloudalibaba-provider-payment9001 ，服务提供者1
http://localhost:9001/payment/nacos/1
# cloudalibaba-provider-payment9001 ，服务提供者2
http://localhost:9002/payment/nacos/1
# cloudalibaba-consumer-nacos-order83 ，服务消费者
http://localhost:83/consumer/payment/nacos/1
# cloudalibaba-config-nacos-client3377，配置中心
http://localhost:3377/config/info


# seata-order-service2001
正常下单：

http://localhost:2001/order/create?userId=1&productId=1&count=10&money=100

