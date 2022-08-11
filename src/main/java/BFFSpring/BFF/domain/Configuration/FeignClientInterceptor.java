package BFFSpring.BFF.domain.Configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class FeignClientInterceptor  implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template){
        template.header("myheaderkey","myvar1");
        log.warn("################");
    }

}