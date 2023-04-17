package org.launchcode.studio7;

public class CD extends BaseDisk implements OpticalDisk {

    public CD(String aName, int maxStorage, int remainingStorage, String contents){
        name = aName;
        this.maxStorage = maxStorage;
        this.remainingStorage = remainingStorage;
        this.contents = contents;
    }

}
