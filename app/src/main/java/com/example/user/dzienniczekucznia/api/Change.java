package com.example.user.dzienniczekucznia.api;

public class Change {
    String subject;
    Long id;
    String name;
    String typeOfActivities;
    Integer mark;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getTypeOfActivities() {
        return typeOfActivities;
    }

    public Integer getSmark() {
        return mark;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfActivities(String typeOfActivities) {
        this.typeOfActivities = typeOfActivities;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
    // public String getSubject() {
     //   return subject;
   // }

   // public void setSubject(String subject) {
      //  this.subject = subject;
    //}
}