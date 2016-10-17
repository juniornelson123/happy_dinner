package com.example.junior.happydinner.models;

/**
 * Created by junior on 27/07/16.
 */
public class Establishment {
    private String name;
    private String category;
    private String location;
    private String hour_opened;
    private int user_id;
    private int menu_id;
    private boolean delivery;

    public Establishment(String name,String category,String location,int user_id,int menu_id,boolean delivery){
        this.setName(name);
        this.setCategory(category);
        this.setLocation(location);
        this.setUser_id(user_id);
        this.setMenu_id(menu_id);
        this.setDelivery(delivery);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHour_opened() {
        return hour_opened;
    }

    public void setHour_opened(String hour_opened) {
        this.hour_opened = hour_opened;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
}
