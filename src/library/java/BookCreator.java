/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.java;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class BookCreator {
    public Book returnNewBook(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("-----Добавление новой книги-----");
        Book book = new Book();
        System.out.println("Название книги:");
        book.setBookName(scanner.nextLine());
        System.out.println("ISNB книги:");
        book.setIsbn(scanner.nextLine());
        System.out.println("Автор книги:");
        book.setAuthor(scanner.nextLine());
        System.out.println("Год издания книги");
        book.setYearPublishing(scanner.nextInt());
        return book; 
    }
}
