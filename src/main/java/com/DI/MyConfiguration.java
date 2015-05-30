package com.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
 
    @Bean
    public DonkeyHulk3 getDonkeyHulk() {
        return new DonkeyHulk3();
    }
 
    @Bean
    public TeamAwesome3 getTeamAwesome(DonkeyHulk3 donkeyHulk) {
        return new TeamAwesome3(donkeyHulk);
    }
}