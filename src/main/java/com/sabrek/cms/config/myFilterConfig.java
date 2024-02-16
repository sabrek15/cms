package com.sabrek.cms.config;

import com.sabrek.cms.filter.myNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myFilterConfig {

    public FilterRegistrationBean<myNewFilter> registrationBean() {
        FilterRegistrationBean<myNewFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new myNewFilter());
        registrationBean.addUrlPatterns("/customers/*");

        return registrationBean;
    }

}
