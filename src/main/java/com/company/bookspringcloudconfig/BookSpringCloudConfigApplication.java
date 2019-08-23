package com.company.bookspringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BookSpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookSpringCloudConfigApplication.class, args);
	}

}
