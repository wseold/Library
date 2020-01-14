/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Objects;

public class Book {
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

    public void setBookName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIsbn(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAuthor(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setYearPublishing(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBookName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
