package mg.spring.cloud.service.api.controller;

import mg.spring.cloud.service.api.commons.utils.DateHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/5-18:04
 */
@RestController
@RequestMapping("/api/")
public class ApiController {

    @Value("${server.port}")
    private String post;

    @RequestMapping(value = "say",method = RequestMethod.GET)
    public String  getSay(@RequestParam(value = "message") String message){
        return String.format("mg, say test message is : %s  and server.port: %s  and time: %s .",message,post, DateHelper.getDate(DateHelper.DATE_PATTERN_REPORT_YMDHMS));
    }
}
