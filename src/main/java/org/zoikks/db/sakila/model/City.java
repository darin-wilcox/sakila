package org.zoikks.db.sakila.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class City {
    private Short cityId;
    private String city;
    private Short countryId;
    private Timestamp lastUpdate;
    private Collection<Address> addressesByCityId;
    private Country countryByCountryId;

    @Id
    @Column(name = "city_id")
    public Short getCityId() {
        return cityId;
    }

    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country_id")
    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
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
        City city1 = (City) o;
        return Objects.equals(cityId, city1.cityId) &&
                Objects.equals(city, city1.city) &&
                Objects.equals(countryId, city1.countryId) &&
                Objects.equals(lastUpdate, city1.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, city, countryId, lastUpdate);
    }

    @OneToMany(mappedBy = "cityByCityId")
    public Collection<Address> getAddressesByCityId() {
        return addressesByCityId;
    }

    public void setAddressesByCityId(Collection<Address> addressesByCityId) {
        this.addressesByCityId = addressesByCityId;
    }

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id", nullable = false, insertable = false, updatable = false)
    public Country getCountryByCountryId() {
        return countryByCountryId;
    }

    public void setCountryByCountryId(Country countryByCountryId) {
        this.countryByCountryId = countryByCountryId;
    }
}
