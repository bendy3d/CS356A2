/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356a2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Ben
 */
public class User extends UserNode {
    
    private List<User> following = new ArrayList<>();
    //This is unnecessary to complete the program
    private List<User> followers = new ArrayList<>();
    private Stack newsFeed = new Stack();
    private Stack messages = new Stack();
    private long timeCreated;

    
    public User (String id) {
        this.id = id;
        userObject = id;
        isUser = true;
        timeCreated = System.currentTimeMillis();
    }
    
    public List getFollowing() {
        return following;
    }
    
    public void addFollowing(User newFollow) {
        following.add(newFollow);
    }
    
//    public List getFollowers() {
//        return followers;
//    }
//    
//    public void addFollower(User newFollower) {
//        followers.add(newFollower);
//    }
    
    public Stack getNewsFeed() {
        return newsFeed;
    }
    
    public void addNews(String message) {
        newsFeed.push(message);
    }
    
    public Stack getMessages() {
        return messages;
    }
    
    public void addMessage(String message) {
        messages.push(message);
    }
    
    public long getCreated() {
        return timeCreated;
    }
}
