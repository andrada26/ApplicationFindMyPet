package com.example.ApplicationFindMyPet.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class Services {

    @Configuration
    @ComponentScan("com.baeldung.jdbc")
    public class SpringJdbcConfig {
        @Bean
        public DataSource mysqlDataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:1433/anm");
            dataSource.setUsername("sa");
            dataSource.setPassword("12345");

            return dataSource;
        }
    }

}
