package inv.iashinyh.filter.config;

import inv.iashinyh.filter.filter.RequestLogFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class FilterConfig {

    @Bean
    @Order(1)
    public RequestLogFilter requestLogFilter() {
        return new RequestLogFilter();
    }
}
