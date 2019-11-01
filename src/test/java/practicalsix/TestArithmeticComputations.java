package practicalsix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import practicalsix.computation.IterativeFactorialComputation;
import practicalsix.computation.RecursiveFactorialComputation;

import java.util.Arrays;

/**
 * A JUnit test suite for the different ArithmeticComputation implementations.
 *
 * <p>Please note that the computational cost of a certain algorithm
 * may prevent the efficient testing of input values. Be careful!
 *
 * @author Gregory M. Kapfhammer
 */

public class TestArithmeticComputations {

  /** TODO: Create the two objects used in all of the test suites. */

  /** TODO: Add in at least one test case for the IterativeFactorialComputation. */

  @Test
  public void testIterativeFactorialZero() {
    assertEquals(iterativeFactorial.compute(0), 1);
  }

  @Test
  public void testIterativeFactorialOne() {
    assertEquals(iterativeFactorial.compute(1), 1);
  }

  @Test
  public void testIterativeFactorialFive() {
    assertEquals(iterativeFactorial.compute(5), 120);
  }

  /** TODO: Add in at least one test case for the RecursiveFactorialComputation. */

  /** TODO: Make sure that you check to see if these test cases are correct. */

  @Test
  public void testRecursiveFactorialZero() {
    assertEquals(recursiveFactorial.compute(0), 1);
  }

  @Test
  public void testRecursiveFactorialOne() {
    assertEquals(iterativeFactorial.compute(1), 1);
  }

  @Test
  public void testRecursiveFactorialFive() {
    assertEquals(iterativeFactorial.compute(5), 120);
  }

}
