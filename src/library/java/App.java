/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.java;

import entity.Book;
import entity.LibHistory;
import entity.PersistToDatabase;
import entity.Reader;
import entity.Retentive;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();
    private List<LibHistory> libHistories = new ArrayList<>();
    private Retentive saver = new PersistToDatabase();
    public void run(BookCreator Creator){
        String repeat = "r";
        Scanner scanner = new Scanner(System.in);
        int task;
        do{
            System.out.println("Выберите действие:");
            System.out.println("0 - выход из программы");
            System.out.println("1 - добавить книгу в библиотеку");
            System.out.println("2 - добавить нового читателя");
            System.out.println("3 - выдать книгу читателю ");
            System.out.println("4 - возврат книги");
            System.out.println("5 - история работы библиотеки");
            
            task = scanner.nextInt();
            switch (task){
                case 0:
                    repeat="q";
                    break;
                case 1:
                    Book book =  manager.createBook();
                    if(book != null){
                    books.add(book);
                    saver.saveBook(book);
                    }
                    break;
                case 2:
                    ReaderCreator readerCreator = new ReaderCreator();
                    readers.add(readerCreator.returnNewReader());
                    break;
                case 3:
                    LibHistoryCreator libHistoryCreator = new LibHistoryCreator();
                    libHistories.add(libHistoryCreator.returnNewLibHistory(books, readers));
                    break;
                case 4:
                    BookReturner bookReturner = new BookReturner();
                    if(bookReturner.returnLibHistory(libHistories)){
                        System.out.println("Книга возвращена");
                    }else{
                        System.out.println("Книгу вернуть не удалось");
                    }
                    break;
                case 5:
                    HistoryReturner historyReturner = new HistoryReturner();
                    historyReturner.printListWhoTookBooks(libHistories);
                    break;
                default:
                    System.out.println("Выберите одно из действий!");
            }
        }while("r".equals(repeat)); 
    }
    public App(){
        this.books = saver.loadBooks();
        this.readers = saver.loadReaders();
        this.libHistories = saver.loadLibHistoryes();
    }

    private static class manager {

        private static Book createBook() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public manager() {
        }
    }
}
