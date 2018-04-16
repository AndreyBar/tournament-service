package com.tournament;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Tournament {
    private Long id;
    private String name;
    private Date beginDate;
    private Date endDate;
    private String country;
    private List<Long> teams;

    Tournament() {}

    Tournament(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getTeams() {
        return teams;
    }

    public void setTeams(List<Long> teamList) {
        this.teams = teamList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
