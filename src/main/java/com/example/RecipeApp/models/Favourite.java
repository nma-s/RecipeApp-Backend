package com.example.RecipeApp.models;

import jakarta.persistence.*;

@Entity
public class Favourite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    Favourite -> User
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public Meal getMeal(){
        return meal;
    }

    public void setMeal(Meal meal){
        this.meal = meal;
    }
}
