/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356a2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Ben
 */
public class Admin extends javax.swing.JFrame {

    private int numOfUsers;
    private int numOfGroups;
    private int numOfMessages;
    private int numOfPosMessages;
    
    private String numOfUsersString;
    private String numOfGroupsString;
    private String numOfMessagesString;
    private String numOfPosMessagesString;
    
    private SearchTree searchTree;
    private MessageCounter messageCounter;
    
    public Admin() {
        initComponents();
        updateRoot();
        updateLabels();
        searchTree = new SearchTree(tree);
        messageCounter = new MessageCounter();
    }

    private void updateRoot() {
        UserGroup root = new UserGroup("Root");
        ((DefaultTreeModel)tree.getModel()).setRoot(root);
    }
    
    private void updateLabels() {
        updateStrings();
        updateDisplays();
    }
    
    private void updateDisplays() {
        numOfUsersLabel.setText(numOfUsersString);
        numOfGroupsLabel.setText(numOfGroupsString);
        numOfMessagesLabel.setText(numOfMessagesString);
        numOfPosMessagesLabel.setText(numOfPosMessagesString);
    }
    
    private void updateStrings() {
        numOfUsersString = "Number of Users: " + Integer.toString(numOfUsers);
        numOfGroupsString = "Number of Groups: " + Integer.toString(numOfGroups);
        numOfMessagesString = "Number of Messages: " + Integer.toString(numOfMessages);
        numOfPosMessagesString = "Number of Positive Messages: " + Integer.toString(numOfPosMessages);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        addUserButton = new javax.swing.JButton();
        addGroupButton = new javax.swing.JButton();
        openUserViewButton = new javax.swing.JButton();
        numOfMessagesLabel = new javax.swing.JLabel();
        numOfPosMessagesLabel = new javax.swing.JLabel();
        numOfUsersLabel = new javax.swing.JLabel();
        numOfGroupsLabel = new javax.swing.JLabel();
        userIdInput = new javax.swing.JTextField();
        groupIdInput = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(tree);

        addUserButton.setText("+ Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        addGroupButton.setText("+ Add Group");
        addGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupButtonActionPerformed(evt);
            }
        });

        openUserViewButton.setText("Open User View");
        openUserViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUserViewButtonActionPerformed(evt);
            }
        });

        numOfMessagesLabel.setText("Number of Messages: " + numOfMessagesString);

        numOfPosMessagesLabel.setText("Number of Positive Messages: " + numOfPosMessagesString);

        numOfUsersLabel.setText("Number of Users: " + numOfUsersString);

        numOfGroupsLabel.setText("Number of Groups: " + numOfGroupsString);

        userIdInput.setText("Enter User ID...");

        groupIdInput.setText("Enter Group ID...");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(openUserViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numOfMessagesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numOfUsersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numOfGroupsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userIdInput)
                                    .addComponent(groupIdInput, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(numOfPosMessagesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(userIdInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(groupIdInput)
                            .addComponent(addGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openUserViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numOfUsersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numOfGroupsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numOfMessagesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numOfPosMessagesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        // TODO add your handling code here:
        String userId = userIdInput.getText();
        userIdInput.setText("");
        boolean exists = isNode(userId);

        if (!exists) {
            add(userId, true);
        }
    }//GEN-LAST:event_addUserButtonActionPerformed


    private void addGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupButtonActionPerformed
        // TODO add your handling code here:
        String groupId = groupIdInput.getText();
        groupIdInput.setText("");
        boolean exists = isNode(groupId);

        if (!exists) {
            add(groupId, false);
        }
    }//GEN-LAST:event_addGroupButtonActionPerformed

    private void openUserViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUserViewButtonActionPerformed
        // TODO add your handling code here:
        if((tree.getLastSelectedPathComponent() != null) && (((UserNode)tree.getLastSelectedPathComponent()).getIsUser())) {
            UserView userView = new UserView(((User)tree.getLastSelectedPathComponent()), tree, messageCounter);
            userView.setVisible(true);
        } else {
            ErrorDialogue errorMessage = new ErrorDialogue("Selection is not a User"); 
        }
    }//GEN-LAST:event_openUserViewButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        numOfMessagesLabel.setText("Number of Messages: " + Integer.toString(messageCounter.getMessages()));
        numOfPosMessagesLabel.setText("Number of Positive Messages: " + Integer.toString(messageCounter.getPosMessages()));
    }//GEN-LAST:event_refreshButtonActionPerformed

    private boolean isNode(String Id) {
        boolean exists = true;
        
        if (searchTree.findNode(Id) == null) {
            exists = false;
        } else {
            ErrorDialogue errorMessage = new ErrorDialogue("Id Already Exists");
        }

        return exists;
    }
    
    private void add(String Id, boolean isUser) {
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        UserNode parent = (UserNode) tree.getLastSelectedPathComponent();
        UserNode child = null;
        
        if (isUser) {
            child = new User(Id);
            numOfUsers++;
        } else {
            child = new UserGroup(Id);
            numOfGroups++;
        }
        
        if (parent == null) {
            UserGroup root = (UserGroup) tree.getModel().getRoot();
            model.insertNodeInto(child, root, root.getChildCount());
            tree.scrollPathToVisible(new TreePath(child.getPath()));
        } else if (parent.getIsUser()) {
            ErrorDialogue errorMessage = new ErrorDialogue("Selection is not a Group");
        } else {
            model.insertNodeInto(child, parent, parent.getChildCount());
            tree.scrollPathToVisible(new TreePath(child.getPath()));
        }
        
        updateLabels();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroupButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JTextField groupIdInput;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numOfGroupsLabel;
    private javax.swing.JLabel numOfMessagesLabel;
    private javax.swing.JLabel numOfPosMessagesLabel;
    private javax.swing.JLabel numOfUsersLabel;
    private javax.swing.JButton openUserViewButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTree tree;
    private javax.swing.JTextField userIdInput;
    // End of variables declaration//GEN-END:variables

}