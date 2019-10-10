package com.logic.redis.lettuce;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

/**
 * Lettuce父类
 *
 * @author logic
 * @date 2019-10-10 19:51
 * @since 1.0
 */
public abstract class AbstractLettuce {

    /**
     * 主的测试方法
     *
     * @param redisCommands RedisCommands
     */
    public abstract void test(RedisCommands redisCommands);



    public void mainTest() {
        RedisClient redisClient = RedisClient.create("redis://@localhost:6379/0");
        StatefulRedisConnection<String, String> connect = redisClient.connect();
        RedisCommands<String, String> sync = connect.sync();

        test(sync);

        connect.close();
        redisClient.shutdown();
    }
}
