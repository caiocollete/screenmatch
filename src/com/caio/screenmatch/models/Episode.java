package com.caio.screenmatch.models;

import com.caio.screenmatch.calc.Classifiable;

public class Episode implements Classifiable {
    public Episode(Serie serie, int number){
        this.serie = serie;
        this.number = number;
        this.name = serie.getName()+"#"+number;
    }

    private int number;
    private String name;
    private Serie serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public Serie getSerie() {
        return serie;
    }


    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }




    @Override
    public int getClassification() {
        if(totalViews>100) return 4;
        else return 2;
    }
}
