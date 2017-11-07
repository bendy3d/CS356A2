/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356a2;

/**
 *
 * @author Ben
 */
public class MessageCounter {
    
    private int messages;
    private int posMessages;
    
    public void addMessage() {
        messages++;
    }
    
    public void addPosMessage() {
        posMessages++;
    }
    
    public int getMessages() {
        return messages;
    }
    
    public int getPosMessages() {
        return posMessages;
    }
}
