package com.caio.screenmatch.models;

public class Serie extends Title{
    private int seasons; // quantidade de temporadas
    private boolean active;
    private int episodesBySeason; // quantidade de episodios por temporada
    private int minutesByEp;

    public Serie(String name, int year){
        super(name,year);
    }


    public int getSeasons() { return seasons; }
    public void setSeasons(int seasons) { this.seasons = seasons; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public int getEpisodesBySeason() { return episodesBySeason; }
    public void setEpisodesBySeason(int episodes) { this.episodesBySeason = episodes; }

    public int getMinutesByEp() { return minutesByEp; }
    public void setMinutesByEp(int minutesByEp) { this.minutesByEp = minutesByEp; }

    //sobrescrita
    @Override
    public int getDurationInMinutes() {
        return seasons * minutesByEp * episodesBySeason;
    }
    // ou seja nao se usa setDurationInMinutes() para as series
}
