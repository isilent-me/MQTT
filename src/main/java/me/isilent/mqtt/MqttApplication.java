package me.isilent.mqtt;

import me.isilent.mqtt.auto.MqttMessageClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
public class MqttApplication {
	@Resource
	private MqttMessageClient mqttMessageClient;

	public static void main(String[] args) {
		SpringApplication.run(MqttApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		mqttMessageClient.sendMessage("hello", "hello world");
		return "hello world";
	}
}
