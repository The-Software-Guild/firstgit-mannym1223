/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.statecapitals2;
import java.util.HashMap;

/**
 *
 * @author Manny
 * 
 */
public class StateCapitalsReader {
    private HashMap<String, String> stateCapitals;
    private String filename;
    
    public StateCapitalsReader(String name) {
        filename = name;
        stateCapitals = new HashMap<>();
    }

    public String getFilename() {
        return filename;
    }

    public HashMap<String, String> getStateCapitals() {
        return stateCapitals;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    
    
}
