package org.launchcode.studio7;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args){
        ArrayList<String> cdcontents = new ArrayList<>();
        ArrayList<String> dvdcontents = new ArrayList<>();
        CD cd = new CD("CD example", 64, 32, cdcontents);
        DVD dvd = new DVD("CD example", 1028, 1000, dvdcontents);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisk();
        dvd.spinDisk();

        dvd.writeDisk("Hello");
        dvd.writeDisk("Fellow Human");

        cd.readDisk();
        dvd.readDisk();
    }
}
/*Interface should have
* Spin Disk, Read Disk, Write Disk
* */

/* Abstract
Name, MaxStorage, RemainingStorage, Contents
* */