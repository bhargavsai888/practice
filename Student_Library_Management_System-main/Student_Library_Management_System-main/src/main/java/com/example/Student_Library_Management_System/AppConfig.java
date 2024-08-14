package com.example.Student_Library_Management_System;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import jakarta.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "com.example.Student_Library_Management_System.Mappers")
@MapperScan("com.example.Student_Library_Management_System.Mappers")
public class AppConfig {

    @Autowired
	DataSource dataSource;

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		return sessionFactory.getObject();
	}

	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager() {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(dataSource);
		return dataSourceTransactionManager;
	}

	// @Bean
    // public JdbcTemplate jdbcTemplate() {
    //     return new JdbcTemplate(dataSource);
    // }
	// @PostConstruct
    // public void init() throws Exception {
    //     try (BufferedReader reader = new BufferedReader(new InputStreamReader(
    //             new ClassPathResource("schema.sql").getInputStream(), StandardCharsets.UTF_8))) {
    //         StringBuilder sql = new StringBuilder();
    //         String line;
    //         while ((line = reader.readLine()) != null) {
    //             sql.append(line).append("\n");
    //         }
    //         jdbcTemplate().execute(sql.toString());
    //     }
    // }
}
