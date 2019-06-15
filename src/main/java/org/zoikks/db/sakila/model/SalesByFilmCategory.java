package org.zoikks.db.sakila.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "sales_by_film_category", schema = "sakila", catalog = "")
public class SalesByFilmCategory {
    private String category;
    private BigDecimal totalSales;

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid;

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "total_sales")
    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesByFilmCategory that = (SalesByFilmCategory) o;
        return Objects.equals(category, that.category) &&
                Objects.equals(totalSales, that.totalSales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, totalSales);
    }
}
