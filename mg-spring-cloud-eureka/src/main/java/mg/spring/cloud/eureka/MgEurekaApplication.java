package mg.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/5-16:07
 */

@EnableEurekaServer
@SpringBootApplication
public class MgEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MgEurekaApplication.class,args);
    }
}
