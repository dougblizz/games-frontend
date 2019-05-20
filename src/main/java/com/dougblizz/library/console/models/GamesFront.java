package com.dougblizz.library.console.models;

public class GamesFront {

    private int id;

    private String name;

    private String type;

    private Boolean isOnline;

    private Boolean isPaid;

    public GamesFront() {
    }

    public GamesFront(int id, String name, String type, Boolean isOnline, Boolean isPaid) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.isOnline = isOnline;
        this.isPaid = isPaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return "GamesFront{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isOnline=" + isOnline +
                ", isPaid=" + isPaid +
                '}';
    }
}
