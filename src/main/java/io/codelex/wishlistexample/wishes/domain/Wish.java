package io.codelex.wishlistexample.wishes.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String wish;

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
        if (!(o instanceof Wish wish1)) {
            return false;
        }
        return getId() == wish1.getId() && getWish().equals(wish1.getWish());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWish());
    }
}
