package com.DI;

public class TeamAwesome3 {
    private DonkeyHulk3 donkeyHulk;
 
    public TeamAwesome3(DonkeyHulk3 donkeyHulk) {
        this.donkeyHulk = donkeyHulk;
    }
 
    public String rescue() {
        return donkeyHulk.walk() + " " + donkeyHulk.smash();
    }
}