package com.tedu.sp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableDiscoveryClient
@SpringBootApplication
public class Spo2ItemserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spo2ItemserviceApplication.class, args);
	}

}
