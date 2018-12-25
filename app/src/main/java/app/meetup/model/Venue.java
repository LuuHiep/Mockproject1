package app.meetup.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("permanent")
    @Expose
    private Integer permanent;
    @SerializedName("contact_fee")
    @Expose
    private String contactFee;
    @SerializedName("contact_phone")
    @Expose
    private String contactPhone;
    @SerializedName("contact_fax")
    @Expose
    private String contactFax;
    @SerializedName("contact_web")
    @Expose
    private String contactWeb;
    @SerializedName("contact_web_lang")
    @Expose
    private String contactWebLang;
    @SerializedName("contact_address")
    @Expose
    private String contactAddress;
    @SerializedName("contact_access")
    @Expose
    private String contactAccess;
    @SerializedName("contact_discount")
    @Expose
    private Integer contactDiscount;
    @SerializedName("contact_discount_details")
    @Expose
    private String contactDiscountDetails;
    @SerializedName("geo_area")
    @Expose
    private String geoArea;
    @SerializedName("geo_long")
    @Expose
    private String geoLong;
    @SerializedName("geo_lat")
    @Expose
    private String geoLat;
    @SerializedName("schedule_openinghour")
    @Expose
    private String scheduleOpeninghour;
    @SerializedName("schedule_closinghour")
    @Expose
    private String scheduleClosinghour;
    @SerializedName("schedule_breakstart")
    @Expose
    private Boolean scheduleBreakstart;
    @SerializedName("schedule_breakend")
    @Expose
    private Boolean scheduleBreakend;
    @SerializedName("schedule_openingdetails")
    @Expose
    private String scheduleOpeningdetails;
    @SerializedName("schedule_closed")
    @Expose
    private String scheduleClosed;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPermanent() {
        return permanent;
    }

    public void setPermanent(Integer permanent) {
        this.permanent = permanent;
    }

    public String getContactFee() {
        return contactFee;
    }

    public void setContactFee(String contactFee) {
        this.contactFee = contactFee;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    public String getContactWeb() {
        return contactWeb;
    }

    public void setContactWeb(String contactWeb) {
        this.contactWeb = contactWeb;
    }

    public String getContactWebLang() {
        return contactWebLang;
    }

    public void setContactWebLang(String contactWebLang) {
        this.contactWebLang = contactWebLang;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactAccess() {
        return contactAccess;
    }

    public void setContactAccess(String contactAccess) {
        this.contactAccess = contactAccess;
    }

    public Integer getContactDiscount() {
        return contactDiscount;
    }

    public void setContactDiscount(Integer contactDiscount) {
        this.contactDiscount = contactDiscount;
    }

    public String getContactDiscountDetails() {
        return contactDiscountDetails;
    }

    public void setContactDiscountDetails(String contactDiscountDetails) {
        this.contactDiscountDetails = contactDiscountDetails;
    }

    public String getGeoArea() {
        return geoArea;
    }

    public void setGeoArea(String geoArea) {
        this.geoArea = geoArea;
    }

    public String getGeoLong() {
        return geoLong;
    }

    public void setGeoLong(String geoLong) {
        this.geoLong = geoLong;
    }

    public String getGeoLat() {
        return geoLat;
    }

    public void setGeoLat(String geoLat) {
        this.geoLat = geoLat;
    }

    public String getScheduleOpeninghour() {
        return scheduleOpeninghour;
    }

    public void setScheduleOpeninghour(String scheduleOpeninghour) {
        this.scheduleOpeninghour = scheduleOpeninghour;
    }

    public String getScheduleClosinghour() {
        return scheduleClosinghour;
    }

    public void setScheduleClosinghour(String scheduleClosinghour) {
        this.scheduleClosinghour = scheduleClosinghour;
    }

    public Boolean getScheduleBreakstart() {
        return scheduleBreakstart;
    }

    public void setScheduleBreakstart(Boolean scheduleBreakstart) {
        this.scheduleBreakstart = scheduleBreakstart;
    }

    public Boolean getScheduleBreakend() {
        return scheduleBreakend;
    }

    public void setScheduleBreakend(Boolean scheduleBreakend) {
        this.scheduleBreakend = scheduleBreakend;
    }

    public String getScheduleOpeningdetails() {
        return scheduleOpeningdetails;
    }

    public void setScheduleOpeningdetails(String scheduleOpeningdetails) {
        this.scheduleOpeningdetails = scheduleOpeningdetails;
    }

    public String getScheduleClosed() {
        return scheduleClosed;
    }

    public void setScheduleClosed(String scheduleClosed) {
        this.scheduleClosed = scheduleClosed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
