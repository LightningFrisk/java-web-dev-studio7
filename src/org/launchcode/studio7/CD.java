package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisk implements OpticalDisk {
    public CD(String aName, int maxCapacity, int remainingCapacity, ArrayList<String> stuffInDisk){
        super(aName, maxCapacity, remainingCapacity, stuffInDisk);
    }

   public void spinDisk(){
        System.out.println("Disk is spinning at CD speeds");
    }
    public void readDisk(){
        System.out.println("Disk is being read: ");
        //System.out.println();
    }
    public String writeDisk(String input){
        this.stuffInDisk.add(input);
        return "Data written to disk";
    }
}
