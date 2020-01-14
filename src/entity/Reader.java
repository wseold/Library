/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Objects;
public class Reader {
    private Long id;
    private String name;
    private String surname;
    private String phone;
    private String city;
    
    public Reader() {
    }
    public Reader(Long id,String name,String surname,String phone,String city ){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.city = city;
        
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSurname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
