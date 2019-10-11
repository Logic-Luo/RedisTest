package com.logic.redis.lettuce;

import io.lettuce.core.api.sync.RedisCommands;

/**
 * @author logic
 * @date 2019-10-10 20:04
 * @since 1.0
 */
public class ScanTest extends AbstractLettuce {
    @Override
    protected void test(RedisCommands redisCommands) {
        for (int i = 0; i < 1000; i++) {
            String set = redisCommands.set("a" + i, "a");
            System.out.println(set);
        }
    }

    public static void main(String[] args) {
        new ScanTest().mainTest();;
    }
}
