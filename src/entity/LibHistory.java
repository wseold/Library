/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Date;
import java.util.Date;

public class LibHistory {
    private Long id;
    private Book book;
    private Reader reader;
    private Date bookIssued;
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
}
