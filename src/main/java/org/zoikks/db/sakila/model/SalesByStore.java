package org.zoikks.db.sakila.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "sales_by_store", schema = "sakila", catalog = "")
public class SalesByStore {
    private String store;
    private String manager;
    private BigDecimal totalSales;

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid;

    @Basic
    @Column(name = "store")
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Basic
    @Column(name = "manager")
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
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
        SalesByStore that = (SalesByStore) o;
        return Objects.equals(store, that.store) &&
                Objects.equals(manager, that.manager) &&
                Objects.equals(totalSales, that.totalSales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, manager, totalSales);
    }
}
