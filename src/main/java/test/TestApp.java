package test;

import spec.Spec;
import spec.StorageManager;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("KOMITTTTTTT");
        if(args.length < 1)
        {
            System.out.println("Missing storage path.");
            System.exit(0);
        }

        try
        {
            Class.forName("test");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        String path = args[0];
        Spec st = StorageManager.getStorage("impl.DriveImplementation");

    }
}
