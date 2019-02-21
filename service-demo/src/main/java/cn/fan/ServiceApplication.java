package cn.fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ServiceApplication
 * @Description
 * @Mail fanshuai@myhexin.com
 * @Date 2019/2/21 13:37
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
