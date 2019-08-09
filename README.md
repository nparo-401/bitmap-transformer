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
  * readFile()
  * saveFile()
  * purpleIze()
  * imageFlipHorizontal()
  * imageFlipVertical()
* UserInput
  * userInput()
  * manipulateBitmap(int choice)
    
