package io.datajek.springmvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

public class Athlete {
    //	@NotEmpty(message = "This is a required field.")
    @NotNull(message = "This is a required field.")
    @Size(min=1, message = "This is a required field.")
    private String lastName;
    private String country;
    private String handedness;
    private String[] titles;


    public Athlete() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

}


