package com.api.rickmorty.infrastructure.entities;

import com.api.rickmorty.domain.model.Location;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private String dimension;

    public LocationEntity() {
    }

    public LocationEntity(Integer id, String name, String type, String dimension) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dimension = dimension;
    }

    public static LocationEntity fromDomainModel(Location location){
        return new LocationEntity(location.getId(), location.getName(), location.getType(), location.getDimension());
    }

    public Location toDomainModel(){
        return new Location(id, name, type, dimension);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

}
