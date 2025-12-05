/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.informatik12;

/**
 *
 * @author jovan.gehrke
 */
public class BinTree {
      //Attribute
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
    
    void append(int value){
    if (value < ){
        
    }
    }
  boolean contains(int value){
      if(value == ){
          
      }
    return false;
  }
  void delete(int value){
}
}
