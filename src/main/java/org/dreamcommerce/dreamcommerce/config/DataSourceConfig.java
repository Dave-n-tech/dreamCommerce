package org.dreamcommerce.dreamcommerce.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
//    @Bean
//    public DataSource dataSource() {
//        try(HikariDataSource dataSource = new HikariDataSource()){
//            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//            dataSource.setJdbcUrl("jdbc:mysql://localhost:3308/dreamCommerce?createDatabaseIfNotExists=true");
//            dataSource.setUsername("root");
//            dataSource.setPassword("david_password");
//
//            return dataSource;
//        }
//
//    }
}
