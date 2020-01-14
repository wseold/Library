/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.java;

import entity.Book;
import entity.LibHistory;
import entity.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LibraryJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book1 = new Book(1L, "Voina i Mir", "123*123123", "Lev Tolsoy", 2010);
        Reader reader1 = new Reader(1L, "Ivan", "Ivanov", "56565656", "Johvi");
        
        Calendar c = new GregorianCalendar();
        
        LibHistory libHistory1 = new LibHistory(1L, book1, reader1, c.getTime(),null);
        
        System.out.println(book1.toString());
        System.out.println(reader1.toString());
        System.out.println(libHistory1.toString());
        
        c.add(Calendar.DATE,2);
        libHistory1.setBookReturn(c.getTime());
        System.out.println(libHistory1.toString());
    }
    
}
