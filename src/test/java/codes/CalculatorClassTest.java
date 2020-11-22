package codes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorClassTest {
  CalculatorClass calculator;
  int[] list;
  @Before
  public void setUp() throws Exception
  {
    calculator = new CalculatorClass();
    list = new int[]{2,1,4,5,3};
  }
  @Test
  //@Ignore
  public void testSum() {
    // Given
    //Calculator calculator = new Calculator();
    // When
    int result = calculator.sum(3, 3);
    // Then
//		if (result != 4) {   // if 2 + 2 != 4
//			Assert.fail();
//		}
    org.junit.Assert.assertEquals(6,result);

  }

  @Test
  public void testMinus() {
    //Calculator calculator = new Calculator();
    Assert.assertEquals(0, calculator.minus(2, 2));
  }

  @Test
  public void testDivide() {
    //Calculator calculator = new Calculator();
    Assert.assertEquals(2, calculator.divide(6, 3));
  }

  @Test
  public void testMultiply()
  {
    //Calculator calculator = new Calculator();
    org.junit.Assert.assertEquals(12,calculator.multiply(3,4));
  }
  @Test
  public void testMin()
  {
    int result = calculator.min(2,3);
    if (result != 2)
    {
      Assert.fail();
    }
    //Assert.assertEquals(2,calculator.min(2,3));
  }
  @Test
  public void testMax()
  {
    int result = calculator.max(3,5);
    if (result != 5)
    {
      Assert.fail();
    }
  }
  @Test
  public void testMinElement()
  {
    //calculator.minElement(list);
    Assert.assertEquals(1,calculator.minElement(list));
    System.out.println(calculator.minElement(list));
  }
  @Test
  public void testMaxElement()
  {
    Assert.assertEquals(5,calculator.maxElement(list));
    System.out.println("le max est "+calculator.maxElement(list));
  }

  @Test(expected = ArithmeticException.class)
  public void testDivideWillThrowExceptionWhenDivideOnZero() {
    //Calculator calculator = new Calculator();
    calculator.divide(6, 0);
  }
}
