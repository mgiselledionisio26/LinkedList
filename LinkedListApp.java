/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class LinkedListApp {
    public static void main(String[] args){
        LinkedList theList = new LinkedList();
        theList.displayList();
        int i;
        for(i=1;i<10;i++){
            theList.insertFirst(i, (i * 3.1416));
        }
        theList.displayList();
        theList.find(0);
        theList.delete(7);
        theList.delete(5);
        theList.delete(1);
        while(!theList.isEmpty()){
            theList.deleteFirst();
        }
        theList.displayList();
    }
}
