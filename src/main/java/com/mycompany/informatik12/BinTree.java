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

    boolean hasLeft() {
        if (this.left != null) {
            return true;
        } else {
            return false;
        }
    }

    boolean hasRight() {
        if (this.right != null) {
            return true;
        } else {
            return false;
        }
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

    void append(int zahl) {
        if (value == 0) {
            this.value = zahl;
        }
        if (zahl < value) {
            if (hasLeft() == true) {
                this.left.append(zahl);
            } else {
                BinTree links = new BinTree(zahl);
                this.left = links;
            }
        } else if (zahl > value) {
            if (hasRight() == true) {
                this.right.append(zahl);
            } else {
                BinTree rechts = new BinTree(zahl);
                this.left = rechts;
            }
        } else {
            System.out.print("Number already exists");
        }

    }

    boolean contains(int zahl2) {
        if (value == 0) {
            return false;
        }

        if (zahl2 < value) {

            this.left.append(zahl);

        }
    }
    else if (zahl2 > value

    
        ) {
            if (hasRight() == true) {
            this.right.append(zahl);
        } else {
            BinTree rechts = new BinTree(zahl);
            this.left = rechts;
        }
    }

    
    

    else {

        }
        
    void delete(int value) {
    }
