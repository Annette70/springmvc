package edu.wctc.travel;

public class ExchangeStudent {
    private String homeCountry;
    private String hostCountry;
    private int gradeLevel;
    private String semester;
    private TravelMethod travelMethod;
    private String[] spokenLanguages;

    public ExchangeStudent(){}

    public TravelMethod getTravelMethod() {
        return travelMethod;
    }

    public void setTravelMethod(TravelMethod travelMethod) {
        this.travelMethod = travelMethod;
    }

    public String[] getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(String[] spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    public String getHostCountry() {
        return hostCountry;
    }

    public void setHostCountry(String hostCountry) {
        this.hostCountry = hostCountry;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
