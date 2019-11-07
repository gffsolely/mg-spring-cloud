package mg.spring.cloud.web.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/5-19:40
 */
@EnableHystrixDashboard
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MgClientFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(MgClientFeignApplication.class,args);
    }
}
