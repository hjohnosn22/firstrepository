/*
henry johnson
9/30/2020
This nod class contains a parent and child class, and contains all mutators and accessors
as well as an override for .equals() and .toString()
 */
public class Node<T> {
    private T data;
    private Node parent;
    private Node child;
    public Node(){
    }
    public Node(T data){
        this.data = data;
    }
    public Node(T data, Node parent, Node child){
        this.data = data;
        this.parent = parent;
        this.child = child;
    }
    public void setData(T data){
        this.data = data;
    }
    public void setParent(Node parent){
        this.parent = parent;
    }
    public void setChild(Node child){
        this.child = child;
    }
    public T getData(){
        return data;
    }
    public Node getParent(){
        return parent;
    }
    public Node getChild(){
        return child;
    }
    public String toString(){
        return "Node: "+data.toString();
    }
    public boolean equals(Node n) {
        return this.data.equals(n.getData());
    }

}
