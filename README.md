# MQTT project for Spring Boot
[参考项目](https://github.com/brandonbai/mqtt-spring-boot)

订阅
```
mosquitto_sub -h localhost -t "test/#" -u hanmeimei -P 123456 -i "client1"
```
发布
```
mosquitto_pub -h localhost -t "test/abc" -u lilei -P 123456 -i "client3" -m "How are you?"
```
