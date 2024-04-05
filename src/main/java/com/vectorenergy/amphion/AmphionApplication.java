package com.vectorenergy.amphion;

import com.vectorenergy.amphion.controller.WorkOrder;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;


import java.util.TimeZone;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.vectorenergy.amphion.*")
public class AmphionApplication implements CommandLineRunner {

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/Madrid"));
	}

	@Autowired
	WorkOrder wo;

	public static void main(String[] args)  {
		SpringApplication.run(AmphionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		wo.run();
	}
}
