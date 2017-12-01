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
    private String lastUpdatedUser = "No Messages";
    
    
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
    
    public void setUpdated(String id) {
        this.lastUpdatedUser = id;
    }
    
    public String getUpdated() {
        return lastUpdatedUser;
    }
}
