package com.wooread.wooreadnovel;

import com.wooread.wooreadbase.BaseApplication;
import cui.shibing.EnableCommonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCommonRepository
@EnableEurekaClient
@EnableFeignClients
@RestController
@PropertySource(value = "default-novel-class.properties")
public class NovelApplication extends BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(NovelApplication.class, args);
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("message");
        return messageSource;
    }
}
