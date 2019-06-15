package org.zoikks.db.sakila.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Language {
    private Byte languageId;
    private String name;
    private Timestamp lastUpdate;
    private Collection<Film> filmsByLanguageId;
    private Collection<Film> filmsByLanguageId_0;

    @Id
    @Column(name = "language_id")
    public Byte getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
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
        Language language = (Language) o;
        return Objects.equals(languageId, language.languageId) &&
                Objects.equals(name, language.name) &&
                Objects.equals(lastUpdate, language.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageId, name, lastUpdate);
    }

    @OneToMany(mappedBy = "languageByLanguageId")
    public Collection<Film> getFilmsByLanguageId() {
        return filmsByLanguageId;
    }

    public void setFilmsByLanguageId(Collection<Film> filmsByLanguageId) {
        this.filmsByLanguageId = filmsByLanguageId;
    }

    @OneToMany(mappedBy = "languageByOriginalLanguageId")
    public Collection<Film> getFilmsByLanguageId_0() {
        return filmsByLanguageId_0;
    }

    public void setFilmsByLanguageId_0(Collection<Film> filmsByLanguageId_0) {
        this.filmsByLanguageId_0 = filmsByLanguageId_0;
    }
}
