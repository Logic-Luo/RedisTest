package com.logic.redis.lettuce;

import io.lettuce.core.RedisClient;

/**
 * Lettuce工具类
 *
 * @author logic
 * @date 2019-10-10 19:42
 * @since 1.0
 */
public class LettuceUtil {
    public static RedisClient getRedisClient() {
        return RedisClient.create("redis://@localhost:6379");
    }

    public static void showDownRedisClient(RedisClient redisClient) {
        redisClient.shutdown();
    }
}
