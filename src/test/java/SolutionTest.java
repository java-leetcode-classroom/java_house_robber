import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void robExample1() {
    assertEquals(4, sol.rob(new int[]{1,2,3,1}));
  }
  @Test
  void robExample2() {
    assertEquals(12, sol.rob(new int[]{2,7,9,3,1}));
  }
}