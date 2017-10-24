/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tbooklate file, choose Tools | Tbooklates
 * and open the tbooklate in the editor.
 */
package src;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//CREATE TABLE book ( bookId int, bookName varchar(20), phone varchar(20), email varchar(20), 
//salary float, desig varchar(20), primary key(bookId));
public class BookDAO {

    // private static final String DATABASE_URL = "jdbc:mysql://danu6.it.nuigalway.ie:3306/mydb1860";
    // private static final String USERNAME = "mydb1860o";
    // private static final String PASSWORD = "mydb1860o";

    private static final String DATABASE_URL = "jdbc:mysql://danu6.it.nuigalway.ie:3306/mydb2900";
    private static final String USERNAME = "mydb2900ke";
    private static final String PASSWORD = "zy8kar";
    
    public void addNew(Book e) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            pstmt = con.prepareStatement("INSERT INTO books(bookId,bookTitle,bookAuthor) VALUES(?,?,?)");
            pstmt.setInt(1, e.getId());
            pstmt.setString(2, e.getTitle());
            pstmt.setString(3, e.getAuthor());
            pstmt.execute();
        } catch (SQLException ex) {

        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void delete(int id) {
        Connection con = null;
        Statement stmt = null;
        try {

            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stmt = (Statement) con.createStatement();
            stmt.execute("DELETE FROM books WHERE bookId=" + String.valueOf(id));
        } catch (SQLException ex) {

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update(Book e) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {

            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            pstmt = con.prepareStatement("UPDATE books SET bookTitle=?, bookAuthor=? WHERE bookId=?");
            pstmt.setString(1, e.getTitle());
            pstmt.setString(2, e.getAuthor());
            pstmt.setInt(3, e.getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {

        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Book getBook(int id) {
        Book book = null;
        Connection con = null;
        Statement stmt = null;
        try {

            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE bookId=" + id);
            if (rs.next()) {
                book = new Book();
                book.setId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));

            }
        } catch (SQLException ex) {

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return book;
    }

    public List<Book> getBooks() {
        List<Book> list = new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           System.out.println("error" + ex.toString());
        }
        try {
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books ORDER BY bookId");
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt(1));
               book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                
                list.add(book);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {

            }
        }
        return list;
    }

}
