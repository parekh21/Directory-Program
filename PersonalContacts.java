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
public class PersonalContacts extends Contacts {
    private String dob;
    
    public void setPersonalContacts () {
        System.out.print("Please enter contact ID: ");
        Scanner ci = new Scanner(System.in);
        super.setContactId(ci.next());
        System.out.print("Please enter First Name: ");
        Scanner fn = new Scanner(System.in);
        super.setFirstName(fn.next());
        System.out.print("Please enter Last Name: ");
        Scanner ln = new Scanner(System.in);
        super.setLastName(ln.next());
        System.out.print("Please enter address: ");
        Scanner ad = new Scanner (System.in);
        super.setAddress(ad.next());
        System.out.print("Please enter phone number: ");
        Scanner pn = new Scanner(System.in);
        super.setPhoneNumber(pn.next());
        System.out.print("Please enter email address: ");
        Scanner ea = new Scanner(System.in);
        super.setEmailAddress(ea.next());
        System.out.print("Please enter date of birth: ");
        Scanner db = new Scanner(System.in);
        this.dob = db.next();
}
    
    
    @Override
    public void display () {
        System.out.print("\nPersonal Contact");
        System.out.println("\nContact ID: " +getContactId());
        System.out.println("First Name: " +getFirstName());
        System.out.println("Last Name: " +getLastName());
        System.out.println("Address: " +getAddress());
        System.out.println("Phone Number: " +getPhoneNumber());
        System.out.println("Email Address: " +getEmailAddress());
        System.out.println("Date of Birth: " +dob);
        System.out.println("");
        
    }

}
