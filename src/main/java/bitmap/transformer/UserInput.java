package bitmap.transformer;

import java.util.Scanner;

public class UserInput {
  private static final int EXIT = 0;

  public static void userInput() {
    int choice;
    String userChoice = null;

    do {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Transformation Choices: \n" +
                             "---------------------------------\n" +
                             "0 : Exit\n" +
                             "1 : Purple-ize\n" +
                             "2 : Flip Horizontal\n" +
                             "3 : Flip Vertical\n");
      System.out.println("Enter a transformation type (enter a number only): ");
      try {
        userChoice = scnr.nextLine();
        choice = Integer.parseInt(userChoice);
        break;
      } catch (Exception e) {
        System.out.println("You did not enter a number, please try again\n");
      }
    } while (true);
    System.out.println();
    manipulateBitmap(choice);
  }

  public static void manipulateBitmap(int choice) {
    if (choice == EXIT) {
      return;
    } else {
      String inputFilePath = "./src/main/resources/Coffee.bmp";
      String outputFilePath = "./src/main/resources/";
      switch (choice) {
        case 1:
          String purpleFileName = "NewCoffeePurple.bmp";
          Bitmap purpleImage = new Bitmap(inputFilePath,outputFilePath, purpleFileName);

          purpleImage.readFile();
          purpleImage.purpleIze();
          purpleImage.saveFile();
          System.out.println("NewCoffeePurple.bmp created, viewable upon exit\n");
          break;
        case 2:
          String horizontalFileName = "NewCoffeeHorizontal.bmp";
          Bitmap horizontalImage = new Bitmap(inputFilePath,outputFilePath, horizontalFileName);

          horizontalImage.readFile();
          horizontalImage.imageFlipHorizontal();
          horizontalImage.saveFile();
          System.out.println("NewCoffeeHorizontal.bmp created, viewable upon exit\n");

          break;
        case 3:
          String verticalFileName = "NewCoffeeVertical.bmp";
          Bitmap verticalImage = new Bitmap(inputFilePath,outputFilePath, verticalFileName);

          verticalImage.readFile();
          verticalImage.imageFlipVertical();
          verticalImage.saveFile();
          System.out.println("NewCoffeeVertical.bmp created, viewable upon exit\n");

          break;
        default:
          System.out.println("\nNot a correct option\n");
          break;
      }
    }
    userInput();
  }
}
