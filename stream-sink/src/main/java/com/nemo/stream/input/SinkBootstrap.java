package com.nemo.stream.input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SinkBootstrap {


	private static Logger logger = LoggerFactory.getLogger(SinkBootstrap.class);

	public static void main(String[] args) {
		SpringApplication.run(SinkBootstrap.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void sinkMessage(Object message) {
		logger.info("received message: " + message);
	}

}
