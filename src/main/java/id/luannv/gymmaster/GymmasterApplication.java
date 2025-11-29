package id.luannv.gymmaster;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GymmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymmasterApplication.class, args);
        log.warn("---- GymmasterApplication started");
	}

}
