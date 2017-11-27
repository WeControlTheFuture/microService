package com.nemo.stream.output;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@SpringBootApplication
@EnableBinding(Source.class)
public class SourceBootstrap {

	private static Logger logger = LoggerFactory.getLogger(SourceBootstrap.class);

	public static void main(String[] args) {
		SpringApplication.run(SourceBootstrap.class, args);
	}

	@InboundChannelAdapter(Source.OUTPUT)
	public String timerMessageSource() {
		String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		logger.info("publish message :" + format);
		return format;
	}
}
