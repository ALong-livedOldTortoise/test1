package test;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jyl
 * @version 1.0
 * @Date: 2019/4/24 17:09
 * @see: 背景
 * @since 描述
 */
@ComponentScan(basePackages = {"test","com.jzfq.track","service","com.juzifenqi.alita.dubbo","com.juzifenqi.order"})
@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}