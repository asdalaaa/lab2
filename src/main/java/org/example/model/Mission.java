package org.example.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mission {
    private String missionId;
    private String date;
    private String location;
    private String outcome;
    private Integer damageCost;
    private Curse curse;
    private List<Sorcerer> sorcerers;
    private List<Technique> techniques;
    private EconomicAssessment economicAssessment;
    private CivilianImpact civilianImpact;
    private EnemyActivity enemyActivity;
    private EnvironmentConditions environmentConditions;
    private List<OperationTimeline> operationTimeline;
    private Map<String, Object> otherFields = new HashMap<>();

    public Mission(String missionId, String date, String location, String outcome, Integer damageCost, Curse curse, List<Sorcerer> sorcerers, List<Technique> techniques, EconomicAssessment economicAssessment, CivilianImpact civilianImpact, EnemyActivity enemyActivity, EnvironmentConditions environmentConditions, List<OperationTimeline> operationTimeline, Map<String, Object> otherFields) {
        this.missionId = missionId;
        this.date = date;
        this.location = location;
        this.outcome = outcome;
        this.damageCost = damageCost;
        this.curse = curse;
        this.sorcerers = sorcerers;
        this.techniques = techniques;
        this.economicAssessment = economicAssessment;
        this.civilianImpact = civilianImpact;
        this.enemyActivity = enemyActivity;
        this.environmentConditions = environmentConditions;
        this.operationTimeline = operationTimeline;
        this.otherFields = otherFields;
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Integer getDamageCost() {
        return damageCost;
    }

    public void setDamageCost(Integer damageCost) {
        this.damageCost = damageCost;
    }

    public Curse getCurse() {
        return curse;
    }

    public void setCurse(Curse curse) {
        this.curse = curse;
    }

    public List<Sorcerer> getSorcerers() {
        return sorcerers;
    }

    public void setSorcerers(List<Sorcerer> sorcerers) {
        this.sorcerers = sorcerers;
    }

    public List<Technique> getTechniques() {
        return techniques;
    }

    public void setTechniques(List<Technique> techniques) {
        this.techniques = techniques;
    }

    @JsonAnySetter
    public void setOtherField(String key, Object value) {
        otherFields.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getOtherFields() {
        return otherFields;
    }

    public void printInfo() {
        System.out.println("===========");
        System.out.println("Миссия: " + missionId);
        System.out.println("Дата: " + date);
        System.out.println("Локация: " + location);
        System.out.println("Исход: " + outcome);
        System.out.println("Ущерб: " + damageCost);
        System.out.println("\n===========");
        System.out.println("Проклятие: ");
        curse.printInfo();
        System.out.println("\n===========");
        System.out.println("Маги: ");
        for (int i=0; i<sorcerers.size(); i++) {
            sorcerers.get(i).printInfo();
        };
        System.out.println("\n===========");
        System.out.println("Техники: ");
        for (int i=0; i<techniques.size(); i++) {
            techniques.get(i).printInfo();
        };
        System.out.println("\n===========");
        for (Map.Entry<String, Object> entry:otherFields.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ": " + value + "\n===========");
        }

    }


    public EconomicAssessment getEconomicAssessment() {
        return economicAssessment;
    }

    public CivilianImpact getCivilianImpact() {
        return civilianImpact;
    }

    public EnemyActivity getEnemyActivity() {
        return enemyActivity;
    }

    public EnvironmentConditions getEnvironmentConditions() {
        return environmentConditions;
    }

    public List<OperationTimeline> getOperationTimeline() {
        return operationTimeline;
    }

    public void setEconomicAssessment(EconomicAssessment economicAssessment) {
        this.economicAssessment = economicAssessment;
    }

    public void setCivilianImpact(CivilianImpact civilianImpact) {
        this.civilianImpact = civilianImpact;
    }

    public void setEnemyActivity(EnemyActivity enemyActivity) {
        this.enemyActivity = enemyActivity;
    }

    public void setEnvironmentConditions(EnvironmentConditions environmentConditions) {
        this.environmentConditions = environmentConditions;
    }

    public void setOperationTimeline(List<OperationTimeline> operationTimeline) {
        this.operationTimeline = operationTimeline;
    }

    public void setOtherFields(Map<String, Object> otherFields) {
        this.otherFields = otherFields;
    }
}


