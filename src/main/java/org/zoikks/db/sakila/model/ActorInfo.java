package org.zoikks.db.sakila.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "actor_info", schema = "sakila", catalog = "")
public class ActorInfo {
    private Short actorId;
    private String firstName;
    private String lastName;
    private String filmInfo;

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid;

    @Basic
    @Column(name = "actor_id")
    public Short getActorId() {
        return actorId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "film_info")
    public String getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(String filmInfo) {
        this.filmInfo = filmInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorInfo actorInfo = (ActorInfo) o;
        return Objects.equals(actorId, actorInfo.actorId) &&
                Objects.equals(firstName, actorInfo.firstName) &&
                Objects.equals(lastName, actorInfo.lastName) &&
                Objects.equals(filmInfo, actorInfo.filmInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, firstName, lastName, filmInfo);
    }
}
