package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisk implements OpticalDisk{
    public DVD(String aName, int maxCapacity, int remainingCapacity, ArrayList<String> stuffInDisk){
        super(aName, maxCapacity, remainingCapacity, stuffInDisk);
    }

    public void spinDisk(){
        System.out.println("Disk is spinning at DVD speeds");
    };
    public void readDisk(){
        System.out.println("Disk is being read: ");
        //System.out.println();
    };
}
