package com.apress.springrecipes.court.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * Configuration class to setup Spring MVC.
 *
 * @author Marten Deinum
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.apress.springrecipes.court.web")
public class WebConfiguration {

//   @Bean
//    public ViewResolver internalResourceViewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/jsp/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
    @Bean
    public TemplateResolver templateResolver(){
        ServletContextTemplateResolver sctr = new ServletContextTemplateResolver();
        sctr.setPrefix("/WEB-INF/jsp/");
        sctr.setSuffix(".html");

        sctr.setTemplateMode("HTML5");
        return  sctr;
    }
    @Bean
    public SpringTemplateEngine templateEngine(){
        SpringTemplateEngine te = new SpringTemplateEngine();
        te.setTemplateResolver(templateResolver());
        return te;
    }

    @Bean
    public ThymeleafViewResolver viewResolver(){
        ThymeleafViewResolver tr = new ThymeleafViewResolver();
        tr.setTemplateEngine(templateEngine());
        return tr;
    }


}
