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
    System.out.println("Please create a shopping list, pick at least 1 appetizer, 1 drink, 1 dessert, 2 breads, and 1 beef item. \n");
   
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
                    //add to cart, pick yes or no
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
                System.out.println("Rinse the pork belly and pat dry. Transfer to a resealable 2-gallon plastic bag. To make the spice rub, mix the kosher salt, pink salt, brown sugar, honey, red pepper flakes, paprika and cumin in a bowl. Coat the pork belly all over with the mixture.\nClose the bag and refrigerate 7 to 10 days, flipping once a day, until the pork belly feels firm. It should take 7 days for a thin belly that is about 11/2 inches thick, longer for a belly that's 2 to 3 inches thick.\nRemove the pork belly from the bag, rinse thoroughly and pat dry. Refrigerate the belly on a rack, uncovered, 48 hours.\nSet up your smoker according to the manufacturer's instructions using applewood chips, and set to 200 degrees F. Smoke the pork belly 3 hours, or until the bacon reaches an internal temperature of 150 degrees F.\nRemove the rind (optional), then slice and cook as desired. To store, wrap the bacon in plastic wrap and refrigerate up to 1 week or freeze up to 2 months.\nPink curing salt is a mix of salt and sodium nitrite. It keeps the meat pink and protects it from bacteria. You can find it at specialty food stores or online.\n");
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
                System.out.println("Melt butter in a one cup measure in microwave. Heat non stick skillet over medium high heat. Shred potatoes on hand held grater. Squeeze out liquid from potatoes. Add some butter to skillet and add shredded potatoes and press down with spatula. Season with salt and pepper and drizzle potatoes with more butter. Cook until golden brown and then flip. Finish cooking in hot oven for 15 minutes.\n");
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
                System.out.println("Combine diced pork with all other ingredients and chill for 1 hour. Using the fine blade of a grinder, grind the pork. Form into 1-inch rounds. Refrigerate and use within 1 week or freeze for up to 3 months. For immediate use, saute patties over medium-low heat in a non-stick pan. Saute until brown and cooked through, approximately 10 to 15 minutes.\n");
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
              System.out.println("Desserts:\n1 - Vanilla Cake\n2 - Vanilla Cupcakes\n3 - Vanilla Ice Cream");
              int dessertint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(dessertint)
              {
                case 1:
                  //Cake
                System.out.println("For the cake: Preheat the oven to 350 degrees F. Butter the bottoms and sides of two 9-inch round cake pans; dust with flour, and tap out the excess.\nWhisk together the flour, baking powder and salt in a medium bowl; set aside.\nBeat the butter, sugar and oil in a large bowl with an electric mixer on medium-high speed until light in color and fluffy, about 5 minutes. Beat in the eggs, one at a time, and then the vanilla until combined.\nAlternate folding the flour mixture and the milk into the batter with a spatula, adding the flour in three additions and the milk in two, starting and ending with the flour, until just smooth. Divide the batter evenly between the prepared pans.\nBake the cakes on the same oven rack until golden on top and the centers spring back to the touch, 35 to 40 minutes. Rotate the pans about halfway through if they seem to be browning unevenly. Let cool in the pans about 10 minutes, then turn out onto cooling racks and let cool completely.\nFor the frosting: While the cakes cool, beat the butter and salt in a large bowl with an electric mixer on medium speed until smooth. Gradually beat in the confectioners' sugar. Once it's all been added, increase the speed to medium-high, and beat until white and fluffy. Add 2 tablespoons of the milk, and beat to incorporate. Beat in the remaining milk, one tablespoon at a time, the frosting will be spreadable but not runny.\nTo assemble: Place 1 cake layer right-side up on a cake plate or stand, and spread with 1 cup of the frosting. Top with the second cake layer. Frost the top and sides of the cake with the remaining frosting.\n");
                  System.out.println("Do you want to add vanilla cake to your list?\n 1 - Yes\n2 - No");
                  dessertint = scanner.nextInt();
                    switch(dessertint)
                    {
                      case 1: 
                        ShoppingList.add(new Dessert("Vanilla Cake"));
                        System.out.println("\nVanilla cake has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                  case 2:
                  //Cupcakes
                System.out.println("Preheat the oven to 350 degrees F and position a rack in the middle of the oven. Line one 12-cup standard muffin tin or two 24-cup mini-muffin tins with cupcake liners.\nWhisk the flour, baking powder and salt together in a medium bowl.\nIn another medium bowl, beat the eggs and sugar with an electric mixer until light and foamy, about 2 minutes. While beating, gradually pour in the melted butter and then the vanilla.\nWhile mixing slowly, add half of the flour mixture. Then add all the milk, followed by the remaining flour mixture; take care not to overmix the batter. Divide the batter evenly in the prepared muffin tin.\nBake until a cake tester inserted into the center of the cupcakes comes out clean, rotating the tin about halfway through baking time, 18 to 20 minutes for standard cupcakes or 10 to 12 minutes for minis. Cool the cupcakes in the tin on a rack for 10 minutes, then remove from the tin and cool on the rack completely. Frost and decorate as desired.\n");
                  System.out.println("Do you want to add vanilla cupcakes to your list?\n 1 - Yes\n2 - No");
                  dessertint = scanner.nextInt();
                    switch(dessertint)
                    {
                      case 1: 
                        ShoppingList.add(new Dessert("Vanilla Cupcakes"));
                        System.out.println("\nVanilla cupcakes have been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;
                  case 3:
                  //Ice Cream
                System.out.println("Whisk the cream, milk, sugar, vanilla and 1/2 teaspoon salt in a medium saucepan and bring to a simmer over medium heat. Beat the egg yolks in a medium bowl. Slowly whisk 1 cup of the hot cream mixture into the beaten yolks, then pour back into the saucepan, whisking, and return to medium heat. Cook, stirring constantly with a wooden spoon, until the mixture thickens, coats the spoon and reaches 180 degrees F on a thermometer, 6 to 8 minutes. Remove from the heat and strain the custard through a fine-mesh sieve into a large bowl or measuring cup; discard the solids. Stir often until the mixture cools to room temperature. Lightly press plastic wrap directly against the surface of the custard to prevent a skin from forming. Chill until cold, about 3 hours. For faster chilling, set the bowl of custard in a bowl of ice water and stir until cold.\nFreeze the mixture in an ice cream machine according to the manufacturer's instructions. Take care not to over-churn the ice cream or it can have a grainy texture. Place the ice cream in the freezer to set up for at least 1 hour. Serve.\n");
                  System.out.println("Do you want to add vanilla ice cream to your list?\n 1 - Yes\n2 - No");
                  dessertint = scanner.nextInt();
                    switch(dessertint)
                    {
                      case 1: 
                        ShoppingList.add(new Dessert("Vanilla Ice Cream"));
                        System.out.println("\nVanilla ice cream has been added to your list!\n");
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
                System.out.println("Place a soup pot over medium heat and coat with the oil. Add the onion, garlic, carrots, celery, thyme and bay leaf. Cook and stir for about 6 minutes, until the vegetables are softened but not browned. Pour in the chicken stock and bring the liquid to a boil. Add the noodles and simmer for 5 minutes until tender. Fold in the chicken, and continue to simmer for another couple of minutes to heat through; season with salt and pepper. Sprinkle with chopped parsley before serving.\nChicken Stock:\nPlace the chicken and vegetables in a large stockpot over medium heat. Pour in only enough cold water to cover, about 3 quarts; too much will make the broth taste weak. Toss in the thyme, bay leaves, and peppercorns, and allow it to slowly come to a boil. Lower the heat to medium-low and gently simmer for 1 to 1 1/2 hours, partially covered, until the chicken is done. As it cooks, skim any impurities that rise to the surface; add a little more water if necessary to keep the chicken covered while simmering.\nCarefully remove the chicken to a cutting board. When its cool enough to handle, discard the skin and bones; hand-shred the meat into a storage container.\nCarefully strain the stock through a fine sieve into another pot to remove the vegetable solids. Use the stock immediately or if you plan on storing it, place the pot in a sink full of ice water and stir to cool down the stock. Cover and refrigerate for up to one week or freeze.\n");
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
                System.out.println("Sprinkle the mushrooms with lemon juice. In a food processor, coarsely chop them.\nMelt the butter in a heavy saucepan and lightly saute the shallots. Add the mushrooms, thyme, and bay leaf and saute over moderate heat for 10 minutes, or until the liquid disappears. Add the salt, pepper, cream, and chicken stock and bring to a boil. Reduce the heat and simmer for 20 minutes.\nAdd the cornstarch to the soup and continue to simmer 10 minutes longer, stirring constantly. Correct seasoning to taste.\nServe in warm bowls. Sprinkle with minced parsley.\n");
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
                  //Caesar Salad
                System.out.println("Preheat the oven to 350 degrees F.\nLay out the bacon on a small pan and bake until crispy, about 15 minutes.\nToss the sourdough cubes with the grapeseed oil and some salt and pepper. Transfer to a baking sheet; bake until crispy, 5 to 10 minutes.\nSplit the romaine heart and remove the core. Wash, dry and lay on a plate. Season with salt and pepper.\nPour the dressing over the romaine wedges. Top with the crispy bacon, Parmesan and a few croutons.\n");
                  System.out.println("Do you want to add caesar salad to your list?\n 1 - Yes\n2 - No");
                  saladint = scanner.nextInt();
                    switch(saladint)
                    {
                      case 1: 
                        ShoppingList.add(new Salad("Caesar Salad"));
                        System.out.println("\nCaesar salad has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
                  //Coleslaw
                System.out.println("In a large bowl, combine cabbage and carrots. In a smaller bowl, make dressing by combining mayonnaise, vinegar, celery seed, sugar, salt and pepper. Toss dressing into cabbage mixture and let chill. Serve in a family style bowl.\n");
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
                System.out.println("For the levain: Combine the all-purpose flour, whole-wheat flour, water and starter in a medium bowl and mix to combine. Cover and let sit at room temperature until bubbly and increased in volume by about 20 percent, about 8 hours.\nFor the dough: Add the all-purpose flour, water and whole-wheat flour to the bowl of a stand mixer fitted with a dough hook. Weigh out 7 ounces of the levain, about 1 cup, and add to the mixer, discard any remaining levain. Mix on low until a shaggy dough forms. Cover the bowl and let sit at room temperature for 30 minutes.\nAdd the salt to the dough and mix on medium speed for 2 minutes; the dough should feel a bit sticky and wet but look smooth and very stretchy. Scrape the dough into a plastic or glass container about twice its size. Cover and let sit at room temperature until puffed, about 45 minutes.\nPut the dough on a floured work surface, flatten it gently, then fold in thirds like a business letter. Transfer it back to the container. Cover and let sit at room temperature for 45 minutes.\nRepeat the folding process one more time, transfer back to the container, cover and let sit at room temperature for another 45 minutes. After the third 45-minute rest, the dough should feel soft and pillowy; when pressed with a finger, it should leave an indentation that begins to spring back.\nGently scrape the dough onto a lightly floured work surface. Divide in half using a bench scraper. Shape each piece loosely into a round by gently tucking the edges under. Cover with a kitchen towel and let rest for 30 minutes.\nDrape 2 kitchen towels into 2 medium 8-inch bowls and dust very generously with flour. Dust the top of the dough rounds very lightly with flour and flip over using a bench scraper. Flatten one piece of dough into a circle, then fold the left and right sides of the dough over the center. Keeping tension in the dough, begin folding down from the top edge in 3 segments, sealing the bottom edge with the last fold. Loosely cup the dough and, using your hands and the tension between the board and the dough, pull the bread very slowly towards yourself while creating a taut ball. Gently flip the dough ball over and into one of the prepared bowls. Cover loosely with another kitchen towel. Repeat the process with the second piece of dough. Place both in a warm place to rise until about 1 1/2 times their size, 2 to 2 1/2 hours.\nAbout 20 minutes before baking, position an oven rack in the lower third of the oven, put a 4-quart Dutch oven and lid on the rack and preheat to 500 degrees F. When preheated, carefully transfer the hot Dutch oven to a heatsafe surface with oven mitts (leave the lid in the oven). Flip one round of dough over into the Dutch oven. Using a sharp knife, scissors or bread lame, score the top of the bread in a cross or desired pattern. Return to the oven, immediately cover with the lid and bake for 20 minutes. Lower the temperature to 425 degrees F, uncover and bake until dark brown, about 10 minutes more. Transfer the bread to a cooling rack to cool completely. Return the empty Dutch oven to the oven, raise the temperature to 500 degrees F and let heat for 10 minutes before repeating the baking process with the second dough round.\n");
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
                System.out.println("In a small saucepan, heat the milk with butter over low heat just until the butter melts. Remove from heat and add to the bowl of a standing mixer fitted with a dough hook. Proof the yeast by adding it to the warm milk and butter. Add the sugar and stir gently to dissolve. Let stand 3 minutes until foam appears. This indicates the yeast is active. Turn mixer on low and gradually add the flour. When the dough starts to come together, increase the speed to medium and add the salt and 1 egg white. Stop the machine periodically to scrape the dough off the hook. Mix until the dough is no longer sticky, about 10 minutes.\nTurn the dough onto the work surface and knead for a minute or so by hand. Knead by folding the dough over itself and pushing out with the heel of your hands, not down. Rotate the dough and repeat. The dough is properly kneaded when you can pull it and it stretches without breaking. Form the dough into a round and place in an oiled bowl, turn to coat the entire ball with oil. Cover with plastic wrap or a damp towel and let rise over a gas pilot light on the stovetop or in another warm place until doubled in size, about 45 minutes. Test the dough by pressing 2 fingers into it. If indents remain, the dough is adequately risen.\nOnce the dough is doubled and domed, turn it out onto the counter. The act of turning out the dough naturally deflates the gas, so there is no need to aggressively punch it down. Handle the dough gently, overworking the gluten at this point will produce a dense loaf that is difficult to shape. *To form a loaf, pat the dough into a rectangle, fold the long sides to the middle then fold under the ends. Pinch the seams closed and place in a greased 9 by 5-inch loaf pan, seam side down. Make sure the dough touches all sides of the pan. Cover with plastic wrap and let rise a second time for 20 minutes or until the top of the dough is nearly level with the top of the loaf pan. Preheat oven to 350 degrees F, place a large pan on the bottom rack of the oven. Bring 3 cups water to a boil on the stove. Pour the hot water into the preheated pan to create a steam bath for the bread. This will make a crisp crust.\nSlash dough down the middle of the loaf with a sharp knife to allow the steam to escape during baking. Brush the top with remaining beaten egg white and sprinkle with sesame seeds. Bake the bread for 30 to 40 minutes until crust is golden and internal temperature reads 195 degrees F when checked with an instant read thermometer. The bottom of the loaf should sound hollow when tapped. Immediately remove the bread from the pan and cool completely on a rack.\n");
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
                System.out.println("Place all ingredients except for the cornmeal, in the order listed into the bread pan fitted with the kneading paddle and secure in the Cuisinart Bread Maker. Press menu button to select the dough program. Press start to mix, knead and rise. For best mixing results, scrape the pan 10 to 15 minutes after the program has started.\nWhen cycle is completed, remove dough and transfer to a lightly floured surface. Punch to deflate and let rest for 10 minutes.\nDivide dough into two equal pieces. Shape each piece of dough into a long narrow baguette and place on a baking sheet that has been dusted with cornmeal. Cover loosely with plastic wrap and let rise 30 to 40 minutes. While baguettes rise, place a pan of hot water on the bottom rack of the oven and preheat to 425 degrees F.\nDust dough gently with additional flour. Make 4 diagonal slashes in each loaf about 1/4-inch deep using a serrated knife. Bake bread in preheated oven 25 to 30 minutes until browned and hollow sounding when tapped. Cool on a wire rack. Bread slices best when allowed to cool completely.\n");
                  System.out.println("Do you want to add French bread baguettes to your list?\n 1 - Yes\n2 - No");
                  breadint = scanner.nextInt();
                    switch(breadint)
                    {
                      case 1: 
                        ShoppingList.add(new Bread("French Bread Baguettes"));
                        System.out.println("\nFrench bread baguettes has been added to your list!\n");
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
                System.out.println("Coat the short ribs liberally with the Brown Sugar Rub on both sides. It is not necessary to rub the spices into the meat, rather sprinkle an even layer over the top. Refrigerate overnight.\nPreheat your smoker to 225 degrees F. Add a log of hickory.\nPlace the meat in the smoker and maintain temperature at or around 225 degrees F for 12 to 14 hours, or until done. Replace the hickory logs as they expire.\nTest the meat by twisting one of the exposed bones. If the bone moves easily the meat is done. Allow the meat to rest for 30 minutes. Cut each plate into 4 portions. Serve with BBQ sauce.\n");
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
                System.out.println("Preheat the oven to 350 degrees F.\nMake a dry rub by combining chili powder, salt, garlic and onion powders, black pepper, sugar, dry mustard, and bay leaf. Season the raw brisket on both sides with the rub. Place in a roasting pan and roast, uncovered, for 1 hour.\nAdd beef stock and enough water to yield about 1/2 inch of liquid in the roasting pan. Lower oven to 300 degrees F, cover pan tightly and continue cooking for 3 hours, or until fork-tender.\nTrim the fat and slice meat thinly across the grain. Top with juice from the pan.\n");
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
                System.out.println("About 20 minutes before grilling, remove the steaks from the refrigerator and let sit, covered, at room temperature.\nHeat your grill to high. Brush the steaks on both sides with oil and season liberally with salt and pepper. Place the steaks on the grill and cook until golden brown and slightly charred, 4 to 5 minutes. Turn the steaks over and continue to grill 3 to 5 minutes for medium-rare, an internal temperature of 135 degrees F, 5 to 7 minutes for medium, 140 degrees F or 8 to 10 minutes for medium-well, 150 degrees F.\nTransfer the steaks to a cutting board or platter, tent loosely with foil and let rest 5 minutes before slicing.\n");
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
                System.out.println("Using a pastry brush, lightly coat a chicken breast with mustard on all sides. Place in bread crumbs and firmly press down. Turn and repeat until entire breast is coated with crumbs. Set aside and repeat with remaining five breasts.\nPreheat oven to 350 degrees. Meanwhile, heat half the butter or olive oil in a 10-inch saute pan over medium heat for 30 seconds. Add 3 breasts and cook for about 2 minutes, until golden brown. Remove to a baking sheet and repeat with the remaining 3 breasts. Set baking sheet in hot oven for 10 minutes. Remove and cover to keep warm. Serve with Morel Sauce, if desired.\n");
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
                System.out.println("Spray the basket of a 3.5-quart air fryer with cooking spray and set aside. Pat the chicken wings dry and sprinkle generously with salt. Place the wings in the fryer basket so they are not touching, if necessary to fit, line up the drumettes standing upright along the sides. Set the air fryer to 360 degrees F and cook for 12 minutes, then flip the wings with tongs and cook for 12 minutes more. Flip the wings again, increase the heat to 390 degrees F and cook until the outsides are extra-crispy, about 6 minutes more.\nMeanwhile, warm the butter in a microwave-safe bowl in the microwave until melted, about 1 minute. Whisk in the hot sauce.\nToss the wings with the butter mixture to coat in a large bowl and serve with dressing on the side.\n");
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
                System.out.println("Begin by making the marinade. In a small bowl, whisk together the honey, oil, vinegar, cumin and red pepper flakes. Easy, right?\nSprinkle both sides of the pork chops with salt and pepper and place in a re-sealable plastic bag with the marinade. Let rest on the counter for 1 hour. That's easy.\nHeat a grill or grill pan over medium heat. Remove the pork chops from the bag and lightly sprinkle with salt and pepper. Place on the grill and cook until the pork chop releases from the grill, about 4 minutes. Flip and cook on the other side for another 3 minutes. If using a grill pan, be sure to do in batches so you don't steam the chops. And don't worry if you have neither; you can do this in a pan. See, easy!\n");
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
                System.out.println("For the ribs: In a medium saucepan, combine the soy sauce, brown sugar, molasses, salt and 1 cup water. Bring to a boil and set aside to cool to room temperature.\nPut the ribs in a large, turkey-sized baking bag or sealable plastic bag. Support the bag in a 12-by-14-inch baking pan. Pour the marinade over the ribs and seal the bag. Marinate the ribs in the refrigerator for a few hours, turning the bag occasionally to thoroughly coat the meat.\nPreheat the oven to 375 degrees F.\nDrain and discard the marinade. Cut four slits in the top of the baking bag, if you are using one. Otherwise, remove the ribs, transfer them to the baking pan, and cover the pan with foil or a lid. Bake for 2 hours.\nFor the barbecue sauce: While the ribs are baking, blend the ketchup, chili sauce, brown sugar, dry mustard and 1/3 cup water in a large saucepan. Bring the mixture to a boil, stirring to dissolve the sugar, then remove from the heat.\nWhen the ribs are cooked and tender, remove them from the baking bag. Lower the oven temperature to 350 degrees F.\nBrush the ribs on both sides with the barbecue sauce and return them to the oven to bake, uncovered, for 30 minutes longer. Just before serving, throw the ribs under the broiler to give them a bit of a char.\n");
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
                System.out.println("Preheat the oven to 425 degrees F.\nIn a small bowl, mix together the olive oil, garlic, salt and pepper. Using a pastry brush, spread the mixture all over the pork shoulder.\nSet the meat on a rack set into a roasting pan. Roast for 20 minutes, and then reduce the heat to 325 degrees F. Continue to cook until an instant-read thermometer inserted into the shoulder reads 185 degrees F, about 4 hours. Remove the pork from the oven and let stand until cool enough to handle, about 30 minutes.\n");
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
            //   int appetizers = 0;
            //   int drinks = 0;
            //   int breakfast = 0;
            //   int desserts = 0;
            //   int soups = 0;
            //   int salads = 0;
            //   int breads = 0;
            //   int beef = 0;
            //   int chicken = 0;
            //   int pork = 0;

              
            //   for(int i = 0; i < ShoppingList.size(); i++)
            // {
            //   switch(ShoppingList.get(i).getName())
            //     {
            //       case "":
            //     }
                
            // }
              break;


//1 appetizer, 1 drink, 1 dessert, 2 breads, and 1 beef item. 
              
          }
      }while(option != 0);
    System.out.print("Shopping Cart: " );
    for(int i = 0; i < ShoppingList.size(); i++)
      {
        System.out.print(ShoppingList.get(i).getName() + ", ");
      }




    
  }

  
}