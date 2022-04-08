package com.example.examfinal.model.binding;

import com.example.examfinal.model.entity.CityEntity;
import com.example.examfinal.model.entity.enums.NameType;
import com.example.examfinal.model.entity.enums.RatingEnum;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class PlaceUpdateBingdingModel {
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

//    @NotBlank
    private String photos;
    private String photosImagePath;
    @NotNull
    private RatingEnum rating;

    @NotNull
    private NameType type;

    @NotNull
    private BigDecimal price;

    @NotNull
    private Double time;

    private String latitude;

    private String longitude;

    private Boolean naturalSites;

    public String getPhotosImagePath() {
        return photosImagePath;
    }

    public void setPhotosImagePath(String photosImagePath) {
        this.photosImagePath = photosImagePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public RatingEnum getRating() {
        return rating;
    }

    public void setRating(RatingEnum rating) {
        this.rating = rating;
    }

    public NameType getType() {
        return type;
    }

    public void setType(NameType type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Boolean getNaturalSites() {
        return naturalSites;
    }

    public void setNaturalSites(Boolean naturalSites) {
        this.naturalSites = naturalSites;
    }
}
