package com.Kotori.monitor;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

//public class HystrixStream {
//    @Bean
//    public ServletRegistrationBean getServlet(){
//        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
//        registrationBean.setLoadOnStartup(1);  //系统启动时加载顺序
//        registrationBean.addUrlMappings("/hystrix.stream");//路径
//        registrationBean.setName("HystrixMetricsStreamServlet");
//        return registrationBean;
//    }
//}
