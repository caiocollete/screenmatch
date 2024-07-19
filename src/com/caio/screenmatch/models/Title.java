package com.caio.screenmatch.models;

import com.caio.screenmatch.exceptions.NumberLengthError;

public class Title implements Comparable<Title>  {
    private String name;
    private int year;
    private boolean includesOnPlan;
    private double rating=0;
    private int totalRating=0;
    private int runtime;

    public Title(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public Title(TitleOMDB record){
        this.name=record.title();

        if(record.year().length()>4){
            throw new NumberLengthError("Number over than 4 character.");
        }
        else{
            this.year=Integer.valueOf(record.year());
        }

        this.runtime = Integer.valueOf(record.runtime().substring(0,2));
    }


    //Getters
    public String getName(){return name;}
    public int getDurationInMinutes() { return runtime; }
    public double getRating() {return rating/totalRating; }
    public int getYear() {return year; }


    //Setters
    public void setName(String name){this.name = name;}
    public void setYear(int year){this.year=year;}
    public void setIncludesOnPlan(boolean includesOnPlan){this.includesOnPlan=includesOnPlan;}
    public void setRating(double rate){
        totalRating+=1;
        rating += rate;
    }
    public void setDurationInMinutes(int durationInMinutes) { this.runtime = durationInMinutes; }

    //Methods
    public void showDatasheet(){
        System.out.printf("name: %s\nyear: %d\nplan: %b\nrating: %.2f\n",name,year,includesOnPlan,rating/totalRating);
    }
    public void showName(){
        System.out.printf("%s\n",name);
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString(){
        return "{Title:"+this.getName()+","+"Year:"+this.getYear()+","+"Runtime:"+this.getDurationInMinutes()+"}";
    }
}
