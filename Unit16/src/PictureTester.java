/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("src/images/beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore(); 
  }
  
  public static void testNegate() {
	  Picture beach = new Picture("src/images/beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore(); 
  }
  
  public static void testGrayscale() {
	  Picture beach = new Picture("src/images/beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore(); 
  }
  
  public static void testFixUnderwater() {
	  Picture water = new Picture("src/images/water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRighttoLeft()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRighttoLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture bike = new Picture("src/images/redMotorcycle.jpg");
    bike.explore();
    bike.mirrorHorizontal();
    bike.explore();
  }
  
  public static void testMirrorHorizontalBottoTop()
  {
    Picture bike = new Picture("src/images/redMotorcycle.jpg");
    bike.explore();
    bike.mirrorHorizontalBottoTop();
    bike.explore();
  }
  
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("src/images/beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore(); 
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms() {
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("src/images/seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	  Picture canvas = new Picture("src/images/640x480.jpg");
	  canvas.createCoolerCollage();
	  canvas.explore(); 
  }
  
  public static void testMyCollage() {
	  Picture canvas = new Picture("src/images/640x480.jpg");
	  canvas.createMyCollage();
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	  Picture swan = new Picture("src/images/swan.jpg");
	  swan.explore();
	  swan.edgeDetection2(10);
	  swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRighttoLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBottoTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testMyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}