package com.webAdmin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * Created by Leo.
 * User: notho
 * Date: 2022-07-18, Time: 오후 2:17
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(new CustomInterceptor());
    }

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/to-login").setViewName("login");
//        registry.addViewController("/login").setViewName("login");
//        registry.addViewController("/error").setViewName("error");
//        registry.addViewController("/403").setViewName("error/403");
//        registry.addViewController("/401").setViewName("error/401");
//        registry.addViewController("/404").setViewName("error/404");
//    }
//    @Bean
//    MappingJackson2JsonView jsonView(){
//        return new MappingJackson2JsonView();
//    }


}
