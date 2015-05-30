package com.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamAwesome2 {
    //Auto wire at Field Level
	
	@Autowired
    private DonkeyHulk2 donkeyHulk;
 
    public String rescue() {
        return donkeyHulk.walk() + " " + donkeyHulk.smash();
    }
  //----------------------------------------------------------------------------------  
    /* Autowire at Method level
     * 
     * 
   
	@Service
	public class TeamAwesome {
	    private DonkeyHulk2 donkeyHulk;
	 
	    @Autowired
	    public void setDonkeyHulk(DonkeyHulk2 donkeyHulk) {
	        this.donkeyHulk = donkeyHulk;
	    }
	 
	    public String rescue() {
	        return donkeyHulk.walk() + " " + donkeyHulk.smash();
	    }
	}*/
    
//--------------------------------------------------------------------------------    
    /* Auto wire at constructor level
     * 
     * 
     * @Service
public class TeamAwesome {
    private DonkeyHulk2 donkeyHulk;
 
    @Autowired
    public TeamAwesome(DonkeyHulk2 donkeyHulk) {
        this.donkeyHulk = donkeyHulk;
    }
 
    public String rescue() {
        return donkeyHulk.walk() + " " + donkeyHulk.smash();
    }
}
     */
}