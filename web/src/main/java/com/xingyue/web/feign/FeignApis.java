package com.xingyue.web.feign;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "server-service", fallbackFactory = FeignClientFallbackFactory.class)
public interface FeignApis {
    @RequestMapping(value = "/test/get", method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestParam String name);
}


/**
 * FeignApis的fallbackFactory类，该类需实现FallbackFactory接口，并覆写create方法
 */
@Component
class FeignClientFallbackFactory implements FallbackFactory<FeignApis> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientFallbackFactory.class);

    @Override
    public FeignApis create(Throwable cause) {
        return new FeignApis() {
            @Override
            public String get(String name) {
                FeignClientFallbackFactory.LOGGER.info("fallback; reason was:", cause);
                System.out.println("name="+name);
                return "success:"+name;
            }
        };
    }
}