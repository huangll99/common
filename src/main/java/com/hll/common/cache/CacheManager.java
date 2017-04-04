package com.hll.common.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by huangll on 2017/4/4.
 */
public class CacheManager {

  private static LoadingCache<String, String> cache;

  static {
    LoadingCache<String, String> cache = CacheBuilder.newBuilder()
        .expireAfterWrite(10, TimeUnit.SECONDS)
        .build(new CacheLoader<String, String>() {
          @Override
          public String load(String url) throws Exception {
            String cookie = request(url);
            return cookie;
          }
        });
  }

  private static String request(String url) {
    return null;
  }

  public static LoadingCache<String, String> getInstance() {
    return cache;
  }

  public static void main(String[] args) throws ExecutionException {

    String cookie = CacheManager.getInstance().get("www.xxx.com");
  }


}
