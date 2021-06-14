package com.cen.sec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceConfig.class, MybatisConfig.class})
public class AppConfig {
}
