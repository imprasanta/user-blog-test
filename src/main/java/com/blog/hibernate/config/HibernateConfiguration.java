package com.blog.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@PropertySource(value = "classpath:blog_dev.properties")
public class HibernateConfiguration {

	@Value("${accubits.blog.driver-class-name}")
	private String driverClassName;

	@Value("${accubits.blog.hibernate.url}")
	private String url;

	@Value("${accubits.blog.hibernate.username}")
	private String userName;

	@Value("${accubits.blog.hibernate.datasource.password}")
	private String password;

	@Value("${accubits.blog.hibernate.show-sql}")
	private String showSql;

	@Value("${accubits.blog.hibernate.hibernate.dialect}")
	private String dialect;

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan("com.blog");
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		dataSource.setUrl(url);
		return dataSource;
	}

	@Bean
	public Properties hibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", dialect);
		hibernateProperties.put("hibernate.show_sql", showSql);
		return hibernateProperties;
	}

}
