package io.codelex.wishlistexample.wishes.domain;

import org.hibernate.Hibernate;

import javax.persistence.*;

@Entity
@Table
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String wish;

    public Wish(String wish) {
        this.wish = wish;
    }

    public Wish() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + wish + "| ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Wish wish = (Wish) o;
        return false;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
