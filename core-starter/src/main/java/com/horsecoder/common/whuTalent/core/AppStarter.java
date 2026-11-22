package com.horsecoder.common.whuTalent.core;

import cc.eamon.open.flow.spring.scanner.FlowScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients(basePackages = {
})
@EnableDiscoveryClient
@EnableCaching
@ServletComponentScan("com.horsecoder.common.whuTalent.core")
@EnableTransactionManagement
@MapperScan(value = {
        "com.horsecoder.common.whuTalent.core.datainterface"
})
@EnableSwagger2
@ComponentScan(basePackages = {
        "com.horsecoder.common.whuTalent.core",
})
@FlowScan(flowPackages = {
        "com.horsecoder.common.whuTalent.core.flow",
        "com.horsecoder.common.whuTalent.core",
})
public class AppStarter {

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }

}