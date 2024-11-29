/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trees;

/**
 *
 * @author jesusrrp
 */
public class TreeNode {
    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public void insert(int value){
               if(value < this.value){
                   if(this.leftNode == null) {
                       this.leftNode = new TreeNode(value);
                   }else{
                       this.leftNode.insert(value);
                   }
               }else{
                   
                   if(this.rightNode ==null){
                       this.rightNode = new TreeNode(value);
                   }else{
                       this.rightNode.insert(value);
                   }
               }
        
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }


    
     
    
    
}
