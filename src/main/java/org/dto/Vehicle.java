package org.dto;
import org.service.Brand;

import javax.persistence.*;

/*
*
*
*
*
* */
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "ClassName", discriminatorType = DiscriminatorType.STRING)
public class Vehicle  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int vehicleId;
    private String vehicleName;

    private Brand brand = new Brand();

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
