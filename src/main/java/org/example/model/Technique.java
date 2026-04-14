package org.example.model;

public class Technique {
    private String name;
    private String type;
    private String owner;
    private Integer damage;

    public Technique(String name, String type, String owner, Integer damage) {
        this.name = name;
        this.type = type;
        this.owner = owner;
        this.damage = damage;
    }

    public Technique() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Владелец: " + owner);
        System.out.println("Урон: " + damage);
    }
}
