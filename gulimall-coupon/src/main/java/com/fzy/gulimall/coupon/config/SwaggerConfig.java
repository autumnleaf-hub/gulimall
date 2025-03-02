package com.fzy.gulimall.coupon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * swagger 配置
 * @author fzy
 * @version 1.0
 * 创建时间：2025-03-01 12:04
 */

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fzy.**")) // 扫描 Controller 包
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Knife4j + Swagger2 示例 API")
                .description("这是一个使用 Knife4j 增强的 Swagger2 文档示例")
                .termsOfServiceUrl("https://github.com/xiaoymin/Knife4j")
                .version("1.0")
                .build();
    }
}
