package com.nest.restaurant;

public class FoodItems {
    Integer tea;
    Integer coffee;
    Integer juice;
    Integer sandwich;
    Integer burger;

    public FoodItems(Integer tea, Integer coffee, Integer juice, Integer sandwich, Integer burger) {
        this.tea = tea;
        this.coffee = coffee;
        this.juice = juice;
        this.sandwich = sandwich;
        this.burger = burger;
    }

    public Integer getTea() {
        return tea;
    }

    public void setTea(Integer tea) {
        this.tea = tea;
    }

    public Integer getCoffee() {
        return coffee;
    }

    public void setCoffee(Integer coffee) {
        this.coffee = coffee;
    }

    public Integer getJuice() {
        return juice;
    }

    public void setJuice(Integer juice) {
        this.juice = juice;
    }

    public Integer getSandwich() {
        return sandwich;
    }

    public void setSandwich(Integer sandwich) {
        this.sandwich = sandwich;
    }

    public Integer getBurger() {
        return burger;
    }

    public void setBurger(Integer burger) {
        this.burger = burger;
    }
}
