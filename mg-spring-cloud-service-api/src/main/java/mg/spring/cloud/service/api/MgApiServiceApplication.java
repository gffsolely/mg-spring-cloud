package mg.spring.cloud.service.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/5-17:59
 */

@EnableDiscoveryClient
@SpringBootApplication
public class MgApiServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MgApiServiceApplication.class, args);
    }
}
