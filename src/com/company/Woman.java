package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Max on 09.02.2016.
 */
public class Woman extends People {

    public Woman(boolean gender, String first_name, String second_name, float height, float weight) {
        super(gender, first_name, second_name, height, weight);
    }

    public Woman(){}

    @Override
    public boolean isGender() {
        return super.isGender();
    }

    @Override
    public String getFirst_name() {
        return super.getFirst_name();
    }

    @Override
    public String getSecond_name() {
        return super.getSecond_name();
    }

    @Override
    public float getHeight() {
        return super.getHeight();
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public void setGender(boolean gender) {
        super.setGender(gender);
    }

    @Override
    public void setFirst_name(String first_name) {
        super.setFirst_name(first_name);
    }

    @Override
    public void setSecond_name(String second_name) {
        super.setSecond_name(second_name);
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
    }

    @Override
    public void setWeight(float weight) {
        super.setWeight(weight);
    }

    @Override
    public boolean speak(People human) {
        return super.speak(human);
    }

    @Override
    public boolean withstand_community(People human) {
        return super.withstand_community(human);
    }

    @Override
    public boolean spend_time_together(People human) {
        return super.spend_time_together(human);
    }

    @Override
    People relationships(People human) {
        return super.relationships(human);
    }

    static People born_human(People father, People mother)
    {
        Random random = new Random();
        boolean human2 = random.nextBoolean();
        Scanner scanner = new Scanner(System.in);
        String name;
        if(human2 == true){Man child = new Man(true,
                name=scanner.next(),
                father.getSecond_name(),
                (float)(father.getHeight()+0.1*mother.getHeight()-father.getHeight()),
                (float)(father.getWeight()+0.1*mother.getWeight()-father.getWeight()));
        return child;
        }
        else{
            Woman child = new Woman(false,
                    name=scanner.next(),
                    father.getSecond_name(),
                    (float)(mother.getHeight()+0.1*father.getHeight()-mother.getHeight()),
                    (float)(mother.getWeight()+0.1*father.getWeight()-mother.getWeight()));
        return child;
        }
    }
}
