# Bitmap Transformer

## Table of Contents
* [Team](#team)
* [Resources](#resources)
* [Files](#files)
* [Methods](#methods)

<a name="team"></a>
### Team
* Bomi Bear
* Nicholas Paro

<a name="resources"></a>
### Resources
* [Save BufferedImage](https://stackoverflow.com/questions/12674064/how-to-save-a-bufferedimage-as-a-file)
* [Read and Write an Image](https://javaconceptoftheday.com/read-and-write-images-in-java/)
* [User Input](https://stackoverflow.com/questions/5333110/checking-input-type-how)
* [Color Manipulation](http://www.java2s.com/Tutorials/Java/Graphics_How_to/Image/Load_a_bitmap_image_and_manipulate_individual_pixels.htm)
* [Flip an Image](https://www.youtube.com/watch?v=HJXl2hmapdo)

<a name="files"></a>
### Files
* src/main
  * /java
    * [App.java]("src/main/java/bitmap.transformer/App.java")
    * [Bitmap.java]("src/main/java/bitmap.transformer/Bitmap.java")
    * [UserInput.java](src/main/java/bitmap.transformer/UserInput.java)
  * /resources
    * [Coffee.bmp](src/main/resources/Coffee.bmp)
    * [NewCoffeePurple.bmp](src/main/resources/NewCoffeePurple.bmp)
    * [NewCoffeeHorizontal.bmp](src/main/resources/NewCoffeeHorizontal.bmp)
    * [NewCoffeeVertical.bmp](src/main/resources/NewCoffeeVertical.bmp)
* src/test
  * [BitmapTest.java]("src/main/java/bitmap.transformer/BitmapTest.java")

<a name="methods"></a>
### Methods
* App
  * main()
* Bitmap
  * Bitmap(String inputFilePath, String outputFilePath, String
    newFileName)
    * Class constructor to set the values of the Bitmap 
  * readFile()
    * Opens and reads the bitmap file. Uses a `try{} catch{}` to read
      the file and catch any stack trace errors
  * saveFile()
    * Saves the bitmap file to the new filepath and filename
  * purpleIze()
    * Changes the color of every pixel to the hex color: #301d57
  * imageFlipHorizontal()
    * Flips the image along the horizontal center line
  * imageFlipVertical()
    * Flips the image along the vertical center line
* UserInput
  * userInput()
    * Outputs a message to the user and allows the user to choose from a
      list of transformation options.
    * Uses a `try{} catch{}` to ensure the user input is an integer
    * When a valid choice is made, calls the `manipulateBitmap(choice)`
  * manipulateBitmap(int choice)
    * Checks if user choice is the exit code - if so, ends the
      application
    * Otherwise: begins initializing a new Bitmap class
      * Uses a switch statement to give the class the correct file name
        and transformation calls
    
