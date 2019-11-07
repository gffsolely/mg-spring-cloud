package mg.spring.cloud.web.feign.services;

import mg.spring.cloud.web.feign.services.fallback.SApiServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/6-16:37
 */

@FeignClient(value = "MG-SPRING-CLOUD-SERVICE-API", path ="/api", fallback = SApiServiceFallback.class )
public interface SApiService {

    @RequestMapping(value = "say", method = RequestMethod.GET)
    public String getSay(@RequestParam(value = "message") String message);
}
