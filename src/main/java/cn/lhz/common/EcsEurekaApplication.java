package cn.lhz.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EcsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcsEurekaApplication.class, args);
	}

}
