/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directory;

import java.util.*;

/**
 *
 * @author parekh21
 */
public class Directory {

    static String i;
    public ArrayList<Contacts> clist = new ArrayList();

    public void initial() {
        System.out.println("\nEnter 1 to add personal contact.");
        System.out.println("Enter 2 to add business contact.");
        System.out.println("Enter 3 to display contacts.");
        System.out.println("Enter 4 to quit.\n");
        System.out.print("Please enter your selection: ");
    }

    public void input(String input) {
        if (i.equalsIgnoreCase("1")) {
            PersonalContacts pcontacts = new PersonalContacts();
            pcontacts.setPersonalContacts();
            clist.add(pcontacts);
            System.out.println("\nContact Saved!");
            
        } else if (i.equalsIgnoreCase("2")) {
            BusinessContacts bcontacts = new BusinessContacts();
            bcontacts.setBusinessContacts();
            clist.add(bcontacts);
            System.out.println("\nContact saved!");
            
        } else if (i.equalsIgnoreCase("3")) {
            for (Contacts c1 : clist) {
                System.out.print("\nContact ID: " + c1.getContactId());
                System.out.print(" | ");
                System.out.print(" First Name: " + c1.getFirstName());
                System.out.print(" | ");
                System.out.print(" Last Name: " + c1.getLastName());
                System.out.println("");
            }
            System.out.print("\nPlease enter Contact ID to view full details: ");
            Scanner cid = new Scanner(System.in);
            String dcontactid = cid.next();
            boolean match = false;
            for (Contacts dcid : clist) {
                if (dcontactid.equalsIgnoreCase(dcid.getContactId())) {
                    match = true;
                    dcid.display();
                    break;
                }
            }
            if (match == false) {
                System.out.println("\nInvalid Contact ID!\n");
            }
        } else if (i.equalsIgnoreCase("4")) {
            System.exit(0);

        } else {
            System.out.println("\nPlease select from one of the above options.");

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String loopcontrol = "Y";
        Directory d = new Directory();
        do {
            d.initial();
            Scanner input = new Scanner(System.in);
            i = input.next();
            d.input(i);
        } while (loopcontrol.equalsIgnoreCase("Y"));

    }

}
