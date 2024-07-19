package com.caio.screenmatch.calc;
import com.caio.screenmatch.models.Title;

public class CalculateTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title t){
        totalTime += t.getDurationInMinutes();
    }
}
