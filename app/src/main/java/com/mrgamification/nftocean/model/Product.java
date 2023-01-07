package com.mrgamification.nftocean.model;

import com.orm.SugarRecord;

public class Product extends SugarRecord<Product> {
    String name;
    String imgSRC;
    int level;
    int AScore;
    int BScore;
    int CScore;
    int DScore;
    int EScore;
    int totalScore;
    int AuthorId;
    String link;

    public Product(String name, String imgSRC, int level, int AScore, int BScore, int CScore, int DScore, int EScore, int totalScore, int authorId, String link) {
        this.name = name;
        this.imgSRC = imgSRC;
        this.level = level;
        this.AScore = AScore;
        this.BScore = BScore;
        this.CScore = CScore;
        this.DScore = DScore;
        this.EScore = EScore;
        this.totalScore = totalScore;
        AuthorId = authorId;
        this.link = link;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(int authorId) {
        AuthorId = authorId;
    }

    public Product(String name, String imgSRC, int level, int AScore, int BScore, int CScore, int DScore, int EScore, int totalScore, int authorId) {
        this.name = name;
        this.imgSRC = imgSRC;
        this.level = level;
        this.AScore = AScore;
        this.BScore = BScore;
        this.CScore = CScore;
        this.DScore = DScore;
        this.EScore = EScore;
        this.totalScore = totalScore;
        AuthorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgSRC() {
        return imgSRC;
    }

    public void setImgSRC(String imgSRC) {
        this.imgSRC = imgSRC;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAScore() {
        return AScore;
    }

    public void setAScore(int AScore) {
        this.AScore = AScore;
    }

    public int getBScore() {
        return BScore;
    }

    public void setBScore(int BScore) {
        this.BScore = BScore;
    }

    public int getCScore() {
        return CScore;
    }

    public void setCScore(int CScore) {
        this.CScore = CScore;
    }

    public int getDScore() {
        return DScore;
    }

    public void setDScore(int DScore) {
        this.DScore = DScore;
    }

    public int getEScore() {
        return EScore;
    }

    public void setEScore(int EScore) {
        this.EScore = EScore;
    }

    public Product(String name, String imgSRC, int level, int AScore, int BScore, int CScore, int DScore, int EScore) {
        this.name = name;
        this.imgSRC = imgSRC;
        this.level = level;
        this.AScore = AScore;
        this.BScore = BScore;
        this.CScore = CScore;
        this.DScore = DScore;
        this.EScore = EScore;
    }

    public Product() {
    }

}
