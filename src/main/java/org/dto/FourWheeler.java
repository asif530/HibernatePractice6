package org.dto;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle{

    private String doors;

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }
}
