package com.DI;

public class TeamAwesome {
	private DonkeyHulk donkeyHulk;
	 
    public void setDonkeyHulk(DonkeyHulk donkeyHulk) {
        this.donkeyHulk = donkeyHulk;
    }
 
    public String rescue() {
        return donkeyHulk.walk() + " " + donkeyHulk.smash();
    }
}
