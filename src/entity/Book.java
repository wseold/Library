/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;
    private String lsbn;
    private String author;
    private Integer yearPublishing;
    
    public Book(){
    }
    
    public Book(Long id,String bookName,String lsbn,String author,Integer yearPublishing){
        this.id = id;
        this.bookName = bookName;
        this.lsbn = lsbn;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getLsbn() {
        return lsbn;
    }

    public void setLsbn(String lsbn) {
        this.lsbn = lsbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(Integer yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public void setIsbn(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}

