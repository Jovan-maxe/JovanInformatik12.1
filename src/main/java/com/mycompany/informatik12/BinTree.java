/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.informatik12;

/**
 *
 * @author Jovan
 */
public class BinTree {    //Attribute
    BinTree right;
    BinTree left;
    int value;
    
    //Methoden
        // Konstruktoren
    BinTree() {
        right = null;
        left = null;
    }
    
    BinTree(int value) {
        this.value = value;
        right = null;
        left = null;
    }
    
        //Sonstige Methoden
    boolean isEmpty() {
        if (value == 0 && right == null && left == null) {
            return true;
        } else {
            return false;
        }
    }
    
    int getItem() {
        return this.value;
    }
        
    void setItem(int value) {
        this.value = value;
    }
    
    boolean isLeaf() {
        if (right == null && left == null) {
            return true;
        } else {
            return false;
        }
    }
    
    BinTree getLeft() {
        return this.left;
    }
    
    void setLeft(BinTree left) {
        this.left = left;
    }
    
    BinTree getRight() {
        return right;
    }
    
    void setRight(BinTree right) {
        this.right = right;
    }
    
    void setEmpty() {
        value = 0;
        left = null;
        right = null;
    } 
    public void preorderAusgabe() {
System.out.print("Value:" + value);
if (left != null){
    left.preorderAusgabe();   
}

if (right != null){
    right.preorderAusgabe();
}
}
    public void postorderAusgabe(){
       if (left != null){
           left.postorderAusgabe();
    }
    
    if(right != null){
        right.postorderAusgabe();
    }
         System.out.print("Value:" + value); 
}
      public void inorderAusgabe(){
       if (left != null){
           left.inorderAusgabe();
    }
           System.out.print("Value:" + value);   
    if(right != null){
        right.inorderAusgabe();
    }
}  
    }

