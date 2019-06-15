package org.zoikks.db.sakila.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 *
 * Configuration for DAO interactions with the Sakila database.
 *
 */
@Configuration
@ConfigurationProperties(prefix = "sakila.datasource")
public class SakilaConfig extends HikariConfig {

    @Bean
    public DataSource dataSource() {
        return new HikariDataSource(this);
    }
}