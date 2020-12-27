package com.nijad.msflight.model;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "airline",
        "altitude",
        "arrival",
        "arrival_position",
        "departure",
        "departure_position",
        "flight",
        "groundspeed",
        "heading",
        "latitude",
        "longitude",
        "registration",
        "source",
        "station",
        "timestamp",
        "type",
        "verticalspeed"
})
public class FlightDto {

    @JsonProperty("airline")
    private String airline;
    @JsonProperty("altitude")
    private Integer altitude;
    @JsonProperty("arrival")
    private String arrival;
    @JsonProperty("arrival_position")
    private List<Double> arrivalPosition = null;
    @JsonProperty("departure")
    private String departure;
    @JsonProperty("departure_position")
    private List<Double> departurePosition = null;
    @JsonProperty("flight")
    private String flight;
    @JsonProperty("groundspeed")
    private Integer groundspeed;
    @JsonProperty("heading")
    private Integer heading;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("registration")
    private String registration;
    @JsonProperty("source")
    private String source;
    @JsonProperty("station")
    private String station;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("type")
    private String type;
    @JsonProperty("verticalspeed")
    private Integer verticalspeed;


    @JsonProperty("airline")
    public String getAirline() {
        return airline;
    }

    @JsonProperty("airline")
    public void setAirline(String airline) {
        this.airline = airline;
    }

    @JsonProperty("altitude")
    public Integer getAltitude() {
        return altitude;
    }

    @JsonProperty("altitude")
    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    @JsonProperty("arrival")
    public String getArrival() {
        return arrival;
    }

    @JsonProperty("arrival")
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("arrival_position")
    public List<Double> getArrivalPosition() {
        return arrivalPosition;
    }

    @JsonProperty("arrival_position")
    public void setArrivalPosition(List<Double> arrivalPosition) {
        this.arrivalPosition = arrivalPosition;
    }

    @JsonProperty("departure")
    public String getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @JsonProperty("departure_position")
    public List<Double> getDeparturePosition() {
        return departurePosition;
    }

    @JsonProperty("departure_position")
    public void setDeparturePosition(List<Double> departurePosition) {
        this.departurePosition = departurePosition;
    }

    @JsonProperty("flight")
    public String getFlight() {
        return flight;
    }

    @JsonProperty("flight")
    public void setFlight(String flight) {
        this.flight = flight;
    }

    @JsonProperty("groundspeed")
    public Integer getGroundspeed() {
        return groundspeed;
    }

    @JsonProperty("groundspeed")
    public void setGroundspeed(Integer groundspeed) {
        this.groundspeed = groundspeed;
    }

    @JsonProperty("heading")
    public Integer getHeading() {
        return heading;
    }

    @JsonProperty("heading")
    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("registration")
    public String getRegistration() {
        return registration;
    }

    @JsonProperty("registration")
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("station")
    public String getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(String station) {
        this.station = station;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("verticalspeed")
    public Integer getVerticalspeed() {
        return verticalspeed;
    }

    @JsonProperty("verticalspeed")
    public void setVerticalspeed(Integer verticalspeed) {
        this.verticalspeed = verticalspeed;
    }

}
