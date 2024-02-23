package Controller;

import Model.BinarySearch;
import Model.LinearSearch;
import View.Menu;

public class SearchController extends Menu<String> {
    LinearSearch Lin = new LinearSearch ();
    BinarySearch Bin = new BinarySearch ();
    static String[] menu = {"Linear Search", "Binary Search", "Exit"};
    
    
    public SearchController() {
        super("Search Menu", menu);
    }

    @Override
    public void execute(int n) {
       switch(n){
            case 1:                                                                         
                Lin.Linear();
                break;
            case 2:
                Bin.Binary();
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
