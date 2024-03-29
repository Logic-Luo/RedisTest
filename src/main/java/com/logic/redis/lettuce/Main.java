package com.logic.redis.lettuce;

import io.lettuce.core.api.sync.RedisCommands;

/**
 * @author logic
 * @date 2019-10-10 19:56
 * @since 1.0
 */
public class Main extends AbstractLettuce {
    @Override
    protected void test(RedisCommands redisCommands) {
        redisCommands.set("msdc", "logic");
    }

    public static void main(String[] args) {
        new Main().mainTest();
    }
}
