package com.mycompany.trees;

/**
 * 
 * 
 * @author jesusrrp
 */
public class BinaryTree {
    TreeNode root;
    

    public BinaryTree() {
        this.root = null;
    }
    
    public void insert(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
        } else {
            this.root.insert(value);
        }
    }

    public void dispararPreorden() {
        this.preorden(this.root);
    }

 
    public void preorden(TreeNode nodo) {
        if (nodo == null) {
            return; 
        } else {
             System.out.print(nodo.getValue()   +", ");
            preorden(nodo.getLeftNode()); 
            preorden(nodo.getRightNode()); 
        }
    }
    
        public void dispararInorden() {
        this.inorden(this.root);
    }

 
    public void inorden(TreeNode nodo) {
        if (nodo == null) {
            return; 
        } else {
            inorden(nodo.getLeftNode());
            System.out.print(nodo.getValue()   +", ");
            inorden(nodo.getRightNode()); 
            
        }
    }
    
        public void dispararPostOrden() {
        this.postorden(this.root);
    }

 
    public void postorden(TreeNode nodo) {
        if (nodo == null) {
            return; 
        } else {
            postorden(nodo.getLeftNode());
            postorden(nodo.getRightNode()); 
            System.out.print(nodo.getValue()   +", "); 
            
            
        }
    }
    
    public void delete(int value) {
    this.root = deleteRec(this.root, value);
}

private TreeNode deleteRec(TreeNode root, int value) {
    if (root == null) {
        return null;
    }

    // Buscar el nodo a eliminar
    if (value < root.getValue()) {
        root.setLeftNode(deleteRec(root.getLeftNode(), value));
    } else if (value > root.getValue()) {
        root.setRightNode(deleteRec(root.getRightNode(), value));
    } else {
        // Caso 1: Nodo sin hijos
        if (root.getLeftNode() == null && root.getRightNode() == null) {
            return null;
        }
        // Caso 2: Nodo con un hijo
        else if (root.getLeftNode() == null) {
            return root.getRightNode();
        } else if (root.getRightNode() == null) {
            return root.getLeftNode();
        }
        // Caso 3: Nodo con dos hijos
        else {
            TreeNode sucesor = findMin(root.getRightNode());
            root.setValue(sucesor.getValue());
            root.setRightNode(deleteRec(root.getRightNode(), sucesor.getValue()));
        }
    }
    return root;
}

private TreeNode findMin(TreeNode node) {
    while (node.getLeftNode() != null) {
        node = node.getLeftNode();
    }
    return node;
}

    
}
