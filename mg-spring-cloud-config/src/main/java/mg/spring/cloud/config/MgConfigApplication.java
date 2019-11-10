package mg.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/9-15:04
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class MgConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(MgConfigApplication.class,args);
    }
}
