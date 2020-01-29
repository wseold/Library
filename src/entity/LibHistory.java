/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Date;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
@Entity
public class LibHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Book book;
    @OneToOne
    private Reader reader;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date bookIssued;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date bookReturn;
    
    public LibHistory(){
    }
    
    public LibHistory(Long id,Book book,Reader reader,Date bookIssued,Date bookReturn ){
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.bookIssued = bookIssued;
        this.bookReturn = bookReturn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getBookIssued() {
        return bookIssued;
    }

    public void setBookIssued(Date bookIssued) {
        this.bookIssued = bookIssued;
    }

    public Date getBookReturn() {
        return bookReturn;
    }

    public void setBookReturn(Date bookReturn) {
        this.bookReturn = bookReturn;
    }

    }
