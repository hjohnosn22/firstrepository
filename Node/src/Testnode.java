/*
Henry johnson
10/1/20
this tests all constructors accessors and mutators of Node class as well as the toString and the equals
 */

import java.awt.*;

public class Testnode {
    public static void main(String[] args) {
        Node nothing = new Node();
        Node parent = new Node(new Point(1,3));
        Node child = new Node(new Point(5,5));
        Node node = new Node(new Point(),parent,child);
        System.out.println(child.toString());
        child.setData(new Point(3,4));
        System.out.println(child.toString());
        System.out.println(node.toString());
        System.out.println(node.getChild().toString());
        System.out.println(parent.equals(child));
        child = parent;
        System.out.println(parent.equals(child));
    }
}
