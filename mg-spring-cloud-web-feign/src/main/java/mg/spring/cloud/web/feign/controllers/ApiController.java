package mg.spring.cloud.web.feign.controllers;

import mg.spring.cloud.web.feign.services.SApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者： gff <gff_solely@163.com>
 * 日期： 2019/11/5-19:51
 */
@RestController
@RequestMapping("/web/api/")
public class ApiController {

    @Autowired
    SApiService apiService;

    @RequestMapping(value = "say",method= RequestMethod.GET)
    public String  getSay(@RequestParam String message) {
        return apiService.getSay(message);
    }
}
