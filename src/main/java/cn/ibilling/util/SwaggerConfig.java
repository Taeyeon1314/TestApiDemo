package cn.ibilling.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 指定API文档页的标题和描述信息等内容。
 *
 * @author Taeyeon
 * @createTime 2019-10-29-17:11
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.ibilling.controller"))//这里是controller所处的包名
                .paths(PathSelectors.any())
                .build();
    }

    //构建api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("计费账务系统")
                //描述
                .description("计费账务系统Api接口文档")
                .termsOfServiceUrl("API terms of service")
                //版本号s
                .version("1.0")
                .build();
    }
}
