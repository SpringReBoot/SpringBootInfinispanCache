package com.springreboot.cache.infinispan.listener;

import org.infinispan.notifications.Listener;
import org.infinispan.notifications.cachelistener.annotation.CacheEntriesEvicted;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryCreated;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryExpired;
import org.infinispan.notifications.cachelistener.event.CacheEntriesEvictedEvent;
import org.infinispan.notifications.cachelistener.event.CacheEntryCreatedEvent;
import org.infinispan.notifications.cachelistener.event.CacheEntryExpiredEvent;

@Listener(clustered = false)
public class CacheListener {

	@CacheEntriesEvicted
	public void cacheEvicted(CacheEntriesEvictedEvent<Object, Object> event) {
		System.out.println("cache evicted.");
	}

	@CacheEntryExpired
	public void entryExpired(CacheEntryExpiredEvent<Object, Object> event) {
		System.out.println("cache expired.");
	}

	@CacheEntryCreated
	public void entryCreated(CacheEntryCreatedEvent<Object, Object> event) {
		System.out.println("cache created.");
	}
}
