package org.zoikks.db.sakila.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Category {
    private Byte categoryId;
    private String name;
    private Timestamp lastUpdate;
    private Collection<FilmCategory> filmCategoriesByCategoryId;

    @Id
    @Column(name = "category_id")
    public Byte getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(categoryId, category.categoryId) &&
                Objects.equals(name, category.name) &&
                Objects.equals(lastUpdate, category.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, name, lastUpdate);
    }

    @OneToMany(mappedBy = "categoryByCategoryId")
    public Collection<FilmCategory> getFilmCategoriesByCategoryId() {
        return filmCategoriesByCategoryId;
    }

    public void setFilmCategoriesByCategoryId(Collection<FilmCategory> filmCategoriesByCategoryId) {
        this.filmCategoriesByCategoryId = filmCategoriesByCategoryId;
    }
}
