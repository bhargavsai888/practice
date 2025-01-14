package com.example.Student_Library_Management_System.Services;

import com.example.Student_Library_Management_System.DTOs.IssueBookRequestDto;
import com.example.Student_Library_Management_System.Dao.BookDao;
import com.example.Student_Library_Management_System.Dao.CardDao;
import com.example.Student_Library_Management_System.Dao.TransactionDao;
import com.example.Student_Library_Management_System.Enums.CardStatus;
import com.example.Student_Library_Management_System.Enums.TransactionStatus;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.Models.Card;
import com.example.Student_Library_Management_System.Models.Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class TransactionSerivce {

    // @Autowired
    // TransactionRepository transactionRepository ;

    // @Autowired
    // BookRepository bookRepository ;

    // @Autowired
    // CardRepository cardRepository ;


    // public String issueBook(IssueBookRequestDto issueBookRequestDto) throws Exception{

    //     int bookId = issueBookRequestDto.getBookId();
    //     int cardId = issueBookRequestDto.getCardId() ;

    //     //Get the Book Entity and Card Entity
    //     //We are this bcz we want to set the Transaction attributes

    //     Book book = bookRepository.findById(bookId).get() ;
    //     Card card = cardRepository.findById(cardId).get() ;

    //     //Final goal is to make a transactionEntity , set its attribute
    //     //and save it
    //     Transactions transaction = new Transactions() ;

    //     //Setting the attributes
    //     transaction.setBook(book) ;
    //     transaction.setCard(card) ;
    //     transaction.setTransactionId(UUID.randomUUID().toString());
    //     transaction.setIssueOperation(true);
    //     transaction.setTransactionStatus(TransactionStatus.PENDING);

    //     //Attribute left is success/Failure
    //     //Check for validation
    //     if(book==null || book.isIssued()==true){
    //        transaction.setTransactionStatus(TransactionStatus.FAILED);
    //         transactionRepository.save(transaction) ;
    //         throw new Exception("Book is not available") ;
    //     }

    //     if(card==null || card.getCardStatus()!= CardStatus.ACTIVATED){

    //         transaction.setTransactionStatus(TransactionStatus.FAILED);
    //         transactionRepository.save(transaction);
    //         throw new Exception("Card is not valid") ;
    //     }

    //     //We have reached a success case now
    //    transaction.setTransactionStatus(TransactionStatus.SUCCESS);

    //     //set attributes of book
    //     book.setIssued(true);
    //     //Between the book and transaction : Bidirectional
    //     List<Transactions>  listOfTransactionForBook = book.getListOfTransactions() ;
    //     listOfTransactionForBook.add(transaction) ;
    //     book.setListOfTransactions(listOfTransactionForBook);

    //     // I need to make changes in the card
    //     //Book and the card
    //     List<Book> issuedBooksForCard =card.getBooksIssued() ;
    //     issuedBooksForCard.add(book);
    //     card.setBooksIssued(issuedBooksForCard);

    //     //Card and the transaction : bidirectional(Parent class)
    //     List<Transactions> transactionsListForCard = card.getTransactionsList() ;
    //     transactionsListForCard.add(transaction);
    //     card.setTransactionsList(transactionsListForCard);

    //     //save the parent
    //     cardRepository.save(card);

    //     //automatically  by cascading  : book  and transaction  will be saved
    //     //Saving  the parent
    //     return "Book issued  successfully" ;
    //  }

    //  public String getTransactions(int bookId , int cardId){
    //     List<Transactions> transactionsList =transactionRepository.getTransactionsForBookAndCard(bookId,cardId);
    //     String transactionId = transactionsList.get(0).getTransactionId() ;

    //     return transactionId ;
    //  }
}
