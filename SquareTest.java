import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  void testColorable() {
    double side = 1.5;
    int actualCount = 0;
    int expectedCount = 3;
    
    //Create GeometricObject array for testing.  input the expected number of Squares/Colorable objects
    GeometricObject[] arr = new GeometricObject[5];
    
    arr[0] = new GeometricObject();
    arr[1] = new Square(side);
    arr[2] = new GeometricObject();
    arr[3] = new Square();
    arr[4] = new Square();
    
    //Increment through array and count actual number of Colorable objects
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] instanceof Colorable) {
        ((Colorable) arr[i]).howToColor();
        actualCount++;
      }
    }
    
    Assert.assertTrue(expectedCount == actualCount);
  }

}
