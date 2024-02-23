package View;

import Controller.SearchController;
import Controller.SortController;


public class Main extends Menu<String> {

    static String[] menu = {"Sort", "Search", "Exit"};

    private final SortController sort =  new SortController();
    private final SearchController search =  new SearchController();
    public Main() {
        super("Menu", menu);
    }
    @Override
    public void execute(int n){
        switch(n){
            case 1:                                                                         
                sort.run();
                break;

            case 2:
                search.run();
                break;
          
            case 3:
                System.out.println("Exiting the program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choosen. Please try again!!");             
        }    
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}
