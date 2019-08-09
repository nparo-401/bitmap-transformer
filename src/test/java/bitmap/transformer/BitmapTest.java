package bitmap.transformer;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitmapTest {
  String inputFilePath = "./src/main/resources/Coffee.bmp";
  String outputFilePath = "./src/main/resources/";
  String purpleFileName = "NewCoffeePurple.bmp";
  Bitmap testFile = new Bitmap(inputFilePath,outputFilePath, purpleFileName);

  @Test
  public void testReadFile() {
    assertEquals("File not found", true, testFile.readFile());
  }

  @Test
  public void testSaveFile() {
    testFile.readFile();
    assertEquals("File not saved", true, testFile.saveFile());
  }

  @Test
  public void testPurpleIze() {
    testFile.readFile();
    assertEquals("Return: RGB(48, 29, 87)", -13623977, testFile.purpleIze());
  }

  @Test
  public void testImageFlipHorizontal() {
    testFile.readFile();
    int lastRGBVal = -13762560;
    assertEquals("File not flipped horizontally", lastRGBVal, testFile.imageFlipHorizontal());
  }

  @Test
  public void testImageFlipVertical() {
    testFile.readFile();
    int lastRGBVal = -16777216;
    assertEquals("File not flipped vertically", lastRGBVal, testFile.imageFlipVertical());
  }
}