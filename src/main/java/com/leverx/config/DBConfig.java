package com.leverx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.leverx"})
public class DBConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate();
    }

    @Bean
    public DataSource getDataSource() throws IOException {
        DriverManagerDataSource source = new DriverManagerDataSource();
        Properties DBProps = new Properties();
        DBProps.load(new FileInputStream("db.properties"));
        source.setUrl(DBProps.getProperty("url"));
        source.setUsername(DBProps.getProperty("user"));
        source.setPassword("password");
        return source;
    }
}
