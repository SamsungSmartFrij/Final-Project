//NAME
              System.out.println("NAME:");
              int nameint = scanner.nextInt();
              System.out.println("\n");
              //The sub categories
              switch(nameint)
              {
                case 1:
                  //category1
                System.out.println("RECIPE\n");
                  System.out.println("Do you want to add category1 to your list?\n 1 - Yes\n2 - No");
                  nameint = scanner.nextInt();
                    switch(nameint)
                    {
                      case 1: 
                        ShoppingList.add(new CLASSNAME("category1"));
                        System.out.println("\ncategory1 has been added to your list!\n");
                        break;
                        
                      default:
                        break;
                    }
                  break;

                case 2:
              }
              break;