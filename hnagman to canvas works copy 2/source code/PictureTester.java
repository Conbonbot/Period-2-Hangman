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
    Picture beach = new Picture("hangmannobackground.jpg");
	beach.explore();
    //beach.zeroRedGreen();
    beach.explore();
  }
//    public static void keepOnlyBlue()
//  {
//    Picture beach = new Picture("sunset.jpg");
//    beach.explore();
//    beach.zeroRedGreen();
//    beach.explore();
//    //Picture blue= beach.scale(1,1);
//    beach.write("allblue.jpg");
//  }
//   public static void negateAll()
//  {
//    Picture beach = new Picture("sunset.jpg");
//    //beach.explore();
//    beach.negate();
//    beach.explore();
//    //Picture blue= beach.scale(1,1);
//    beach.write("negative.jpg");
//  }
//   public static void grayScale()
//  {
//    Picture beach = new Picture("sunset.jpg");
//    //beach.explore();
//    beach.gray();
//    beach.explore();
//    //Picture blue= beach.scale(1,1);
//    beach.write("gray.jpg");
//  }
//
//  /** Method to test mirrorVertical */
//  public static void testMirrorVertical()
//  {
//    Picture caterpillar = new Picture("caterpillar.jpg");
//    caterpillar.explore();
//    caterpillar.mirrorVertical();
//    caterpillar.explore();
//  }
//
//  /** Method to test mirrorTemple */
//  public static void testMirrorTemple()
//  {
//    Picture temple = new Picture("temple.jpg");
//    temple.explore();
//    temple.mirrorTemple();
//    temple.explore();
//  }
//
//  /** Method to test the collage method */
//  public static void testCollage()
//  {
//    Picture canvas = new Picture("640x480.jpg");
//    canvas.createCollage();
//    canvas.explore();
//  }
//
//  /** Method to test edgeDetection */
//  public static void testEdgeDetection()
//  {
//    Picture swan = new Picture("swan.jpg");
//    swan.edgeDetection(10);
//    swan.explore();
//  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//keepOnlyBlue();
	//negateAll();
	//grayScale();
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
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