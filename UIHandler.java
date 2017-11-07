/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356a2;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Ben
 */
public class UIHandler {
    
    Admin admin;
    
    private static UIHandler ui;
    
    private UIHandler() {
        admin = new Admin();
        admin.setVisible(true);
    }
    
    public static UIHandler getInstance() {
        if (ui == null) {
            ui = new UIHandler();
        }
        return ui;
    }
}
