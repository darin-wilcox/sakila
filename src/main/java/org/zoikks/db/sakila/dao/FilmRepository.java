package org.zoikks.db.sakila.dao;

import org.springframework.data.repository.CrudRepository;
import org.zoikks.db.sakila.model.Film;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film, Short> {

    @Override
    List<Film> findAll();

    @Override
    Film save(Film film);
}