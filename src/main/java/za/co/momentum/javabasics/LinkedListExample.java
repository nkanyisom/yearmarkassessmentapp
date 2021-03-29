package za.co.momentum.javabasics;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListExample {

    public static void main(String args[]) {

        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();
        ArrayList<String> arrayList = new ArrayList<>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        arrayList.add("Item1");
        arrayList.add("Item5");
        arrayList.add("Item3");
        arrayList.add("Item6");
        arrayList.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " + linkedlist);
        System.out.println("Array List Content: " + arrayList);

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedlist);

        arrayList.add(0, "First Item");
        arrayList.add((arrayList.size()-1), "Last Item");
        System.out.println("Array List  Content after addition: " + arrayList);

        //*This is how to get and set Values*//*
        Object firstvar = linkedlist.get(0);// -->>  linkedlist.getFirst("First Item");

        System.out.println("First element: " + firstvar);

        linkedlist.set(0, "Changed first item"); // does an update/replaces the value at the specific index

        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " + firstvar2);

        //*Remove first and last element*//*
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedlist);

        //* Add to a Position and remove from a position*//*
        //linkedlist.add(0, "Newly added item");

        // In the LinkedList search for 'Item5' and remove it from the list
        for(int a = 0; a < linkedlist.size(); a++) {
            if(linkedlist.get(a).equalsIgnoreCase("ITEM5")) {
                linkedlist.remove(a);
            }
        }

        //linkedlist.remove(2);
        System.out.println("Final Content: " + linkedlist);


        List <String> list = new ArrayList<String>();
        list.add("behold");
        list.add("bend");
        list.add("bet");



        //Load the list into a hashSet
        Set<String> set = new HashSet<String>(list);

        if (set.contains("bend"))
        {
            System.out.println("String found!");
        }

        String name = "NKANYISO";
        System.out.println(name.toLowerCase());

        String nameFromApi = "nKaNyIsO";//FROM API
        /* searchByName(String name){
            name.toLowerCase();
        }*/

    }
}
