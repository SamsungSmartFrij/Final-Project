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
              //first prompts, the type of food
              case 1:
              //Appetizers
              System.out.println("1 - French Fries\n2 - Breadsticks\n3 - Pigs in a Blanket");
              int appetizersint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories, specify which of that category
              switch(appetizersint)
                {
                  case 1:
                    //French Fries
                    System.out.println("INSERT FRENCH FRIES RECIPE");
                    System.out.println("Do you want to add French Fries to your cart?\n 1 - Yes\n2 - No");
                    appetizersint = scanner.nextInt();
                    //add to cart
                    switch(appetizersint)
                    {
                      case 1: 
                        ShoppingList.add(new Appetizers("French Fries"));
                        System.out.println("\nFrench Fries have been added to your cart!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                  case 2:
                    //Breadsticks
                    System.out.println("Make the dough: Place 1/4 cup warm water in the bowl of a mixer; sprinkle in the yeast and set aside until foamy, about 5 minutes. Add the flour, butter, sugar, fine salt and 1 1/4 cups plus 2 tablespoons warm water; mix with the paddle attachment until a slightly sticky dough forms, 5 minutes.\n Knead the dough by hand on a floured surface until very smooth and soft, 3 minutes. Roll into a 2-foot-long log; cut into 16 1 1/2-inch-long pieces. Knead each piece slightly and shape into a 7-inch-long breadstick; arrange 2 inches apart on a parchment-lined baking sheet. Cover with a cloth; let rise in a warm spot until almost doubled, about 45 minutes.\n Preheat the oven to 400 degrees F. Make the topping: Brush the breadsticks with 1 1/2 tablespoons of the butter and sprinkle with 1/4 teaspoon kosher salt. Bake until lightly golden, about 15 minutes. Meanwhile, combine the remaining 1/4 teaspoon salt with the garlic powder and oregano. Brush the warm breadsticks with the remaining 1 1/2 tablespoons melted butter and sprinkle with the flavored salt.");
                    System.out.println("Do you want to add Breadsticks to your cart?\n 1 - Yes\n2 - No");
                    appetizersint = scanner.nextInt();
                    //add to cart
                    switch(appetizersint)
                    {
                      case 1: 
                        ShoppingList.add(new Appetizers("Breadsticks"));
                        System.out.println("\nBreadsticks have been added to your cart!\n");
                        break;
                        
                      default:
                        break;
                    }
                }
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
    System.out.print("Shopping Cart: " );
    for(int i = 0; i < ShoppingList.size(); i++)
      {
        System.out.print(ShoppingList.get(i).getName() + ", ");
      }




    
  }

  
}