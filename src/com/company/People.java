package com.company;
import java.util.Random;

import java.util.Objects;

/**
 * Created by Max on 06.02.2016.
 */
public abstract class People {
    private boolean gender;     //true - мужчина, false - женщина
    private String first_name;
    private String second_name;
    private float height;
    private float weight;


    public People(boolean gender, String first_name, String second_name, float height, float weight) {
        this.gender = gender;
        this.first_name = first_name;
        this.second_name = second_name;
        this.height = height;
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean equals(Object obj)
    {
        if(obj == this) return  true;
        if(obj == null) return false;
        if(getClass() == obj.getClass()) return true;
        else return false;
    }

    public boolean speak(People human)
    {
        Random rand = new Random();
        if(getClass() == Woman.class && human.getClass() == Woman.class) return true;
        if(getClass() == Woman.class && human.getClass() == Man.class) return true;
        if(getClass() == Man.class && human.getClass() == Woman.class) return true;
        if(getClass() == Man.class && human.getClass() == Man.class) return rand.nextBoolean();
        else return false;

    }

    public boolean withstand_community(People human)
    {
        Random rand = new Random();
        if(getClass() == Woman.class && human.getClass() == Woman.class) return true;
        if(getClass() == Woman.class && human.getClass() == Man.class) return true;
        if(getClass() == Man.class && human.getClass() == Woman.class) return true;
        if(getClass() == Man.class && human.getClass() == Man.class) return rand.nextBoolean();
        else return false;
    }

    public boolean spend_time_together(People human)
    {
        Random rand = new Random();
        double diff = 0.1;  //different between height
        if(diff < ((this.getHeight()-human.getHeight())/((this.getHeight() + human.getHeight())/2))*100) return rand.nextBoolean();
        if(diff > ((this.getHeight()-human.getHeight())/((this.getHeight() + human.getHeight())/2))*100) return rand.nextBoolean();
        else return false;
    }

    People relationships(People human)
    {
        if(this.speak(human)==true && this.withstand_community(human)==true && this.spend_time_together(human)==true)
        {
            if(this.getClass() == human.getClass()){return null;}
            else return null;
        }
        else return null;
    }
}
