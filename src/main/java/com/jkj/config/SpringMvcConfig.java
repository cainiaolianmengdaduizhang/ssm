package com.jkj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.jkj.controller","com.jkj.config"})
@EnableWebMvc
public class SpringMvcConfig  {

}
