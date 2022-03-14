package com.cjss;

public class Location {
    private String locationId;
    private String locationName;// Hyderabad, chennai, London
    private String locationCountry;// India, United Kingdom

    public Location(String locationId, String locationName, String locationCountry) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationCountry = locationCountry;
    }

    public String getLocationId() {return locationId;}

    public void setLocationId(String locationId) {this.locationId = locationId;}

    public String getLocationName() {return locationName;}

    public void setLocationName(String locationName) {this.locationName = locationName;}

    public String getLocationCountry() {return locationCountry;}

    public void setLocationCountry(String locationCountry) {this.locationCountry = locationCountry;}

}
