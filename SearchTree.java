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

/***************************************************************************************
*    Title: Cycle through Tree
*    Author: User Constantin of Stack Overflow
*    Date: May 5, 2015
*    Code version: n/a
*    Availability: https://stackoverflow.com/questions/8210630/how-to-search-a-particular-node-in-jtree-and-make-that-node-expanded
*
***************************************************************************************/
public class SearchTree {

    JTree tree;

    public SearchTree(JTree tree) {
        this.tree = tree;
    }
    
    public final UserNode findNode(String searchString) {

        List<UserNode> searchNodes = getSearchNodes((UserNode)tree.getModel().getRoot());
        
        UserNode currentNode = (UserNode)tree.getLastSelectedPathComponent();

        UserNode foundNode = null;
        int bookmark = -1;

        if( currentNode != null ) {
            for(int index = 0; index < searchNodes.size(); index++) {
                if( searchNodes.get(index) == currentNode ) {
                    bookmark = index;
                    break;
                }
            }
        }

        for(int index = bookmark + 1; index < searchNodes.size(); index++) {    
            if(searchNodes.get(index).toString().toLowerCase().contains(searchString.toLowerCase())) {
                foundNode = searchNodes.get(index);
                break;
            }
        }

        if( foundNode == null ) {
            for(int index = 0; index <= bookmark; index++) {    
                if(searchNodes.get(index).toString().toLowerCase().contains(searchString.toLowerCase())) {
                    foundNode = searchNodes.get(index);
                    break;
                }
            }
        }
        return foundNode;
    }   
    
    private final List<UserNode> getSearchNodes(DefaultMutableTreeNode root) {
        List<UserNode> searchNodes = new ArrayList<UserNode>();

        Enumeration<?> e = root.preorderEnumeration();
        while(e.hasMoreElements()) {
            searchNodes.add((UserNode)e.nextElement());
        }
        return searchNodes;
    }
    
}
