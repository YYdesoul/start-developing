package com.soul.DataStructure;

public class BinaryTree {

    int val;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree() {

    }

    public BinaryTree(int val) {
        this.val = val;
    }
}

class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree4 = new BinaryTree(4);
        BinaryTree binaryTree5 = new BinaryTree(5);
        BinaryTree binaryTree6 = new BinaryTree(6);
        BinaryTree binaryTree7 = new BinaryTree(7);

        binaryTree1.left = binaryTree2;
        binaryTree1.right = binaryTree3;
        binaryTree2.left = binaryTree4;
        binaryTree2.right = binaryTree5;
        binaryTree3.left = binaryTree6;
        binaryTree3.right = binaryTree7;

        System.out.println(binaryTree1.val);
        System.out.println(binaryTree1.left.val);
        System.out.println(binaryTree1.right.val);
        System.out.println(binaryTree1.left.left.val);
        System.out.println(binaryTree1.right.left.val);
        System.out.println(binaryTree1.right.right.right);
    }
}
