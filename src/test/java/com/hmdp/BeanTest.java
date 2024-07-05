package com.hmdp;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

import static com.hmdp.utils.RedisConstants.LOGIN_USER_KEY;

@Slf4j
@SpringBootTest
public class BeanTest {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {
        String key = LOGIN_USER_KEY + "06e338567ec041b3b90e52233dd48856";
        Boolean res = stringRedisTemplate.delete(key);
        log.debug("res:{}", res);
    }
}
