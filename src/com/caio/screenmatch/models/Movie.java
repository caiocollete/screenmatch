package com.caio.screenmatch.models;

import com.caio.screenmatch.calc.Classifiable;

// TODO FILME EH UM TITULO
public class Movie extends Title implements Classifiable {

    private String director;

    public Movie(String name, int year) {
        super(name, year);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (getRating()/2);
    }

    @Override
    public String toString() {
        return "Filme: " +this.getName() + " (" +this.getYear() + ")";
    }
}
