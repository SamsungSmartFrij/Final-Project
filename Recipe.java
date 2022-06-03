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
       System.out.println("Please pick a category to find the recipe you desire:\n1. Appetizers\n2. Drinks\n3. Breakfast\n4. Desserts\n5. Soups\n6. Salads\n7. Breads\n8. Beef\n9. Chicken\n10. Pork\n0. Finish/Return");
        
        option = scanner.nextInt();
        System.out.println("\n");
        //The initial categories
        switch(option)
          {
              // - - - - - - - - - - - - - - 
              //first prompts, the type of food
              case 1:
              //Appetizers
              System.out.println("Appetizers:\n1 - French Fries\n2 - Breadsticks\n3 - Pigs in a Blanket");
              int appetizersint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories, specify which of that category
              switch(appetizersint)
                {
                  case 1:
                    //French Fries
                    System.out.println("Peel and rinse the potatoes. Then cut them into sticks by cutting the potato in 4 or 5 vertical pieces, and then cutting each piece into sticks.\nPlace them in a large bowl and cover with cold water. Allow them to soak, 2 to 3 hours. You can also stick them in the fridge and let them soak overnight.\nWhen you're ready to make the fries, drain off the water and lay the potatoes on 2 baking sheets lined with paper towels. Blot with paper towels to dry them.\nHeat a few inches of oil in a heavy pot to 300 degrees F. In 3 or 4 batches, cook the potatoes until soft, 4 to 5 minutes per batch. They should not be brown at this point! You just want to start the cooking process. Remove each batch and drain on new/dry paper towels.\nOnce all the potatoes have been fried at 300 degrees F, turn up the heat until the oil reaches 400 degrees F. When the oil's hot, start frying the potatoes in batches again, cooking until the fries are golden and crisp. Remove the potatoes from the oil and drain on paper towels.\n");
                    System.out.println("Do you want to add French Fries to your list?\n 1 - Yes\n2 - No");
                    appetizersint = scanner.nextInt();
                    //add to cart
                    switch(appetizersint)
                    {
                      case 1: 
                        ShoppingList.add(new Appetizers("French Fries"));
                        System.out.println("\nFrench Fries have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                  case 2:
                    //Breadsticks
                    System.out.println("Make the dough: Place 1/4 cup warm water in the bowl of a mixer; sprinkle in the yeast and set aside until foamy, about 5 minutes. Add the flour, butter, sugar, fine salt and 1 1/4 cups plus 2 tablespoons warm water; mix with the paddle attachment until a slightly sticky dough forms, 5 minutes.\n Knead the dough by hand on a floured surface until very smooth and soft, 3 minutes. Roll into a 2-foot-long log; cut into 16 1 1/2-inch-long pieces. Knead each piece slightly and shape into a 7-inch-long breadstick; arrange 2 inches apart on a parchment-lined baking sheet. Cover with a cloth; let rise in a warm spot until almost doubled, about 45 minutes.\n Preheat the oven to 400 degrees F. Make the topping: Brush the breadsticks with 1 1/2 tablespoons of the butter and sprinkle with 1/4 teaspoon kosher salt. Bake until lightly golden, about 15 minutes. Meanwhile, combine the remaining 1/4 teaspoon salt with the garlic powder and oregano. Brush the warm breadsticks with the remaining 1 1/2 tablespoons melted butter and sprinkle with the flavored salt.\n");
                    System.out.println("Do you want to add Breadsticks to your list?\n 1 - Yes\n2 - No");
                    appetizersint = scanner.nextInt();
                    //add to cart
                    switch(appetizersint)
                    {
                      case 1: 
                        ShoppingList.add(new Appetizers("Breadsticks"));
                        System.out.println("\nBreadsticks have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                  case 3:
                    System.out.println("Preheat the oven to 375°. Working quickly while cold, unroll the crescent dough sheet on a lightly floured surface and separate the perforated dough into 8 triangles. Cut each dough triangle into three equal skinny triangles.\nPlace one cocktail sausage on the wide base of one skinny triangle. Roll the sausage toward the pointed end of the triangle, allowing the dough to overlap and wrap around the sausage. Place the rolled sausage on a parchment-lined baking sheet, point-side down. Repeat with the remaining dough triangles and sausages.\nWhisk together the egg with 1 teaspoon water in a small bowl until smooth. Brush the egg wash over the dough and sprinkle with the everything bagel seasoning, if desired. Bake at 375° until the dough is puffed and golden brown, 12 to 15 minutes.\n");
                System.out.println("Do you want to add Pigs in a Blanket to your cart?\n 1 - Yes\n2 - No");  
                    appetizersint = scanner.nextInt();
                    //add to cart
                    switch(appetizersint)
                    {
                      case 1: 
                        ShoppingList.add(new Appetizers("Pigs in a Blanket"));
                        System.out.println("\nPigs in a Blanket have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                }
              break;
              
              // - - - - - - - - - - - - - - 
              
              case 2:
              //Drinks
              System.out.println("Drinks:\n1 - Soda\n2 - Apple Juice");
              int drinksint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(drinksint)
              {
                case 1:
                  //Sodas
                  System.out.println("https://www.youtube.com/watch?v=OJcEj3GiReQ \n");
                  System.out.println("How on earth did you think you were going to make soda, do you own a factory?  But I guess go ahead. \n");
                  System.out.println("Do you want to add Soda to your list?\n 1 - Yes\n2 - No");
                  drinksint = scanner.nextInt();
                    switch(drinksint)
                    {
                      case 1: 
                        ShoppingList.add(new Drinks("Soda"));
                        System.out.println("Soda has been added to your list!");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                  //Apple Juice
                  System.out.println("Wash the apples and then core them—there's no need to peel them. Slice or dice the apples.\nPut the apples in a large Dutch oven or stockpot 7 quarts or larger and cover with water. The apples will float, so press them down a bit as you add the water. The water should come to the top of the apples. Too much, and the juice will be weak and will need more time for reduction.\nPlace the apples over high heat and bring to a boil, this will take about 10 to 15 minutes. Reduce the heat to medium-low; gently boil the apples for 40 minutes.\nStrain the apples through a fine-mesh strainer, pressing to extract as much juice as possible; return the juice to the pot. Alternatively, line a strainer or colander with a double thickness of cheesecloth or use a nut milk bag. Taste the strained juice and add sugar and cinnamon sticks, if desired. Taste and simmer until the sugar is dissolved. If the flavor is a bit weak, continue to simmer until the flavor is more concentrated.\nUse a food mill or chinois to make applesauce from the leftover apple mush, if desired. Add some sugar and cinnamon, to taste.\n");
                  System.out.println("Do you want to add Apple Juice to your list?\n 1 - Yes\n2 - No");
                  drinksint = scanner.nextInt();
                    switch(drinksint)
                    {
                      case 1: 
                        ShoppingList.add(new Drinks("Apple Juice"));
                        System.out.println("Apple Juice has been added to your list!");
                        break;
                        
                      default:
                        break;
                    }
                  break;
              }
              break;
              
              // - - - - - - - - - - - - - - 
              
            case 3:
              //Breakfast
              System.out.println("Breakfast:\n1 - Bacon\n2 - Hashbrowns\n3 - Sausage");
              int breakfastint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(breakfastint)
              {
                case 1:
                  //bacon
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add bacon to your list?\n 1 - Yes\n2 - No");
                  breakfastint = scanner.nextInt();
                    switch(breakfastint)
                    {
                      case 1: 
                        ShoppingList.add(new Breakfast("Bacon"));
                        System.out.println("\nBacon has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                  //Hashbrowns
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add hashbrowns to your list?\n 1 - Yes\n2 - No");
                  breakfastint = scanner.nextInt();
                    switch(breakfastint)
                    {
                      case 1: 
                        ShoppingList.add(new Breakfast("Hashbrowns"));
                        System.out.println("\nHashbrowns have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                case 3:
                  //Sausage
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add sausage to your list?\n 1 - Yes\n2 - No");
                  breakfastint = scanner.nextInt();
                    switch(breakfastint)
                    {
                      case 1: 
                        ShoppingList.add(new Breakfast("Sausage"));
                        System.out.println("\nSausage has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
              }
              break;
              
              // - - - - - - - - - - - - - - 
              
            case 4:
              //Desserts
              System.out.println("Desserts:\n1 - Cake\n2 - Cupcakes\n3 - Ice Cream");
              int dessertint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(dessertint)
              {
                case 1:
                  //Cake
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add cake to your list?\n 1 - Yes\n2 - No");
                  dessertint = scanner.nextInt();
                    switch(dessertint)
                    {
                      case 1: 
                        ShoppingList.add(new Dessert("Cake"));
                        System.out.println("\nCake has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                  case 2:
                  //Cupcakes
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add cupcakes to your list?\n 1 - Yes\n2 - No");
                  dessertint = scanner.nextInt();
                    switch(dessertint)
                    {
                      case 1: 
                        ShoppingList.add(new Dessert("Cupcakes"));
                        System.out.println("\nCupcakes have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                  case 3:
                  //Ice Cream
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add ice cream to your list?\n 1 - Yes\n2 - No");
                  dessertint = scanner.nextInt();
                    switch(dessertint)
                    {
                      case 1: 
                        ShoppingList.add(new Dessert("Ice Cream"));
                        System.out.println("\nIce cream has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

              }
break;
              // - - - - - - - - - - - - - -               
              
            case 5:
              //Soups
              System.out.println("Soups:\n1 - Chicken Noodle Soup\n2 - Mushroom Soup");
              int soupint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(soupint)
              {
                case 1:
                  //Chicken Noodle Soup
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add chicken noodle soup to your list?\n 1 - Yes\n2 - No");
                  soupint = scanner.nextInt();
                    switch(soupint)
                    {
                      case 1: 
                        ShoppingList.add(new Soup("Chicken Noodle Soup"));
                        System.out.println("\nchicken noodle soup has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                    //Mushroom Soup
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add mushroom soup to your list?\n 1 - Yes\n2 - No");
                  soupint = scanner.nextInt();
                    switch(soupint)
                    {
                      case 1: 
                        ShoppingList.add(new Soup("Mushroom Soup"));
                        System.out.println("\nMushroom soup has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

              }
break;
              // - - - - - - - - - - - - - - 
              
            case 6:
              //Salads
              System.out.println("Salads:\n1 - Caeser Salad\n2 - Coleslaw");
              int saladint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(saladint)
              {
                case 1:
                  //Caeser Salad
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add caeser salad to your list?\n 1 - Yes\n2 - No");
                  saladint = scanner.nextInt();
                    switch(saladint)
                    {
                      case 1: 
                        ShoppingList.add(new Salad("Caeser Salad"));
                        System.out.println("\nCaeser salad has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                  //Coleslaw
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add coleslaw to your list?\n 1 - Yes\n2 - No");
                  saladint = scanner.nextInt();
                    switch(saladint)
                    {
                      case 1: 
                        ShoppingList.add(new Salad("Coleslaw"));
                        System.out.println("\nColeslaw has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
              }
break;
              // - - - - - - - - - - - - - - 
              
            case 7:
              //Bread
              System.out.println("Breads:\n1 - Sourdough\n2 - White Bread\n3 - French Bread");
              int breadint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(breadint)
              {
                case 1:
                  //Sourdough
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add sourdough to your list?\n 1 - Yes\n2 - No");
                  breadint = scanner.nextInt();
                    switch(breadint)
                    {
                      case 1: 
                        ShoppingList.add(new Bread("Sourdough"));
                        System.out.println("\nSourdough has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                    //White Bread
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add white bread to your list?\n 1 - Yes\n2 - No");
                  breadint = scanner.nextInt();
                    switch(breadint)
                    {
                      case 1: 
                        ShoppingList.add(new Bread("White Bread"));
                        System.out.println("\nWhite bread has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                  
                case 3:
                    //French Bread
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add French bread to your list?\n 1 - Yes\n2 - No");
                  breadint = scanner.nextInt();
                    switch(breadint)
                    {
                      case 1: 
                        ShoppingList.add(new Bread("French Bread"));
                        System.out.println("\nFrench bread has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

              }
break;
              // - - - - - - - - - - - - - - 
              
            case 8:
              //Beef
              //https://bestbeefrecipes.com/best-beef-recipes/
              System.out.println("Beefs:\n1 - Short Ribs\n2 - Brisket\n3 - Steak");
              int beefint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(beefint)
              {
                case 1:
                  //Short Ribs
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add short ribs to your list?\n 1 - Yes\n2 - No");
                  beefint = scanner.nextInt();
                    switch(beefint)
                    {
                      case 1: 
                        ShoppingList.add(new Beef("Short Ribs"));
                        System.out.println("\nShort ribs have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                  //Brisket
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add brisket to your list?\n 1 - Yes\n2 - No");
                  beefint = scanner.nextInt();
                    switch(beefint)
                    {
                      case 1: 
                        ShoppingList.add(new Beef("Brisket"));
                        System.out.println("\nBrisket has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                case 3:
                  //Steak
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add steak to your list?\n 1 - Yes\n2 - No");
                  beefint = scanner.nextInt();
                    switch(beefint)
                    {
                      case 1: 
                        ShoppingList.add(new Beef("Steak"));
                        System.out.println("\nSteak has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

              }
break;
              // - - - - - - - - - - - - - - 
              
            case 9:
              //Chicken
              System.out.println("Chicken:\n1 - Chicken Breast\n2 - Chicken Wings");
              int chickenint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(chickenint)
              {
                case 1:
                  //Chicken Breast
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add chicken breast to your list?\n 1 - Yes\n2 - No");
                  chickenint = scanner.nextInt();
                    switch(chickenint)
                    {
                      case 1: 
                        ShoppingList.add(new Chicken("Chicken Breast"));
                        System.out.println("\nChicken breast has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                  //Chicken Wings
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add chicken wings to your list?\n 1 - Yes\n2 - No");
                  chickenint = scanner.nextInt();
                    switch(chickenint)
                    {
                      case 1: 
                        ShoppingList.add(new Chicken("Chicken Wings"));
                        System.out.println("\nChicken wings have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

              }
break;
              // - - - - - - - - - - - - - - 
              
            case 10:
              //Pork
              System.out.println("Pork:\n1 - Pork Chops\n2- Pork Ribs\n3 - Pork Shoulder");
              int porkint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(porkint)
              {
                case 1:
                  //Pork Chops
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add pork chops to your list?\n 1 - Yes\n2 - No");
                  porkint = scanner.nextInt();
                    switch(porkint)
                    {
                      case 1: 
                        ShoppingList.add(new Pork("Pork Chops"));
                        System.out.println("\nPork chops has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                    //Pork Ribs
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add pork ribs to your list?\n 1 - Yes\n2 - No");
                  porkint = scanner.nextInt();
                    switch(porkint)
                    {
                      case 1: 
                        ShoppingList.add(new Pork("Pork Ribs"));
                        System.out.println("\nPork ribs have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                case 3:
                    //Pork Shoulder
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add pork shoulder to your list?\n 1 - Yes\n2 - No");
                  porkint = scanner.nextInt();
                    switch(porkint)
                    {
                      case 1: 
                        ShoppingList.add(new Pork("Pork Shoulder"));
                        System.out.println("\nPork shoulder has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

              }
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