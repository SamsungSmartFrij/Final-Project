import java.util.Scanner;
import java.util.ArrayList;
class Recipe
{

ArrayList<Food> ShoppingList = new ArrayList<Food>();
//The good stuff
  void Menu()
  {
    int option;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please create a shopping list, pick at least 1 appetizer, 1 drink BLABLABLABLABLABLA ACTUALLY FIX THIS ONCE DONE \n");
   
  //The list itself
    do
      {
       System.out.println("Please pick a category to find the recipe you desire: \n 1. Appetizers \n 2. Drinks\n0. Exit");
        
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
              System.out.println("1 - Soda\n2 - Juice");
              int drinksint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(drinksint)
              {
                case 1:
                  //Sodas
                  System.out.println("https://www.youtube.com/watch?v=OJcEj3GiReQ \n");
                  System.out.println("How on earth did you think you were going to make soda, do you own a factory?  Pick something realistic. \n");
                  System.out.println("Do you want to add Soda to your cart?\n 1 - Yes\n2 - No");
                  drinksint = scanner.nextInt();
                    switch(drinksint)
                    {
                      case 1: 
                        ShoppingList.add(new Drinks("Soda"));
                        System.out.println("Soda has been added to your cart!");//THIS IS AN EXAMPLE, THIS ONE SHOULD NOT WORK ITLL BE FUNNY
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                  //Juice
                  System.out.println("Start by washing and then coring the apple to remove seeds. Cut the apples into slices. There is no need to peel the apples.\n

Add the apples to the pot and add enough water to just cover them. Too much water and you’ll have pretty diluted juice. This juice may come out a bit strong, but it’s a lot easier to dilute the juice with extra water rather than trying to make the flavor stronger.\n

Slowly boil the apples for about 20-25 minutes or until the apples are quite soft. Place a coffee filter or piece of cheesecloth in your fine mesh strainer and place over a bowl.\n

Slowly ladle the hot juice/apple mixture into a fine mesh strainer and gently mash the apples. The juice will be filtered through the bottom into your bowl while the apple mush will be left behind. Place the mush in a separate bowl for later. Repeat this process until all of your juice is in the bowl.\n

Taste the juice after it’s cooled for a bit. You can add additional sugar or cinnamon depending on your preferences. Again, if the flavor is too strong, you can add water a little bit at a time to weaken the flavor.\n

The apple mush you collected can easily be turned into applesauce by pureeing and adding a smidgen of sugar and cinnamon to taste.");
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

            case 0:
              break;



              
          }
      }while(option != 0);
    for(int i = 0; i < ShoppingList.size(); i++)
      {
        System.out.print(ShoppingList.get(i).getName() + " ");
      }




    
  }

  
}