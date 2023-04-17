package org.launchcode.studio7;
/* Abstract
Name, MaxStorage, RemainingStorage, Contents
* */
public abstract class BaseDisk {
    private String name;
    private int maxStorage;
    private int remainingStorage;
    private String contents;

    public BaseDisc(String aName, int maxStorage, int remainingStorage, String contents){
        name = aName;
        this.maxStorage = maxStorage;
        this.remainingStorage = remainingStorage;
        this.contents = contents;
    }
}
