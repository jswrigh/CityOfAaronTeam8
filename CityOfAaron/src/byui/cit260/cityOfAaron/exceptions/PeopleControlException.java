/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.exceptions;

/**
 *
 * @author Jacob
 */
public class PeopleControlException extends Exception {

    public PeopleControlException() {
    }

    public PeopleControlException(String message) {
        super(message);
    }

    public PeopleControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PeopleControlException(Throwable cause) {
        super(cause);
    }

    public PeopleControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
