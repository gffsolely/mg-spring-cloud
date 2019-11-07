package mg.spring.cloud.web.feign.services.fallback;

import mg.spring.cloud.web.feign.services.SApiService;
import org.springframework.stereotype.Component;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/6-17:33
 */
@Component
public class SApiServiceFallback implements SApiService {

    @Override
    public String getSay(String message) {
        return String.format(" error page  msg: %s",message);
    }
}
