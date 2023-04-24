package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisk implements OpticalDisk {
    public CD(String aName, int maxCapacity, int remainingCapacity, ArrayList<String> stuffInDisk){
        super(aName, maxCapacity, remainingCapacity, stuffInDisk);
    }
    @Override
   public void spinDisk(){
        System.out.println("Disk is spinning at CD speeds");
    }
    @Override
    public void readDisk(){
        System.out.println("Disk is being read: ");
        //System.out.println();
    }
}
