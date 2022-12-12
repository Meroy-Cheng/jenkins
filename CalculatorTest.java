import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void addTest() {
    Calculator calculator = new Calculator();
    int ans = calculator.add(1, 5);
    assertEquals(6, ans);
  }
  @Test
  public void addTest() {
    Calculator calculator = new Calculator();
    int ans = calculator.minus(10, 5);
    assertEquals(5, ans);
  }
  @Test
  public void addTest() {
    Calculator calculator = new Calculator();
    int ans = calculator.multiplication(3, 5);
    assertEquals(15, ans);
  }
}
