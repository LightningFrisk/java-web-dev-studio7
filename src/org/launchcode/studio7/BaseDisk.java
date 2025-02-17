package org.launchcode.studio7;

import java.util.ArrayList;

/* Abstract
Name, MaxStorage, RemainingStorage, Contents
* */
public abstract class BaseDisk {
    private String name;
    private int maxStorage;
    private int remainingStorage;
    public ArrayList<String> stuffInDisk;

    public BaseDisk(String aName, int maxCapacity, int remainingCapacity, ArrayList<String> stuffInDisk){
        name = aName;
        maxStorage = maxCapacity;
        remainingStorage = remainingCapacity;
        this.stuffInDisk = stuffInDisk;
    }
}
