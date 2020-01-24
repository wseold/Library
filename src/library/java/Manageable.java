/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.java;

import entity.Book;
import entity.LibHistory;
import entity.Reader;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface Manageable {
    public Book createBook();
    public Reader createReader();
    public LibHistory issueBook(List<Book> books, List<Reader> readers);
    public boolean returnBook(List<LibHistory> libhistories);
    public void returnHistory(List<LibHistory> libhistories);
}
