package Groceries;

import java.util.ArrayList;

public class GroceryList {
    private int[] numbers = new int[50];

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() +
                " items in your grocery list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been" +
                "modified. ");
    }

    public void removeGroceryList(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    /* The indexOf method ========
    Returns the index of the first occurrence of the specified element
    in this list, or -1 if this list does not contain the element.
    More formally, returns the lowest index i such that
    Objects.equals(o, get(i)), or -1 if there is no such index.
     */

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0)
        {
            return groceryList.get(position);
        }

    return null;
}

}
