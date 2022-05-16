package com.airbnb.airbnb.Models;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Listing {
    
    @Id
    private String _id;
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighborhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;
    private String property_type;   
    private String room_type;
    private String bed_type;
    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;
    private String last_scraped;
    private String calendar_last_scraped;
    private String first_review;
    private String last_review;
    private String accommodates;
    private String bedrooms;
    private String beds;
    public Listing(String _id, String listing_url, String name, String summary, String space, String description,
            String neighborhood_overview, String notes, String transit, String access, String interaction,
            String house_rules, String property_type, String room_type, String bed_type, String minimum_nights,
            String maximum_nights, String cancellation_policy, String last_scraped, String calendar_last_scraped,
            String first_review, String last_review, String accommodates, String bedrooms, String beds) {
        this._id = _id;
        this.listing_url = listing_url;
        this.name = name;
        this.summary = summary;
        this.space = space;
        this.description = description;
        this.neighborhood_overview = neighborhood_overview;
        this.notes = notes;
        this.transit = transit;
        this.access = access;
        this.interaction = interaction;
        this.house_rules = house_rules;
        this.property_type = property_type;
        this.room_type = room_type;
        this.bed_type = bed_type;
        this.minimum_nights = minimum_nights;
        this.maximum_nights = maximum_nights;
        this.cancellation_policy = cancellation_policy;
        this.last_scraped = last_scraped;
        this.calendar_last_scraped = calendar_last_scraped;
        this.first_review = first_review;
        this.last_review = last_review;
        this.accommodates = accommodates;
        this.bedrooms = bedrooms;
        this.beds = beds;
    }
    public String getListing_url() {
        return listing_url;
    }
    public String getBeds() {
        return beds;
    }
    public void setBeds(String beds) {
        this.beds = beds;
    }
    public String getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(String bedrooms) {
        this.bedrooms = bedrooms;
    }
    public String getAccommodates() {
        return accommodates;
    }
    public void setAccommodates(String accommodates) {
        this.accommodates = accommodates;
    }
    public String getLast_review() {
        return last_review;
    }
    public void setLast_review(String last_review) {
        this.last_review = last_review;
    }
    public String getFirst_review() {
        return first_review;
    }
    public void setFirst_review(String first_review) {
        this.first_review = first_review;
    }
    public String getCalendar_last_scraped() {
        return calendar_last_scraped;
    }
    public void setCalendar_last_scraped(String calendar_last_scraped) {
        this.calendar_last_scraped = calendar_last_scraped;
    }
    public String getLast_scraped() {
        return last_scraped;
    }
    public void setLast_scraped(String last_scraped) {
        this.last_scraped = last_scraped;
    }
    public String getCancellation_policy() {
        return cancellation_policy;
    }
    public void setCancellation_policy(String cancellation_policy) {
        this.cancellation_policy = cancellation_policy;
    }
    public String getMaximum_nights() {
        return maximum_nights;
    }
    public void setMaximum_nights(String maximum_nights) {
        this.maximum_nights = maximum_nights;
    }
    public String getMinimum_nights() {
        return minimum_nights;
    }
    public void setMinimum_nights(String minimum_nights) {
        this.minimum_nights = minimum_nights;
    }
    public String getBed_type() {
        return bed_type;
    }
    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }
    public String getProperty_type() {
        return property_type;
    }
    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }
    public String getRoom_type() {
        return room_type;
    }
    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }
    public String getHouse_rules() {
        return house_rules;
    }
    public void setHouse_rules(String house_rules) {
        this.house_rules = house_rules;
    }
    public String getInteraction() {
        return interaction;
    }
    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }
    public String getAccess() {
        return access;
    }
    public void setAccess(String access) {
        this.access = access;
    }
    public String getTransit() {
        return transit;
    }
    public void setTransit(String transit) {
        this.transit = transit;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getNeighborhood_overview() {
        return neighborhood_overview;
    }
    public void setNeighborhood_overview(String neighborhood_overview) {
        this.neighborhood_overview = neighborhood_overview;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSpace() {
        return space;
    }
    public void setSpace(String space) {
        this.space = space;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setListing_url(String listing_url) {
        this.listing_url = listing_url;
    }

}
