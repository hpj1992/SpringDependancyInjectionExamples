package com.DI;

import org.springframework.stereotype.Service;

@Service
public class DonkeyHulk2 {
    public String walk() {
        return "DonkeyHulk walks slowly.";
    }
 
    public String smash() {
        return "DonkeyHulk smashes some pumpkins.";
    }
}