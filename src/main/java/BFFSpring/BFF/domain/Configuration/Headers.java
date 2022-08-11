package BFFSpring.BFF.domain.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Headers {

    @Bean(name ="header")
    public String applicationName()
    {
        return "Sistema de vendas";
    }
}
