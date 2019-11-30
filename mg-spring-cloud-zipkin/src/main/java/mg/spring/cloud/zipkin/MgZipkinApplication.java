package mg.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/30-19:13
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class MgZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(MgZipkinApplication.class,args);
    }
}
