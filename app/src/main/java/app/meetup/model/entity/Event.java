package app.meetup.model.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.meetup.model.Venue;

public class Event {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description_raw")
    @Expose
    private String descriptionRaw;
    @SerializedName("description_html")
    @Expose
    private String descriptionHtml;
    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("schedule_permanent")
    @Expose
    private String schedulePermanent;
    @SerializedName("schedule_date_warning")
    @Expose
    private String scheduleDateWarning;
    @SerializedName("schedule_time_alert")
    @Expose
    private String scheduleTimeAlert;
    @SerializedName("schedule_start_date")
    @Expose
    private String scheduleStartDate;
    @SerializedName("schedule_start_time")
    @Expose
    private String scheduleStartTime;
    @SerializedName("schedule_end_date")
    @Expose
    private String scheduleEndDate;
    @SerializedName("schedule_end_time")
    @Expose
    private String scheduleEndTime;
    @SerializedName("schedule_one_day_event")
    @Expose
    private String scheduleOneDayEvent;
    @SerializedName("schedule_extra")
    @Expose
    private String scheduleExtra;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("going_count")
    @Expose
    private Integer goingCount;
    @SerializedName("went_count")
    @Expose
    private Integer wentCount;
    @SerializedName("venue")
    @Expose
    private Venue venue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionRaw() {
        return descriptionRaw;
    }

    public void setDescriptionRaw(String descriptionRaw) {
        this.descriptionRaw = descriptionRaw;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSchedulePermanent() {
        return schedulePermanent;
    }

    public void setSchedulePermanent(String schedulePermanent) {
        this.schedulePermanent = schedulePermanent;
    }

    public String getScheduleDateWarning() {
        return scheduleDateWarning;
    }

    public void setScheduleDateWarning(String scheduleDateWarning) {
        this.scheduleDateWarning = scheduleDateWarning;
    }

    public String getScheduleTimeAlert() {
        return scheduleTimeAlert;
    }

    public void setScheduleTimeAlert(String scheduleTimeAlert) {
        this.scheduleTimeAlert = scheduleTimeAlert;
    }

    public String getScheduleStartDate() {
        return scheduleStartDate;
    }

    public void setScheduleStartDate(String scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }

    public String getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public String getScheduleEndDate() {
        return scheduleEndDate;
    }

    public void setScheduleEndDate(String scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
    }

    public String getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public String getScheduleOneDayEvent() {
        return scheduleOneDayEvent;
    }

    public void setScheduleOneDayEvent(String scheduleOneDayEvent) {
        this.scheduleOneDayEvent = scheduleOneDayEvent;
    }

    public String getScheduleExtra() {
        return scheduleExtra;
    }

    public void setScheduleExtra(String scheduleExtra) {
        this.scheduleExtra = scheduleExtra;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getGoingCount() {
        return goingCount;
    }

    public void setGoingCount(Integer goingCount) {
        this.goingCount = goingCount;
    }

    public Integer getWentCount() {
        return wentCount;
    }

    public void setWentCount(Integer wentCount) {
        this.wentCount = wentCount;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

}