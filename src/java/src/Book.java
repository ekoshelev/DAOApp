package src;


/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

import java.io.Serializable;
/**
*
*/
public class Book implements Serializable {
 String bookTitle;
 int bookId;
 String bookAuthor;

 public Book(){
 }

 public String getTitle(){
 return bookTitle;
 }
 
  public int getId(){
 return bookId;
 }
   public String getAuthor(){
 return bookAuthor;
 }
   

 public void setTitle(String bookTitle){
 this.bookTitle=bookTitle;
 }
  public void setId(int bookId){
 this.bookId=bookId;
 }
   public void setAuthor(String bookAuthor){
 this.bookAuthor=bookAuthor;
 }

}