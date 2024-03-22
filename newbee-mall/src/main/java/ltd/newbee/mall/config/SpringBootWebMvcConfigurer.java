package ltd.newbee.mall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class SpringBootWebMvcConfigurer {

    @Configuration
    public class NeeBeeMallWebMvcConfigurer implements WebMvcConfigurer {

        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/upload/**").addResourceLocations("file:D:\\upload\\");
        }
    }

}
