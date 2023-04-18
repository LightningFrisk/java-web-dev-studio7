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
        if(this.stuffInDisk.isEmpty()){
            System.out.println("This disk is empty");
        } else {
            System.out.println(stuffInDisk);
        }
    };
    public String writeDisk(String input){
        this.stuffInDisk.add(input);
        return "Data written to disk";
    }
}
