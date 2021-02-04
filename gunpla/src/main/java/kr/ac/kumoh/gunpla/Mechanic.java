package kr.ac.kumoh.gunpla;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mechanic {
    @Id
    private Integer id;
    private String name;
    private String model;
    private String manufacturer;
    private String armor;
    private Float height;
    private Float weight;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getArmor() {
        return armor;
    }
    
    public Float getHeight() {
        return height;
    }
    
    public Float getWeight() {
        return weight;
    }
}