package com.springreboot.cache.infinispan.config;

import javax.annotation.PostConstruct;

import org.infinispan.spring.embedded.provider.SpringEmbeddedCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.springreboot.cache.infinispan.listener.CacheListener;


@Configuration
public class CacheConfig {

	@Autowired
	SpringEmbeddedCacheManager cacheManager;
	
	@PostConstruct
	public void init() {
		cacheManager.getNativeCacheManager().getCache("cache1").addListener(new CacheListener());
	}
	
}
