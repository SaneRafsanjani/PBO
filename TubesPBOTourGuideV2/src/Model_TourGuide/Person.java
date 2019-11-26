/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_TourGuide;

/**
 *
 * @author rafsa
 */
public class Person {
     String ttlCustomer;
     String usernameCustomer;
     String passwordCustomer;
     String emailTourGuide;
     String alamatTourGuide;

    public Person(String ttlCustomer, String usernameCustomer, String passwordCustomer, String emailTourGuide, String alamatTourGuide) {
        this.ttlCustomer = ttlCustomer;
        this.usernameCustomer = usernameCustomer;
        this.passwordCustomer = passwordCustomer;
        this.emailTourGuide = emailTourGuide;
        this.alamatTourGuide = alamatTourGuide;
    }
     
     
}
