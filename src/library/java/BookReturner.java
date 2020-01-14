/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.java;

import entity.LibHistory;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BookReturner {
    public boolean returnLibHistory(List<LibHistory> libHistories){
    try{
        System.out.println("----Возврат книги----");
        Libhistory libHistory = new Libhistory();
        Scanner scanner = new Scanner(System.in);
        int countLibHistories = libHistories.size();
        for (int i = 0; i < countLibHistories; i++){
            LibHistory history = libHistories.get(i);
           System.out.println(i+1+". "+history.getReader().getName()
                    +" "+history.getReader().getSurname()
                    +": "+history.getBook().getBookName());          
        }
    }
    }
}
