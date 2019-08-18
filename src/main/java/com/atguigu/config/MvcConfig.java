package com.atguigu.config;


import com.atguigu.filter.MyFilter;
import com.atguigu.listener.MyListener;
import com.atguigu.servlet.MyServlet;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import java.util.Arrays;

@Configuration
public class MvcConfig {
    //注册servlet
    @Bean
    public ServletRegistrationBean myservlet(){
        ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return servletRegistrationBean;
    }
    //注册filter
    @Bean
    public FilterRegistrationBean myfilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet"));
        return filterRegistrationBean;
    }
    //注册listener
    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<MyListener> servletListenerRegistrationBean=new ServletListenerRegistrationBean<>(new MyListener());
        return servletListenerRegistrationBean;
    }




    @Bean
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
            return new EmbeddedServletContainerCustomizer() {
                //定制嵌入式servelt容器相关的规则
                @Override
                public void customize(ConfigurableEmbeddedServletContainer container) {
                    container.setPort(8090);
                    container.setDisplayName("baidu");
                }
            };
    }
}
