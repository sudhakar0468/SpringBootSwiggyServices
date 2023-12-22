package com.sudhakar.sample.SpringBootSample.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "swiggy")
public class Swiggy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int swiggyID;
    private String swiggyName;

    private String swigyDescription;

    public int getSwiggyID() {
        return swiggyID;
    }

    public void setSwiggyID(int swiggyID) {
        this.swiggyID = swiggyID;
    }

    public String getSwiggyName() {
        return swiggyName;
    }

    public void setSwiggyName(String swiggyName) {
        this.swiggyName = swiggyName;
    }

    public String getSwigyDescription() {
        return swigyDescription;
    }

    public void setSwigyDescription(String swigyDescription) {
        this.swigyDescription = swigyDescription;
    }
}
