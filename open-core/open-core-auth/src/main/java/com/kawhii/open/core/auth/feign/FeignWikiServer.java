
package com.kawhii.open.core.auth.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Carl
 * @version 创建时间：2018/1/18
 * @since 1.0.0
 */
@FeignClient("wiki")
public interface FeignWikiServer {
    @RequestMapping("/name")
    String name(@RequestParam(value = "name") String name);
}
