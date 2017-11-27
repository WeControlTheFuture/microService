package com.nemo.stream.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;

@SpringBootApplication
@EnableBinding(Processor.class)
public class ProcessorBootstrap {
	private static Logger logger = LoggerFactory.getLogger(ProcessorBootstrap.class);
	private static String name = "logging";

	public static void main(String[] args) {
		SpringApplication.run(ProcessorBootstrap.class, args);
	}

	@ServiceActivator(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
	public Object transform(Object payload) {
		logger.info("Transformed by " + this.name + ": " + payload);
		return payload;
	}
}
