/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package re_book;

import java.util.Date;

/**
 *
 * @author AboodHassKov
 */
public class buy_rent {
    private int user_id;
    private int book_id;
    private Date Expiration;

    public buy_rent() {
        
    }
    
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public Date getExpiration() {
        return Expiration;
    }

    public void setExpiration(Date Expiration) {
        this.Expiration = Expiration;
    }
    
    
}
