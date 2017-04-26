/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author USER
 */
public class Customer extends DomainObject{
    private String firstname;
    private String lastname;
    private String telephone;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Customer(String firstname, String lastname, String telephone, String street1, String street2, String city, String state, String zipcode, String country, String id) {
        super(id);
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }
    
    
}
