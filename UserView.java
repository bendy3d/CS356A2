/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356a2;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JTree;

/**
 *
 * @author Ben
 */
public class UserView extends javax.swing.JFrame {

    private User user;
    private JTree tree;
    private Vector<String> followingData;
    private Vector<String> messagesData = new Vector<String>();
    private SearchTree searchTree;
    private MessageCounter messageCounter;
    /**
     * Creates new form UserView
     */
    public UserView(User user, JTree tree, MessageCounter messageCounter) {
        this.user = user;
        this.tree = tree;
        searchTree = new SearchTree(tree);
        this.messageCounter = messageCounter;
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        updateView();
    }

    private void updateView() {
        followingData =  parseFollowingVector();
        updateFollowingList();
        
        messagesData.add("News Feed");
        refreshNewsFeed();
    }

    private void refreshNewsFeed() {
        updateNewsFeed();
        messagesData.addAll(parseMessagesVector());
        updateMessagesList();
    }
    
    
    private void updateFollowingList() {
        if (followingData != null) {
            followingList.setListData(followingData);
        }
    }
    
    private void updateNewsFeed() {
        ArrayList<User> userList = (ArrayList<User>) user.getFollowing();
        if (!userList.isEmpty()) {
            for (int i = 0; i < userList.size(); i++) {
                Stack messages = userList.get(i).getMessages();
                while (!messages.empty()) {
                    String temp = (String) messages.pop();
                    if (!user.getNewsFeed().contains(temp)) {
                        user.addNews(temp);
                    }
                }
            }
        }
    }
    
    private void updateMessagesList() {
        if (messagesData != null) {
            messagesList.setListData(messagesData);
        }
    }
    
    private Vector<String> parseFollowingVector() {
        Vector<String> listdata = new Vector<String>();
        ArrayList<User> userList = (ArrayList<User>) user.getFollowing();
        
        listdata.add("Current Following");
        
        if ((followingData != null) && (!followingData.contains(user.getID()))) {
            listdata.add(user.getID());
        }
        
        if (!userList.isEmpty()) {
            for (int i = 0; i < userList.size(); i++) {
                User user = userList.get(i);
                listdata.add(user.getID());
            }
        }
        
        return listdata;
    }
    
    private Vector<String> parseMessagesVector() {
        Vector<String> listdata = new Vector<String>();
        Stack newsFeed = user.getNewsFeed();
        while(!newsFeed.empty()) {
            String temp = (String) newsFeed.pop();
            if (!listdata.contains(temp)) {
                listdata.add(temp);
            }
        }
        
        return listdata;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        followButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        followingList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageInput = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        messagesList = new javax.swing.JList<>();
        userIdInput = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        followButton.setText("Follow User");
        followButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(followingList);

        messageInput.setColumns(20);
        messageInput.setRows(5);
        messageInput.setText("Type your message here...");
        jScrollPane2.setViewportView(messageInput);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(messagesList);

        userIdInput.setText("Enter a User Id...");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(followButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(refreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userIdInput)
                    .addComponent(followButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void followButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followButtonActionPerformed
        // TODO add your handling code here:
        UserNode followRequest = searchTree.findNode(userIdInput.getText());
        userIdInput.setText("");
        if (followRequest == null) {
            ErrorDialogue errorMessage = new ErrorDialogue ("No Such User");
        } else if (user.getFollowing().contains((User) followRequest)) {
            ErrorDialogue errorMessage = new ErrorDialogue("Already Following This User");
        } else {
            user.addFollowing((User) followRequest);
            followingData.add(followRequest.getID());
        }
        updateFollowingList();
    }//GEN-LAST:event_followButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String temp = messageInput.getText();
        boolean isPos = checkPos(temp);
        user.addMessage(user.getID() + ": " + temp);
        messageInput.setText("");
        messageCounter.addMessage();
        if (isPos) messageCounter.addPosMessage();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        refreshNewsFeed();
    }//GEN-LAST:event_refreshButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton followButton;
    private javax.swing.JList<String> followingList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea messageInput;
    private javax.swing.JList<String> messagesList;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField userIdInput;
    // End of variables declaration//GEN-END:variables

    private boolean checkPos(String temp) {
        String[] check = temp.split(" ");
        boolean isPos = false;
        for (int i = 0; i < check.length; i++) {
            if (check[i].toLowerCase().equals("good")) {
                isPos = true;
            }
        }
        return isPos;
    }
}