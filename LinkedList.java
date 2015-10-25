/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class LinkedList {
    private ListNode first;
        
    public LinkedList(){
       first = null;
    }
  
    public void insertFirst(int i, double d){
        ListNode newListNode = new ListNode(i, d);
        newListNode.next = first;
        first = newListNode;
    }
    
    public void deleteFirst(){
        System.out.print("deleting item ");
        first.displayData();
        first = first.next;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void displayList(){
        System.out.println("LinkedList (first-->last)");
        ListNode current = first;
        if(isEmpty()){
            System.out.println("The LinkedList is Empty.");
        } else {
            while(current != null){
                current.displayData();
                current = current.next;
            }
        }
    }
    public boolean find(int key){
        System.out.print("Finding " + key + "...\n");
        ListNode current = first;
        if(!isEmpty()){
            while(current != null){
            if(key == current.getIData()){
                System.out.print("EUREKA!\n");
                return true;
            }
            current = current.next;}
            System.out.print(".");
        }
        System.out.print("Not Found!\n");
        return false;
                        
    }
    public void delete(int key){
        ListNode current = first;
        ListNode previous = first;
        if(!isEmpty()){
            while(key != current.getIData()){
                if(current.next == null){
                    System.out.print("wala dito");
                    return;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
            if(current == first){
                deleteFirst();
            } else {
                System.out.print("removing " + current.getIData() + "...");
                previous.next = current.next;
            }
        }
    }
}
