package com.iudigital.inventory.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"creationDate", "updateDate", "__v"})
public class InventoryDTO {

    @JsonProperty("_id")
    private String id;

    private String serial;

    private String model;

    private String description;

    private String photo;

    private String color;

    private String purchaseDate;

    private Double price;

    private UserDTO user;

    private BrandDTO brand;

    private StatusDTO equipmentStatus;

    private TypeDTO equipmentType;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the purchaseDate
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param purchaseDate the purchaseDate to set
     */
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the user
     */
    public UserDTO getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UserDTO user) {
        this.user = user;
    }

    /**
     * @return the brand
     */
    public BrandDTO getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(BrandDTO brand) {
        this.brand = brand;
    }

    /**
     * @return the equipmentStatus
     */
    public StatusDTO getEquipmentStatus() {
        return equipmentStatus;
    }

    /**
     * @param equipmentStatus the equipmentStatus to set
     */
    public void setEquipmentStatus(StatusDTO equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    /**
     * @return the equipmentType
     */
    public TypeDTO getEquipmentType() {
        return equipmentType;
    }

    /**
     * @param equipmentType the equipmentType to set
     */
    public void setEquipmentType(TypeDTO equipmentType) {
        this.equipmentType = equipmentType;
    }

}
