package Controller;

import Model.BubbleSortMenu;
import Model.QuickSortMenu;
import View.Menu;


public class SortController extends Menu<String> {

    static String[] menu = {"Bubble sort", "Quick sort", "Exit"};
    private final BubbleSortMenu bub =  new BubbleSortMenu();
    private final QuickSortMenu qui =  new QuickSortMenu();
    public SortController() {
        super("Sort Menu", menu);
    }
    @Override
    public void execute(int n){
        switch(n){
            case 1:                                                                         
                bub.BubbleSort();
                break;

            case 2:
                qui.QuickSort();
                break;
          
            case 3:
                System.out.println("Exiting the program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choosen. Please try again!!");             
        }    
    }
}

