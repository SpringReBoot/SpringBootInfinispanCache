package com.springreboot.cache.infinispan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class InfinispanCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfinispanCacheApplication.class, args);
	}

}
