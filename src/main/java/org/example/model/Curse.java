package org.example.model;

public class Curse {
    private String name;
    private String threatLevel;

    public Curse(String name, String threatLevel) {
        this.name = name;
        this.threatLevel = threatLevel;
    }

    public Curse() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    public void printInfo(){
        System.out.println("Название: " + name);
        System.out.println("Уровень угрозы: " + threatLevel);
    }
}

