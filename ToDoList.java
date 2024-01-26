import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        user obj= new user();
        obj.menu();
    }
}

class user{
private static List<String> currentList= new ArrayList<String>();
    user() {
        System.out.println("This is our to do list");
    }

    void menu() {
        System.out.println();
            System.out.println("----------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------");
        System.out.println("0. Exit the program");
        System.out.println("1. Display to-do list");
        System.out.println("2. Add item to list");
        System.out.println("3. Remove item from list");
        System.out.println();
        System.out.print("Enter choice: ");
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();

        switch ((choice)) {
            case 0:
            System.out.println("Thanks");
            menu();
                break;
        
                case 1:
            System.out.println("Display");
            displayList();
            menu();
                break;

                case 2:
            System.out.println("Add");
            addItem();
            menu();
                break;

                case 3:
            System.out.println("Remove");
            removeItem();
            menu();
                break;
            default:
                break;
        }
        }
        void displayList() {
            System.out.println();
            System.out.println("----------------------");       
            System.out.println("To-Do List");
            System.out.println("----------------------");
            int number=0;
            for(String item: currentList) {
                System.out.println(++number+ " " + item);
            }
            System.out.println("----------------------");
        }
        void addItem() {
            System.out.println("Add Items");
            System.out.println("----------------------");
            System.out.println("Enter an item");
            Scanner sc= new Scanner(System.in);
            String item= sc.nextLine();
            currentList.add(item);
            displayList();
        }
        void removeItem() {
            System.out.println("Remove item");
            System.out.println("----------------------");
            Scanner sc= new Scanner(System.in);
            System.out.println("What do you want to remove");
            int index= sc.nextInt();
            if((index-1)<0 || (index-1)>currentList.size()) {
                System.out.println("Invalid index");
            }
            else {
                currentList.remove(index-1);
            }
            System.out.println("----------------------");
            displayList();
        }
    }
