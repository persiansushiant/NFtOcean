package com.mrgamification.nftocean.model;

import com.orm.SugarRecord;

public class Match extends SugarRecord<Match> {
    int WinnerId;
    int LooserId;
    int WinnerPoint;
    int LooserPoint;
    String feature;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Match(int winnerId, int looserId, int winnerPoint, int looserPoint, String feature) {
        WinnerId = winnerId;
        LooserId = looserId;
        WinnerPoint = winnerPoint;
        LooserPoint = looserPoint;
        this.feature = feature;
    }

    public  Match(){}

    public int getWinnerId() {
        return WinnerId;
    }

    public void setWinnerId(int winnerId) {
        WinnerId = winnerId;
    }

    public int getLooserId() {
        return LooserId;
    }

    public void setLooserId(int looserId) {
        LooserId = looserId;
    }

    public int getWinnerPoint() {
        return WinnerPoint;
    }

    public void setWinnerPoint(int winnerPoint) {
        WinnerPoint = winnerPoint;
    }

    public int getLooserPoint() {
        return LooserPoint;
    }

    public void setLooserPoint(int looserPoint) {
        LooserPoint = looserPoint;
    }

    public Match(int winnerId, int looserId, int winnerPoint, int looserPoint) {
        WinnerId = winnerId;
        LooserId = looserId;
        WinnerPoint = winnerPoint;
        LooserPoint = looserPoint;
    }
}
