import java.util.Scanner;
import java.util.ArrayList;
class Recipe
{

ArrayList<String> ShoppingList = new ArrayList<String>();
//The good stuff
  void Menu()
  {
    int option;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please create a shopping list, pick at least 1 appetizer, 1 drink BLABLABLABLABLABLA ACTUALLY FIX THIS ONCE DONE");
    System.out.println("Please pick a category to find the recipe you desire: \n 1. Appetizers \n 2. Drinks");
  //The list itself
    do
      {
        option = scanner.nextInt();
        System.out.println("\n");
        //The initial categories
        switch(option)
          {
              // - - - - - - - - - - - - - - 
              
              case 1:
              //Appetizers
              break;
              
              // - - - - - - - - - - - - - - 
              
              case 2:
              //Drinks
              int drinks = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(drinks)
              {
                case 1:
                  //Sodas
                  System.out.println("https://www.youtube.com/watch?v=OJcEj3GiReQ");
                  System.out.println("How on earth did you think you were going to make soda, do you own a factory????  Pick something realistic.");
                  ShoppingList.add("Soda"); //THIS IS AN EXAMPLE, THIS ONE SHOULD NOT WORK ITLL BE FUNNY
                  break;

                case 2:
                  //Juice
                  break;
              }
              break;
              
              // - - - - - - - - - - - - - - 
              
            case 3:
              //Breakfast
              break;
              
              // - - - - - - - - - - - - - - 
              
            case 4:
              //Desserts
              break;

              // - - - - - - - - - - - - - -               
              
            case 5:
              //Soups
              break;

              // - - - - - - - - - - - - - - 
              
            case 6:
              //Salads
              break;

              // - - - - - - - - - - - - - - 
              
            case 7:
              //Breads
              break;

              // - - - - - - - - - - - - - - 
              
            case 8:
              //Beef
              break;

              // - - - - - - - - - - - - - - 
              
            case 9:
              //Poultry
              break;

              // - - - - - - - - - - - - - - 
              
            case 10:
              //Pork
              break;

              // - - - - - - - - - - - - - - 
              
            case 11:
              //bread
              break;

              // - - - - - - - - - - - - - - 
              
            case 12:
              //bread
              break;

              // - - - - - - - - - - - - - - 
              
            case 13:
              //bread
              break;

              // - - - - - - - - - - - - - - 
              
            case 14:
              //bread
              break;

              // - - - - - - - - - - - - - - 
              
            case 15:
              //bread
              break;

              // - - - - - - - - - - - - - - 
              
            case 16:
              //bread
              break;

              // - - - - - - - - - - - - - -               



              
          }
      }while(option != 0);
    System.out.println(ShoppingList);




    
  }

  
}