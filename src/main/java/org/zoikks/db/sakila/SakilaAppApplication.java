package org.zoikks.db.sakila;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zoikks.db.sakila.dao.FilmRepository;
import org.zoikks.db.sakila.model.Film;

/**
 *
 */
@SpringBootApplication
public class SakilaAppApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SakilaAppApplication.class);

    @Autowired
    private FilmRepository filmRepository;

    public static void main(String[] args) {
        SpringApplication.run(SakilaAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        LOGGER.debug("Looking for all films...");

        for (Film film : filmRepository.findAll()) {
            LOGGER.debug("Film: " + film.getTitle());
        }
    }
}