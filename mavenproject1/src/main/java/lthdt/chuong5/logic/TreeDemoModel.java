/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong5.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author LENOVO
 */
public class TreeDemoModel implements TreeModel{
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNodel;

    public TreeDemoModel() {
        rootNodel = buildTree("Car&Motor");
        tree = new DefaultTreeModel(rootNodel);
    }
    private DefaultMutableTreeNode buildTree(String rootName){
    DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
    DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
    DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
    root.add(car);
    root.add(motor);
    DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
    DefaultMutableTreeNode everet = new DefaultMutableTreeNode("Everet");
    car.add(everet);
    car.add(honda);
    return root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNodel() {
        return rootNodel;
    }

    public void setRootNodel(DefaultMutableTreeNode rootNodel) {
        this.rootNodel = rootNodel;
    }
    
    @Override
    public Object getRoot() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.rootNodel;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public int getChildCount(Object parent) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return  tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
    tree.addTreeModelListener(l);
    }
    @Override
    public void removeTreeModelListener(TreeModelListener l) {
    tree.removeTreeModelListener(l);
    }
}
