/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author pupil
 */
public interface Retentive {
    public void saveBook(Book book);
    public void saveReader(Reader reader);
    public void saveLibHistory(LibHistory libHistory, boolean update);
    public List<Book> loadBooks();
    public List<Reader> loadReaders();
    public List<LibHistory> loadLibHistoryes();
}
