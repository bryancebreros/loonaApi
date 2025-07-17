package com.bryan.loonaapi;

import javax.persistence.Entity;

import java.time.LocalDate;
import java.time.Period;

@Entity
public class Member {
    @Id
    private Short id;
    private String name;
    private String colorCode;
    private localDate bornDate;

    public Member(String name, String colorCode, LocalDate bornDate) {
        this.name = name;
        this.colorCode = colorCode;
        this.bornDate = bornDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public localDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(localDate bornDate) {
        this.bornDate = bornDate;
    }

    public int getAge() {
        if (bornDate == null) {
            return 0;
        }
        return Period.between(bornDate, LocalDate.now()).getYears();
    }
}
